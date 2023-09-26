package motorolatasks;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int [] arrays = {6,-3, 1, 2, 3, 4, 5, 6};
        System.out.println(function(arrays));
        System.out.println(min(arrays));

    }

    public static int function(int [] arr){
        Arrays.sort(arr);
        int value = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > 0 && arr[i + 1] - arr[i] != 1 ) {
                value = arr[i] + 1;
                break;
            }
        }
        return value;
    }

    public static int min (int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }


}
