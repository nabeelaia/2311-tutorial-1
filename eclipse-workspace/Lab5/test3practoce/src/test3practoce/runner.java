package test3practoce;
import java.util.HashSet;
import java.util.TreeSet;
public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Circle1 C1= new Circle1(2,3,4); //12
Circle1 C3= C1;
	Circle1 C2= new Circle1 (20,10,40); //200
	TreeSet<Circle1> aset = new TreeSet<>();
	aset.add(C2);
	aset.add(C1);
	//aset.add(C3);
	System.out.println(aset);
	
	//System.out.println(aset.size());
	System.out.println(C1.hashCode());
	System.out.println(C2.hashCode());
	//System.out.println(C3.hashCode());
	}
}
