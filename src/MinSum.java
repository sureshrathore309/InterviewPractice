import java.util.ArrayList;
import java.util.List;

public class MinSum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(7);
		System.out.println(minSum(list, 4));
	}

	public static int minSum(List<Integer> list, int k) {
		int b=0;
		for (int a = 0; a < k; a++) {
			int i = 0;
			if (b==k)
				break;
			for (int n : list) {
				list.set(i, Math.round(n / 2f));
				i++;
				if (b==k)
					break;
				b++;
			}
		}		
		return list.stream().filter(i -> i > 0).mapToInt(i -> i).sum(); 
	}
}