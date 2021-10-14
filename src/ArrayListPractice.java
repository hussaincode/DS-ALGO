import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		  ArrayList<String> al = new ArrayList<String>();
	        al.add("practice.geeksforgeeks.org");
	        al.add("quiz.geeksforgeeks.org");
	        al.add("code.geeksforgeeks.org");
	        
	        for(String str: al) {
	        	System.out.println(str);
	        }
	        Collections.sort(al);
	        System.out.println(al);
	        Collections.reverse(al);
	        System.out.println(al);
	        Collections.sort(al,
                    Collections.reverseOrder());

   System.out.println(
       "Modified ArrayList : \n" + al);

	}

}
