package grid;

import java.util.ArrayList;
import java.util.List;

public class NumberBuffer {
    private final List<Long> numbers = new ArrayList<>();

    public static void main(String[] args) {
        NumberBuffer n = new NumberBuffer();
        n.run(10L);
    }
    public void run (Long n){
        for(int i = 0; i <= n; i++){
            numbers.add(n);
            if(numbers.size()>10){
                System.out.println(numbers);
//                numbers = new ArrayList<>();
            }
        }
    }
}
