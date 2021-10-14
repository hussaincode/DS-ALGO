import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDateSort {

	public static void main(String[] args) {
		 // Creating an ArrayList of String to
        // store the Dates
        ArrayList<String> datesList = new ArrayList<>();
 
        // Adding date to ArrayList
        // using standard add() method
        datesList.add("2020-03-25");
        datesList.add("2019-01-27");
        datesList.add("2020-03-26");
        datesList.add("2020-02-26");
 
        // Display message only
        System.out.println(
            "Dates Object before sorting : ");
 
        // Iterating in the ArrayList
        // using for each loop
        for (String dates : datesList) {
 
            // Printing the data from the list
            System.out.println(dates);
        }
 
        // Sorting the ArrayList
        // using Collections.sort() method
        Collections.sort(datesList);
 
        // Display message only
        System.out.println("Dates Object after sorting : ");
 
        // Iterating in the ArrayList
        // using for-each loop
        for (String dates : datesList) {
 
            // Printing the data from the list
            System.out.println(dates);
        }

	}

}
