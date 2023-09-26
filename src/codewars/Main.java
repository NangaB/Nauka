package codewars;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution1(10));
        System.out.println(solution2("ktotojesttaki"));
        System.out.println(solution2("1"));
    }

    public static int solution1(int number) {
        int sum = 0;
        for(int i = number - 1; i > 0; i--){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
                System.out.println(sum);
            }

        }
        return sum;
    }

    public static String solution2(String str) {
        String result = "";
        if(str.length() > 4) {
            for (int i = 0; i < str.length() - 4; i++) {
                result += "#";
            }
            result += str.substring(str.length() - 4);
        }else{
            return str;
        }
        return result;

//        private static final String MASK_CHAR = "#";
//        private static final int UNMASK_COUNT = 4;
//
//        public static String maskify(String str) {
//            int len = str.length();
//            if (len <= UNMASK_COUNT) {
//                return str;
//            }
//            int maskCount = len - UNMASK_COUNT;
//            return String.join("", Collections.nCopies(maskCount, MASK_CHAR))
//                    + str.substring(maskCount);
//        }

    }
}
