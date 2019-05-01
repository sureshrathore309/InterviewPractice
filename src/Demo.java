import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MyThread extends Thread{
	MyThread(){
		System.out.println("My Thread");
	}
	public void run() {
		System.out.println(" bar");
	}
	public void run(String s) {
		System.out.println(" baz");
	}
}
public class Demo {
	
	public static void main (String []args) {
		Thread t = new MyThread() {
			public void run() {
				System.out.println("foo");
			}
		};
		t.start();
	}
}
