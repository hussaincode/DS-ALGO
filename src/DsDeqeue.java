import java.util.ArrayDeque;
import java.util.Deque;

public class DsDeqeue {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
	}

}
