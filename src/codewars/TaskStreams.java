package codewars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStreams {

    public static void main(String[] args) {
//        System.out.println(findError("aaaaaaaafaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
//        String s = "bbdfdfd";
//        String p = s.replace("bf","#");
//        System.out.println(p);
//        System.out.println(samouczek());
//        System.out.println(missing());
        System.out.println(camelCase("P-mi-ni-mu"));
        System.out.println(camelCase(""));

    }

    private static String findError(String s){
        char[] characters = s.toCharArray();
        int [] charCode = new int [characters.length];
        for (int i = 0; i< charCode.length; i++){
            charCode[i] = (int) characters[i];
        }
        long error_size = Arrays.stream(charCode)
                .filter(e -> ! (e < 109 && e > 96))
                .count();

        return error_size + "/" + characters.length;
    }

    private static boolean panadram(String s){


    return true;
    }

    private static List<String> samouczek(){
        List<String> list = List.of("iooio", "iiiiiiiiiii", "kk", "ioio");
//        list.sort((a,b) -> a.length() - b.length());
        List<String> ii = list.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> oo = list.stream()
//                .sorted(Comparator.comparing(String::length))
                .sorted(Comparator.comparing(s -> s.length()))
                .collect(Collectors.toList());
        return oo;
    }

    private static int missing(){
        int [] numbers = {-1,2,5,6};  //1
        Arrays.sort(numbers);
        int [] sorted = Arrays.stream(numbers)
                .sorted()
                .toArray();

        int missing = 0;

        for(int i = 1; i < sorted.length ; i++){
            if(sorted[i-1] + 1 != sorted[i]){
                if(sorted[i-1] < 0){
                    return missing = 1;
                }
                missing = sorted[i-1] + 1;
            }
        }
        return missing;
    }

    private static int missing2(){
        int [] n = {-6, -91, 84, 106, 200};
        Arrays.sort(n);
        int missing = 0;
        for(int i = n.length-1; i > 0; i--){
            if(n[i] % 4 == 0){
                missing = n[i];
            }
        }
        return missing;
    }

    private static String camelCase(String str){
//        if(Objects.equals(s, "")){ // s == null is different case
//            return "";
//        }
//        char [] charsArray = s.toCharArray();
//        StringBuilder sbf = new StringBuilder("");
//        char character;
//        charsArray[0] = !Character.isUpperCase(charsArray[0]) ? charsArray[0] : Character.toUpperCase(charsArray[0]);
//        sbf.append(charsArray[0]);
//        for(int i = 1; i < charsArray.length; i++){
//            if(charsArray[i] == '-' || charsArray[i] == '_'){
//                character = Character.toUpperCase(charsArray[i+1]);
//                i++;
//            }else{
//                character = charsArray[i];
//            }
//            sbf.append(character);
//        }
//        return sbf.toString();

//        String[] words = str.split("[-_]");
        String[] words = str.split("[-_]");
        for(String o : words){
            System.out.println("io " + o);
        }
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
}
