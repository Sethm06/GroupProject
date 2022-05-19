import java.util.Scanner;

public class Idea2 {

	public static void main(String[] args) {
		// Currency converter
		
		String a;
		do {
		Scanner myObj = new Scanner (System.in);
		System.out.print("Enter a an amount in $CAD to be converted to $USD: "); //Prompt user to enter an amount of currency to be converted
		double cad = myObj.nextInt(); //User money input
		
		double usd = cad * 0.78;
		
		System.out.print("$CAD: " + cad + "\r\n" + "$USD: " + usd + "\r\n\r\n"); //Display answer
		
		System.out.println("Would you like to enter another amount? (Y/N)"); //Prompt the user to enter another amount
		a = myObj.nextLine() + myObj.nextLine(); //User answer input
		System.out.print("\r\n");
		
	 	}while (!a.equals("N") && !a.equals("n")); //If user input is not "N" or "n" loop
	 	
	 	System.out.println("Thank you for using our program, have a great day!"); 
	}

}
