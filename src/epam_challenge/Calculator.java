package epam_challenge;

public class Calculator {
        // then we create functions add, subtract, multiply and divide
        public int add(int a, int b){
            return a+b;
        }

        public int subtract(int a, int b){
            return a-b;
        }

        public int multiply(int a, int b){
            return a*b;
        }

        public int divide(int a, int b){
            if(b == 0) return 0;
            return a/b;
        }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(3,4));
        System.out.println(c.divide(8,3));
    }
}
