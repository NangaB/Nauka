public class NiceMethodsOnString {



    public static void main(String[] args) {
//        String s1 = "hello";  //added to string pool
//        String s2 = new String("hello"); // not added to string pool
//        s2.intern();  // do nothing! - it should be assigned to some value to make it works
//
//        //s3 = s2.intern() S3 is added to string pool is assigned to s3 and as it is the same as
//        // s2, and has the same reference as s1 (stringpool mechanizm) (they are equal)
//        String s3 = s2.intern();
//        System.out.println(s1 == s2); //false
//        System.out.println(s1 == s3); //true
//
//        String str = null;
//        System.out.println(str = null);
//        System.out.println(str.toString());



//        System.out.println(s3);
        String s = "test";
        StringBuffer s2 = new StringBuffer(s);
        System.out.println(s.equals(s2));


    }

    public static void go(Long n){
        System.out.println("Long ");
    }
    public static void go(Short n){
        System.out.println("short: ");
    }
    public static void go(int n){
        System.out.println("int ");
    }

}
