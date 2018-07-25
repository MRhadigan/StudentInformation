import java.util.Scanner;

public class studentInformation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//creating strings with options for users to enter
		String[] studentName = {"Michelle", "Tiffany", "Camila", "Joseph", "Kevin", "Matthew", "Kelly", "Lauren", "Erin", "Mike"};
		String[] homeTowns = {"Hong Kong", "Detroit", "Brazil", "Dearborn", "Detroit", "Virginia Beach", "Miami", "Texas", "New York", "Chicago" };
		String[] Food = {"sushi", "olives", "chocolate", "pasta", "pizza", "chicken", "sushi", "burger", "pizza", "steak"};
		int userNum = 0;
		String userInput = null;
		String moreInfo = "y";
		System.out.println("Welcome to our Java class. ");
		
		// asking for user input to have them enter a number to get a certain student
		userNum = Validator.getInt(scan, "Which student would you like to learn more about? (enter a number 1-10):", 1, 10);
		
	
		// While loop to ask if the user wants to continue at the end
		// Returning the student name they chose, and asking what the user wants to know. 
		// A switch statement to print out the response to what the user entered.
		while (moreInfo.equalsIgnoreCase("y")) {
			System.out.println("student " + userNum + " is " + studentName[userNum - 1] + ".");
			System.out.println("What would you like to know about " + studentName[userNum - 1]);
			userInput = Validator.getString(scan, "\"Hometown\" or \"Food\"?");
			switch (userInput) {
			case "Hometown":
				System.out.println(homeTowns[userNum - 1]);
				break;
			case "Food":
				System.out.println(Food[userNum - 1]);
				break;
			default:
				System.out.println("That data does not exist");
				break;
			}
			// ASk if the user wants to know more about the student
			moreInfo = Validator.getString(scan, "Would you like to know more about " + studentName[userNum -1] + ":");
			
		}
		System.out.println("Goodbye!");
		
		scan.close();
	}
	}
	


