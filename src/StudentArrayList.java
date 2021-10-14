import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {

		//Creating user-defined class objects  
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25); 
		  
		  ArrayList<Student> sList= new ArrayList<Student>();
		  sList.add(s1);
		  sList.add(s2);
		  sList.add(s3);
//		  
//		  Iterator it = sList.iterator();
//		  
//		  while(it.hasNext()) {
//			  Student st = (Student) it.next();
//			  System.out.println(st.rollno + " "+st.name+" "+st.age);
			  
		  for(Student student: sList) {
			  System.out.println(student.rollno + " "+student.name+" "+student.age);
		  }
		  }

	}


