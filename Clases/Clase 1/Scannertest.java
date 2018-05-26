import java.util.Scanner;

public class Scannertest{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input;

        System.out.println("Escribe una linea:");

        input = scan.nextLine();

        System.out.println("El input es: " + input);

    }


}