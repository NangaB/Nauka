package grid;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        min2();
//        getFContintentImperative().forEach(System.out::println);
//        filter().forEach(System.out::println);
        sort().forEach(System.out::println);
        System.out.println(allMatch1());
        System.out.println(allMatch2());
//        grouping().forEach();

//        map().forEach(System.out::println);
//        flatMap().forEach(System.out::println);
//        reduce();
//        System.out.println("-------------------");
//        comparingLists();
//        comparingListsNotFlat();
//        System.out.println("--------------");
//        epamTask();
        streamForPrimitives();

    }
    //filter
    //sort
    //all match
    //any match
    //map -- use only for transormating data -- as an resutl we also get Stream -- perform One to One operation
    //flatMap --u use for transormating data and flattering  -- as an resutl we also get Stream -- perform One to Many operation
    // flatMap conver Steam of Stream into one Stream.
    //groupby
    //reduce   - agragating data -- combine stream of elements and produce one output

    private static List<Continent> getFContintentImperative(){

        List<Continent> fContinent = new ArrayList<>();
        for(Continent c : getContinents()){
            if(c.getGender().equals("F")){
                fContinent.add(c);
            }
        }
        return fContinent;
    }

    private static List<Continent> filter(){
        return getContinents().stream()
                .filter(e -> e.getGender().equals("F"))
                .collect(Collectors.toList());
    }

    private static List<Continent> sort(){
        return getContinents().stream()
                .sorted(Comparator.comparing(c -> c.getYears()))
//                .sorted(Comparator.comparing(Continent::getYears).reversed())
                .collect(Collectors.toList());
    }

    private static boolean allMatch1(){ // return true if all elements match
        return getContinents().stream()
                .allMatch(c -> c.getGender().equals("F"));
    }

    private static boolean allMatch2(){
        return getContinents().stream()
                .allMatch(c -> c.getYears() < 1);
    }

    private static void min(){
        getContinents().stream()
                .min(Comparator.comparing(Continent::getYears)) //returns Optional becouse it may not find minInCollection
                .ifPresent(c -> System.out.println(c)); //what if presents returns?
    }

    private static void min2(){
        Integer [] arr = {1,2,3,4,5};
        int min =  Arrays.stream(arr)
                .mapToInt(e->e)
                .min()
                .getAsInt();
        Continent [] c = {new Continent("ff", 8, "G"),
        new Continent("Europ", 9,"g")};

        Arrays.stream(c)
                .min(Comparator.comparing(Continent::getYears))
                .ifPresent(e->System.out.println(e.continentName));
    }

    private static Map<String, List<Continent>> grouping(){
        Map<String, List<Continent>> grouped = getContinents().stream()
                .collect(Collectors.groupingBy(c -> c.getGender()));
        return grouped;
    }

    private static List<Continent> getContinents(){
        return List.of(
                new Continent("Europa", 8, "F"),
                new Continent("Azja", 9, "M"),
                new Continent("Afryka", 10, "F"),
                new Continent("Europa", 1, "F"),
                new Continent("Europa", 5, "M")
        );
    }

    private static List<Continent> map(){
        //get all countreis from getcontinetnList
        List<Country> countries = List.of(
                new Country("poland", new Continent("Europa")),
                new Country("egipt", new Continent("Afryka")),
                new Country("japonia", new Continent("Azja"))
        );

        // Lict<Countr> consert to List<Continent> -- transformation
        // one to one operation -- one contry has one continent
        List<Continent> continents = countries.stream()
                .map(c -> c.getContinentName()).collect(Collectors.toList());
        return continents;
    }



    private static List<String> flatMap(){
        //get all numbers from getcontinetnList
        List<Country> countries = List.of(
                new Country("poland", List.of("2", "14")),
                new Country("holand", List.of("1", "15"))
        );

        // Lict<Countr> consert to List<List<String>> --- simply map() function
        // one to many operation -- one contry has two numbers
        List<List<String>> numbers = countries.stream().map(c -> c.getTwoNumbers()).collect(Collectors.toList());

        //using flatMap
        // List<Country> convert to List<String>
        List<String> numberss = countries.stream().flatMap(c->c.getTwoNumbers().stream())
                .collect(Collectors.toList());

        return numberss;
    }

    private static void reduce(){

        List<Integer> numbers = List.of(2,3,4,7,8,1);

        List<String> words = Arrays.asList("java", "spring", "hibernate");
        // sum
        // 1*
        int sum = 0;
        for(Integer i : numbers){
            sum = sum + i;
        }

        //2*   using reduce(identity, binary operator)
        int sum2 = numbers.stream().reduce(0,(a,b) -> a+b);
        // pierwszy argument --identity, to jest wartośc początkowa
        System.out.println(sum2);

        // usign reduce (BinaryOperator) result is Optional
        Optional<Integer> sum2withStar = numbers.stream().reduce(Integer::sum);
        System.out.println(sum2withStar.get());


        //3 min and max value
        Integer min1 = numbers.stream().reduce(0, (a,b) -> a < b ? a : b);
        System.out.println(min1);

        Optional<Integer> min2 = numbers.stream().reduce(Integer::min);
        System.out.println(min2.get());

        // 3 longest word
        Optional<String> longes = words.stream().reduce((a,b) -> a.length() > b.length() ? a : b );
        System.out.println(longes.get());


        //4 find avarage salary for people with grade A
        List<Person> personList = List.of(
                new Person(101,"adam", "A", 1000),
                new Person(102,"Basia", "B", 1000),
                new Person(103,"Kasia", "C", 1000),
                new Person(104,"wojtek", "A", 1000)
        );

        //get A grade people
        // get salary (only salary, not whole Person -> map method)
        double avarage = personList.stream()
                .filter(e -> e.getGrade().equals("A"))
                .map(e -> e.getSalary())
                .mapToDouble(s->s)
                .average()
                .getAsDouble();

    }

    private static void comparingLists(){
        List<String> list1 = Arrays.asList("Adam", "Barte", "Kasia", "Basia");
        List<String> list2 = Arrays.asList("Adam", "Barte1", "Kasia", "Basia1");

        //elements that are not the same in lists
        List<String> newList = list1.stream()
                .filter(e -> !(list2.contains(e)))
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

    private static void comparingListsNotFlat(){
        List<String> list1 = Arrays.asList("Adam", "Barte", "Kasia", "Basia");
        List<String> listA = Arrays.asList("Beata", "Barte1");
        List<String> listB = Arrays.asList("Adam", "Barte1");
        List<String> listC = Arrays.asList("Wojdetk", "Barte1");
        List<List<String>> list2 = Arrays.asList(listA, listB, listC);

        List<String> listAgregated = list2.stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());

        List<String> newList = list1.stream()
                .filter(e -> listAgregated.contains(e))
                .collect(Collectors.toList());
    }

    private static void streamForPrimitives(){
        int [] ar = {4, 6, 78, 9, 0};
        //find min value using stream

        Integer [] arr = {9, 0, 9, 0};
//        int p = Arrays.stream(arr)



        int min = Arrays.stream(ar)
                .min()
                .getAsInt();

        //minimal value for what name

        System.out.println("Minimal value: ");
        System.out.println(min);
    }


    private static void epamTask(){
        int[] numbers1 = {2, 4, 6, 7, 8};
        int [][] numbers2 = {{1, 2}, {5, 6}, {8, 5}};

        // stream for primitive(int) Array
        IntStream numbers1Stream = Arrays.stream(numbers1);
        IntStream numbers2Stream = Arrays.stream(numbers2).flatMapToInt(i -> Arrays.stream(i));

        Stream<Integer> numberStream11 = numbers1Stream.boxed();
        Stream<Integer> numberStream22 = numbers2Stream.boxed();

        List<Integer> numbers22= numberStream22.collect(Collectors.toList());
        List<Integer> common = numberStream11.filter(e -> numbers22.contains(e))
                .collect(Collectors.toList());

        common.forEach(System.out::println);

        //for Integer [] example we may use:   Stream<Integer> a = Arrays.stream(example) or
        //Stream <Integer> b = Stream.of(example)
    }





}
