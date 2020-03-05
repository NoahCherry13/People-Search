
public class Search<T extends Comparable<T>> {

	private NoahList<T> arr;
	private int count = 0;

	public Search(NoahList<T> list) {
		arr = list;
	}

	public T binarySearch(T item) throws NullPointerException {
		count = 0;
		int f = 0;
		int end = arr.size()-1;
		int n = arr.size() / 2;

		while (f <= end) {
			count++;
			if (arr.get(n).compareTo(item) < 0) {
				f = n + 1;
			} else if (arr.get(n).compareTo(item) > 0) {
				end = n - 1;
			} else {
				return arr.get(n);
			}
			n = ((f + end) / 2);
		}
		throw new NullPointerException("Item Not in List");
	}

	public T linearSearch(T item) throws NullPointerException {
		count = 0;
		for (int i = 0;i<arr.size();i++) {
			count++;
			if (arr.get(i).compareTo(item) == 0) {
				return arr.get(i);
			}
		}
		throw new NullPointerException("Item Not Found");
	}

	public int getCount() {
		return count;
	}
}
