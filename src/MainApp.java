import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {
		String str="SureSh";
		char[] sa = str.toCharArray();

		List<Character> listC = new ArrayList<Character>();
		for (char c : sa) {
			listC.add(c);
		}
		List distinctElements = listC.stream().filter(distinctByKey(p -> p)).collect(Collectors.toList());
		System.out.println('"'+str+'"'+" has "+distinctElements.size()+" distinct characters.");
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}