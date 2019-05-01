
public class Demo1 {
	public static void main (String []args) {
		try {
			throw new NullPointerException();
		}
		catch (Exception e) {
			System.out.println("ss");
			throw new RuntimeException("aaa");
		}
		finally {
			throw new ClassCastException("hellow");
		}
	}
}