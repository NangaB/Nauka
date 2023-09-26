package epam_challenge;

public class Sum {
    public static void main (String[] args) throws java.lang.Exception
    {
        // you should code solution in this editor
        // go ahead and try to solve the problem or uncomment solution below

     java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
     String s;
     Integer sumOfTwoNumbers;

    // first we read string from the standard input
     s=r.readLine();

    // next we separate the input into two numbers
     String[] numbers = s.split(" ");

    // then we solve assignment calculating the sum
    // we are going to store it variable sumOfTwoNumbers
     sumOfTwoNumbers = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

    // finally we return result to the standard output
     System.out.println(sumOfTwoNumbers);

    }




}
