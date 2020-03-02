import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class NoahList<T> implements List<T>{

	private Object[] elementData;
	private int size = 0;
	private static final byte INITIAL_CAPACITY = 10;
	
	public NoahList() {
		elementData = new Object[INITIAL_CAPACITY];
	}
	
	public NoahList(Object[] arr) {
		elementData = arr;
		size = elementData.length;
	}
	
	public NoahList(List<T> list) {
		elementData = list.toArray();
		size = list.size();
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		for (Object a: elementData) {
			return a.equals(o);
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return Arrays.copyOf(elementData, size);
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T t) {
		if(size == elementData.length) {
			size++;
			elementData = Arrays.copyOf(elementData, size);
		}
		elementData[size-1] = t;
		return true;
	}

	public int indexOf(Object o)throws NullPointerException {
		int count = 0;
		if(!contains(o)) {
			throw new NullPointerException("No Instance of this Object");
		}
		for (Object a: elementData) {
			if (o.equals(a)) {
				return count;
			}
			count++;
		}
		return count;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		elementData = new Object[INITIAL_CAPACITY];
		size = 0;
		
	}

	@Override
	public T get(int index) {
		return (T) elementData[index-1];
	}

	@Override
	public Object set(int index, Object element) {
		elementData[index-1] = element;
		return null;
	}

	@Override
	public void add(int index, Object element) {
		Object[] temp = elementData;
		size++;
		elementData = new Object[size];
		for (int i = 0; i< index-1; i ++) {
			elementData[i] = temp[i];
		}
		elementData[index-1] = element;
		for (int i = 0; i>index - 1; i++) {
			elementData[i+1] = temp[i];
		}
		
	}

	@Override
	public T remove(int index) {
		remove(elementData[index-1]);
		return (T) (elementData[index-1]);
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		boolean found = false;
		Object[] temp = elementData;
		size--;
		elementData = new Object[size];
		for (int i =0; i <size;i++) {
			if (i == indexOf(o)) {
				continue;
			}else if (!found){
				elementData[i] = temp[i];
			}else {
				elementData[i-1] = temp[i];
			}
		}
		return false;
	}

}
