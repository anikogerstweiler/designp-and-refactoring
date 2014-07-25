package templatemethod;

import java.util.Collections;
import java.util.List;

public abstract class Sorter<T> {
	
	public void sort(List<T> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (compare(list.get(j), list.get(j + 1)) > 0) {
					Collections.swap(list, j, j + 1);
				}
			}
		}
	}
	
	protected abstract int compare(T t1, T t2) ;
}
