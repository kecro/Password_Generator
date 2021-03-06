
public class Menu {
	public static void menu() {
		int nbr = Functions.nbrCharacters();
		int choice = Functions.choice();
		int random;
		char answer;
		do {
			switch (choice) {
			case 1 : // A numeral password
				System.out.println("\nYour password : ");
				for (int i = nbr; i > 0; i--)
					Functions.randomNumbers();
				break;
			case 2 : // An alphanumeral password
				System.out.println("\nYour password : ");
				for (int i = nbr; i > 0; i--) {
					random = (int) (Math.random()*2);
					if (random == 1)
						Functions.randomMinus();
					else
						Functions.randomNumbers();
				}
				break;
			case 3 : // An alphanumeral password with caps
				System.out.println("\nYour password : ");
				for (int i = nbr; i > 0; i--) {
					random = (int) (Math.random()*3);
					if (random == 2)
						Functions.randomMinus();
					else if (random == 1)
						Functions.randomNumbers();
					else
						Functions.randomMaj();
				}
				break;
			case 4 : // An password with special characters
				System.out.println("\nYour password : ");
				for (int i = nbr; i > 0; i--) {
					random = (int) (Math.random()*4);
					if(random == 3)
						Functions.randomAll();
					if (random == 2)
						Functions.randomMinus();
					else if (random == 1)
						Functions.randomNumbers();
					else
						Functions.randomMaj();
				}
				break;
			}
			answer=Functions.tryAgain();
		} while(answer=='Y' || answer == 'y');
		System.out.println("\nThank you for using Annabelle2.0 !");
	}
}
