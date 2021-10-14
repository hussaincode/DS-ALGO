import java.util.ArrayList;
import java.util.Iterator;

public class ArrayAddingandRemoving {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
        System.out.println("Initial list of elements: "+al);  
        //Adding elements to the end of the list  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ajay");  
        System.out.println("After invoking add(E e) method: "+al);  
        //Adding an element at the specific position  
        al.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+al);  
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add("Sonoo");  
        al2.add("Hanumat");  
        //Adding second list elements to the first list  
        al.addAll(al2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
        ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        al.addAll(1, al3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al); 

        //Remove element from array
        System.out.println("An initial list of elements: "+al);   
        //Removing specific element from arraylist  
        al.remove("Vijay");  
        System.out.println("After invoking remove(object) method: "+al);   
        //Removing element on the basis of specific position  
        al.remove(0);  
        System.out.println("After invoking remove(index) method: "+al);   
          
        //Creating another arraylist  
        ArrayList<String> al4=new ArrayList<String>();    
        al4.add("Ravi");    
        al4.add("Hanumat");    
        //Adding new elements to arraylist  
        al.addAll(al4);  
        System.out.println("Updated list : "+al);   
        //Removing all the new elements from arraylist  
        al.removeAll(al4);  
        System.out.println("After invoking removeAll() method: "+al);   
        //Removing elements on the basis of specified condition  
        al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
        System.out.println("After invoking removeIf() method: "+al);  
        //Removing all the elements available in the list  
        al.clear();  
        System.out.println("After invoking clear() method: "+al);
        
        al.retainAll(al2);  
        System.out.println("iterating the elements after retaining the elements of al2");  
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
	}

}
