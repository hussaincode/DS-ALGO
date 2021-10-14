import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListUniqueValueInsertionOrder {

	public static void main(String[] args) {
		 // Creating an arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
  
        // adding elements to arrayList
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(100);
        arrayList.add(500);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(200);
        arrayList.add(600);
  
        // creating an LinkedHashSet and
        // adding arrayList elements to linkedHashSet
        LinkedHashSet<Integer> set
            = new LinkedHashSet<>(arrayList);
  
        System.out.println(
            "Unique values in inserted order");
        System.out.println(set);

	}

}
