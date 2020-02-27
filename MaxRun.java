import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**.
 * Class MaxRun.
 * This code finds the max run from a string
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-26 
 */

public class MaxRun {
 
  // Variables
  static char thisOne;
  static char lastOne;
  static String repString = "";
  static String longestRun = "";
  static int pos = 0;
  static int count = 1;
  static int maxCount = 0;

  /**
   * Outputs and calculates max run of string.
   */
   
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string to find the max run : ");
    String userInput = scanner.next();

    if (userInput != null)
    {
      String longestRun = LongestMaxRun(userInput);
    }
		else {
			System.out.println("Invalid input");
		scanner.close();
	       }
    }
	
	public static String LongestMaxRun(String userInput)
  // Finds longest run with if, else, and return statement
	{		
		int masPosition = userInput.length();

    lastOne = userInput.charAt(pos);
    for (pos = 1; pos < masPosition; pos++)
    {
      thisOne = userInput.charAt(pos);
      if (lastOne == thisOne)
      {
	count++;
				repString = repString + lastOne;
			}
			else				
			{
				if (count > maxCount)
				{
					maxCount = count;
					longestRun = repString + lastOne;					
				}
				repString = "";
				count = 1;
			}
			lastOne = thisOne;
		}
		if (count > maxCount)
		{
			maxCount = count;
			longestRun = repString + lastOne;					
		}
			
		if (masPosition == 1)
			longestRun = userInput;
			
    // Prints max run with length number		
		System.out.println("The longest run is " + longestRun + " which is " + maxCount);
		return longestRun;
		
	}

}