import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		
		// Kyle's Group
		
		String[] names = new String[10]; 
		names[0] = "Jackie";
		names[1] = "Michael";
		names[2] = "Kim";
		names[3] = "Malik";
		names[4] = "Theo";
		names[5] = "Yang-Yang";
		names[6] = "Britney";
		names[7] = "Amy";
		names[8] = "Yoona";
		names[9] = "Johnny";

		String[] food = new String[10];

		food[0] = "Salad";
		food[1] = "Tacos";
		food[2] = "Sushi";
		food[3] = "Jollof Rice";
		food[4] = "Pizza";
		food[5] = "Ramen";
		food[6] = "Lamp-chops";
		food[7] = "Turkey";
		food[8] = "Kimchi";
		food[9] = "Pizza";

		String[] town = new String[10];
		town[0] = "Woodhaven";
		town[1] = "New York";
		town[2] = "Los Angeles";
		town[3] = "Cairo, Egypt";
		town[4] = "Toledo";
		town[5] = "Shanghai, China";
		town[6] = "Browntown";
		town[7] = "Taylor";
		town[8] = "Seoul, South Korea";
		town[9] = "Chicago";

		boolean isValid = true;
		String choice = "y";
		int index = -1;
		
		System.out.println("This is the Student Roster.");
		System.out.println();
		

		while (choice.startsWith("y")) {

			System.out.println("Which student would you like to learn more about?");
			System.out.println();

			// show entire list of names
			for (int i = 0; i < names.length; i++) {
				System.out.println(i + 1 + ". " + names[i]);
			}

			 do {
			 
			  try { index = scnr.nextInt() - 1; 
			  	isValid = true;
			  }
			  
			   catch (Exception ex) { 
				 scnr.nextLine();
				 System.out.println("Not a number!! Enter a number 1-10:"); 
				 isValid = false; 
			  }

			} while (!isValid);
			 
			while (index < 0 || index >= 10) {
				System.out.println("Enter a number (1-10):");
				index = scnr.nextInt() - 1;
			
			}


		// clear the scanner
		scnr.nextLine();

			System.out.println("That is " + names[index] + ". What would you like to know about " + names[index]
					+ " ? (enter \"hometown\" or \"favorite food\")");

		String input = scnr.nextLine();
		

		do {

			if (input.equalsIgnoreCase("hometown")) {
				System.out.println(names[index] + " is from " + town[index]);
					System.out.println();
				System.out.println("Would you like to know more (enter \"yes\" or \"no\")?");
				input = scnr.nextLine();

				if (input.toLowerCase().charAt(0) == 'y') {
					System.out.println(names[index] + " likes " + food[index]);
					break; // breaks out
				} else {
					System.out.println("Thanks");
					break;
				}

			} else if (input.equalsIgnoreCase("favorite food")) {
					System.out.println(names[index] + " likes " + food[index]);
					System.out.println();
				System.out.println("Would you like to know more (enter \"yes\" or \"no\")?");
				input = scnr.nextLine();

				if (input.toLowerCase().charAt(0) == 'y') {
						System.out.println(names[index] + " is from " + town[index]);
					break;
				} else {
					System.out.println("Thanks");
					break;
				}

			} else {
					System.out.println("Error! Enter \"hometown\" or \"favorite food\" or \"exit\"!");
				input = scnr.nextLine();

					if (input.startsWith("e")) {
						break;
					}
			}
			
			
			} while (isValid);
			System.out.println();
			System.out.println("Would you like to know about another student? (y/n)");
			choice = scnr.nextLine();
		}

		System.out.println("Thank you for viewing this student roster.");
	
		scnr.close();
		
	}

	}

