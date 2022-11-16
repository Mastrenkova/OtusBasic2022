import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class bubbleSort {
	static List<Integer> list = new ArrayList<>();

	static void createList() {
		Random id = new Random();
		for (int i = 0; i < 1000; i++) {
			list.add(id.nextInt(1000));
		}
	}

	public static List<Integer> bubbleSort() {
		Integer temp;
		boolean sorted = false;
		createList();
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					sorted = false;
				}
			}
		}
		return list;
	}

	public static List<Integer> collectionSort() {
		Collections.sort(list);
		return list;
	}

	public static void time() {
		
		long startTimeBubbleSort = System.currentTimeMillis();
		bubbleSort();
		long endTimeBubbleSort = System.currentTimeMillis();
		System.out.println("Sum BubbleSort: " + (endTimeBubbleSort - startTimeBubbleSort) + " milliseconds");

		long startTimeCollectionSort = System.currentTimeMillis();
		collectionSort();
		long endTimeCollectionSort = System.currentTimeMillis();
		System.out.println("Sum CollectionSort: " + (endTimeCollectionSort - startTimeCollectionSort) + " milliseconds");
	}

	public static void main(String args[]) {
		System.out.println(bubbleSort());
		System.out.println(collectionSort());
		time();

	}
}