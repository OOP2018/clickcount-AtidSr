package counter;

import java.util.Scanner;
/**
 * A class for test observer pattern 
 * 
 */
public class observerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Counter counter = new Counter();
		CounterView view = new CounterView(counter);
		counter.addObserver(view);

		while(true) {
			System.out.println("How much");
			int howmuch = sc.nextInt();
			counter.add(howmuch);
		}
	}
}
