import java.io.*;
import java.util.*;

public class boyGirl {

	public static void main(String[] args) 
			throws FileNotFoundException {	
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);

	}
	public static void boyGirl(Scanner input) {

		//initialize counters
		int boySum = 0;
		int girlSum = 0;
		int lineNumber = 1;
		int boyCount = 0;
		int girlCount = 0;
		String name;
	
		while (input.hasNext()) {
			String newLine = input.nextLine(); //creates new line containing name + number
			Scanner line = new Scanner(newLine);
			while (line.hasNext()) {
			name = line.next(); 
			//System.out.println(name);
				if (lineNumber % 2 == 1) {
					boyCount++; //add to boy count
					boySum += line.nextInt();//accumulate boy sum
					//System.out.println("The current boy count is " + boyCount);
					//System.out.println("The current boy sum is " + boySum);
				} else {
					girlCount++; //add to girl count
					girlSum += line.nextInt(); //accumulate girl sum
					//System.out.println("The current girl count is " + girlCount);
					//System.out.println("The current girl sum is " + girlSum);
				}//end of inner while loop
			}//end of outer while loop
				lineNumber++;			
		}
	System.out.println(boyCount + " boys, " + girlCount + " girls");
	System.out.println("Difference between boys' and girls' sums: " +  Math.abs(boySum - girlSum));	
	}
}


			
			
			


	

