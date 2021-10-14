import java.util.Iterator;
import java.util.Vector;

public class DsVector {
	public static void main(String [] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		v.add("Amit");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
