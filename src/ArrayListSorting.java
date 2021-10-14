import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		// creating object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();   
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);   
		
		ArrayList<Integer> listInt = new ArrayList<Integer>();  
		listInt.add(55);  
		listInt.add(34);  
		listInt.add(98);  
		listInt.add(67);  
		listInt.add(39);  
		listInt.add(76);  
		listInt.add(81);  
		//printing ArrayList before sorting  
		System.out.println("ArrayList Before Sorting:");  
		for(int marks: listInt)  
		{  
		System.out.println(marks);  
		}  
		//sorting ArrayList in ascending order  
		Collections.sort(list);  
		//printing ArrayList after sorting  
		System.out.println("ArrayList After Sorting:");  
		for(int marks: listInt)  
		{  
		System.out.println(marks);  
		}  

	}

}
