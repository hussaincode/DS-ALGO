package calculator;

public class Rating {

	public static void main(String[] args) {
		int ratings = 5;
		switch(ratings) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Average review");
		    break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
		}
			

	}

}
