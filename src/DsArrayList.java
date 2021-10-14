import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class DsArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		
	// 2ND ARRAYLIST
		 ArrayList<String> arraylist=new ArrayList<String>();//Creating arraylist    
		 arraylist.add("Mango");//Adding object in arraylist    
		 arraylist.add("Apple");    
		 arraylist.add("Banana");    
		 arraylist.add("Grapes");    
	      //Printing the arraylist object   
	      System.out.println(arraylist);  
	      //Traversing list through for-each loop  
	      for(String fruit:arraylist)    
	        System.out.println(fruit);  
	      
	    //accessing the element    
	      System.out.println("Returning element: "+arraylist.get(1));//it will return the 2nd element, because index starts from 0  
	      //changing the element  
	      arraylist.set(1,"Dates");  
	      //Traversing list  
	      for(String fruit:arraylist)    
	        System.out.println(fruit); 
	      
	      //Sorting the list  
	      Collections.sort(arraylist); 
	      
	       //Traversing list through the for-each loop  
	      for(String fruit:arraylist)  
	        System.out.println(fruit); 
	      
	      //Traversing list through List Iterator
	      System.out.println("Traversing list through List Iterator:");  
          //Here, element iterates in reverse order  
             ListIterator<String> list1=list.listIterator(arraylist.size());  
             while(list1.hasPrevious())  
             {  
                 String str=list1.previous();  
                 System.out.println(str);  
             } 
             //Traversing list through for loop
       System.out.println("Traversing list through for loop:");  
          for(int i=0;i<arraylist.size();i++)  
          {  
           System.out.println(arraylist.get(i));     
          }  
          
             //Traversing list through forEach() method
       System.out.println("Traversing list through forEach() method:");  
       //The forEach() method is a new feature, introduced in Java 8.  
           arraylist.forEach(a->{ //Here, we are using lambda expression  
               System.out.println(a);  
             });  
               
           //Traversing list through forEachRemaining() method
           System.out.println("Traversing list through forEachRemaining() method:");  
             Iterator<String> itrRem=arraylist.iterator();  
             itrRem.forEachRemaining(a-> //Here, we are using lambda expression  
             {  
           System.out.println(a);  
             }); 
             
         
	 }  
}

