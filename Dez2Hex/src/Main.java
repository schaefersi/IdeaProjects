import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stream = new Scanner(System.in);

        System.out.print("Umrechner Dezimal in Hexadezimalzahl");
        System.out.print("\n\nDezimalzahl: ");

        int dez = stream.nextInt();

        System.out.print("\nHexadezimalzahl: ");

        outputString(dezToHex(dez));

		/*
		String input = stream.nextLine();
		outputString(input);
		*/
    }

    public static String dezToHex(int a)
    {
        String hex = Integer.toHexString(a);

        return hex;
    }

    public static void outputString(String input) {
        System.out.println(input);
    }
}
