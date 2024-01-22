package practice;

import java.util.ArrayList;

public class runner {

	public static void main(String[] args) {
		ArrayList<String> aset= new ArrayList<>();
		aset.add("Reading");
		aset.add("writing");
		tasks id1 = new tasks("AAA", aset);
		tasks id2 = new tasks("BBB",aset);
	}

}
