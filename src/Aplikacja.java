import java.util.List;

public class Aplikacja {

    public static void main(String[] args) {
            String a = "abc";
            String b = new String("abc");
            String c = "abc";
            System.out.println(a == b); //false
            System.out.println(a.equals(b)); //true
            System.out.println(a == c); //true
            System.out.println(a.equals(c)); //true



//            Kocur k = new Kocur(); //UserDate
//            Kot kot = new Kot();
//            kot.dzwiek = "miał";
//            Kot kott = new Kot();
//            kott.dzwiek = "miał miał miał";
//            List<Kot> kotList = List.of(kot, kott);
//            k.setKotList(kotList);
//
//            List<Zwierz> kotListt = List.of(kot, kott);
//            Kocur.aa(kotListt);
//
//            Psior p = new Psior();
//            Pies pies = new Pies();
//            pies.co = "aaaa";
//            List<Pies> piesList = List.of(pies);
//            List<Zwierz> piesListt = List.of(pies);
//
//            Psior.aa(piesListt);
////            Psior.aa(piesList);
//
//
//            // list = {{"adam", 10}, {"leon", 3}, {"grześ", 19}}
//
//            Person[] persons = {new Person("adam", 10), new Person("grześ",11), new Person("irek", 8)};
//
//            Person max = persons[0];
//            for(int i = 1; i < persons.length; i++){
//                    if(persons[i].age > max.age){
//                            max = persons[i];
//                    }
//            }
//            System.out.println("Olders is " + max.name + " and he is " + max.age);

    }
}
