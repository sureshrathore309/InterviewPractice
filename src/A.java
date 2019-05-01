
public class A {
	protected void m1() {
		System.out.println("M1");
	}
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("M2");
	}
}

class Test {
	public static void main(String[] args) {

	}
}