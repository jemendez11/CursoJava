import java.util.Scanner;

public class Operations2 {

	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);

        	int input;

   		System.out.println("Escribe un numero:");
		input = scan.nextInt();

        	int input2;

   		System.out.println("Escribe un numero:");
		input2 = scan.nextInt();

	
		int result;

		result = input + input2;
		System.out.println("La suma es: " + result);

		result = input - input2;
		System.out.println("La resta es: " + result);


		result = input * input2;
		System.out.println("La multiplicacion es: " + result);

	}

}