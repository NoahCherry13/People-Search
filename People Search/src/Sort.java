
public class Sort {
	
	private NoahList<People> list;
	
	public Sort(NoahList<People> a) {
		list  = a;
	}
	
	public void populateNames(NoahList<People> arr) {
		for(People p: arr) {
			
		}
	}
	
	public NoahList<People> sort() {
		int n = list.size();

		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if ((list.get(j)).getName().toLowerCase()
						.compareTo((list.get(min_idx)).getName().toLowerCase()) < 0) {
					min_idx = j;
				}
			}

			People temp = (People) list.get(min_idx);
			list.set(min_idx, list.get(i));
			list.set(i, temp);
		}
		return list;
	}
	
}
