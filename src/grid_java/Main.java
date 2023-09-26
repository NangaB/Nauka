package grid_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testString1();
        testSnippet10();
    }

    public static void testString1(){
        String s1 = "String";
        String s2 = new String("String");
        if(s1 == s2){
            System.out.println("1");
        }
        if(s1.equals(s2)){
            System.out.println("2");
        }
        if(s1 == s1){
            System.out.println("3");
        }
        if(s1.equals(s2)){
            System.out.println("4");
        }
    }

    public static void testSnippet10(){
        Integer x = 100;
        add5(x);
        System.out.println(x);

    }

    public static void add5(Integer x){
        x += 5;
    }

    public static void carTest(){
        //Map<String, Car> cars =
    }

    public static void numberBuffertest(){
        final List<Long> numbers = new ArrayList<>();

    }



}
