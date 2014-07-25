package templatemethod;

public class IntegerSorter extends Sorter<Integer>{

	@Override
	protected int compare(Integer t1, Integer t2) {
		return t1 - t2;
	}

}
