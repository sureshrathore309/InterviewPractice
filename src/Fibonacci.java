import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
    	System.out.println(fibonacci(4));
    }
    
    public static List<Integer> fibonacci(int n){

    	List<Integer> list = new ArrayList<>();
        int t1 = 0, t2 = 1;
        list.add(0);
        list.add(1);
        for (int i = 1; i <n-1; i++)
        {
            int sum = t1 + t2;   
            t1 = t2;
            t2 = sum;
        	list.add(sum);
        }
        return list;

    }
}