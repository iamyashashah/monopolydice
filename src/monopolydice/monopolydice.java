package monopolydice;

import java.util.Random;

public class monopolydice {

	public static void main(String[] args) {

		int dienumber1, dienumber2, sum;
		int i = 0;
		Random rnd = new Random ();

		dienumber1 = 1 + rnd.nextInt(7);
		dienumber2 = 1 + rnd.nextInt(7);
		
		//dienumber1 = 5; //for testing
		//dienumber2 = 5; //for testing
		

		System.out.println("Your die roll was : " + dienumber1);
		System.out.println("your die roll was : " + dienumber2);
		sum = dienumber1 + dienumber2;


		while (dienumber1 == dienumber2) //checking if dienumber is same then enter the loop
		{
			System.out.println("Doubles");
			System.out.println("move spaces" + sum);
			
			i++; //counter for checking 3 steps
			

			if (i >= 3)
			{
				break; // go to jail
			}
			System.out.println("roll again");
			dienumber1 = 1 + rnd.nextInt(7);
			dienumber2 = 1 + rnd.nextInt(7);
			System.out.println("Your die roll was : " + dienumber1); //calling number again
			System.out.println("your die roll was : " + dienumber2); //calling number again
		}

		if (i<3)
		{
			System.out.println("move " + sum + " stop");
		}
		else if (i>=3)
		{
			System.out.println("Go to jail");

		}



	}

}



