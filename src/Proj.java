 
import java.util.*;

public class Proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

 

 
				
				Scanner input = new Scanner(System.in);
				// make a random integer 0, 1, or 2
				
				double computerChoice = 0;
				int userChoice = 0;
				int userInput = 0;
				
				int[] array = new int[5];
				
				arrayBuilder(array);
				
				for (int i = 0; i < array.length; i++) {
					switch (array[i]) {
					case 0: System.out.println("Super!");
					case 1: System.out.println("Nice!");	
					case 2: System.out.println("Awesome!");
					case 3:	System.out.println("Well!");
					case 5: System.out.println("Good Job!");
						
					}
				}
				
				String pick = "Please choose your pick";
				char period = '.';
				
				computerChoice = (int) (Math.random() * 10 + 1);

				while (computerChoice >= 4){
					computerChoice = (int) (Math.random() * 10 + 1);
				}
				
				// ask the user to enter a number 0, 1, or 2
				System.out.println(pick + period);
				System.out.println("Scissors = 1.");
				System.out.println("Rock = 2.");
				System.out.println("Paper = 3.");
				
				userChoice = input.nextInt();
				// Display result
				if (computerChoice == 1 && userChoice == 1) {
					System.out.println("You tie.");
				}
				if (computerChoice == 1 && userChoice == 2) {
					System.out.println("You win.");
				}
				if (computerChoice == 1 && userChoice == 3) {
					System.out.println("You lose.");
				}
				if (computerChoice == 2 && userChoice == 1) {
					System.out.println("You lose.");
				}
				if (computerChoice == 2 && userChoice == 2) {
					System.out.println("You tie.");
				}
				if (computerChoice == 2 && userChoice == 3) {
					System.out.println("You win.");
				}
				if (computerChoice == 3 && userChoice == 1) {
					System.out.println("You win.");
				}
				if (computerChoice == 3 && userChoice == 2) {
					System.out.println("You lose.");
				}
				if (computerChoice == 3 && userChoice == 3) {
					System.out.println("You tie.");
				}
				else {
					System.out.println("nothing happen");
					
				}



			}

	private static int[] arrayBuilder(int[] array) {
		boolean check = false;
		int i = 0;
		
		do  {		
			array[i] = i;
			i++;
		} while (i < array.length);
		
		for (int x = 0; i < 100; x = x + 2) {

			if (x > array.length) {
				check = true;
			}
			if (check == true) {
				break;
			}
			System.out.println(array[x]);
		}
			
		
		return array;
	}

		

	}


