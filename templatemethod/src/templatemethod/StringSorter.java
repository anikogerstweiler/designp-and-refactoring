package templatemethod;

public class StringSorter extends Sorter<String>{

	@Override
	protected int compare(String t1, String t2) {
		return t1.compareTo(t2);
	}

}
