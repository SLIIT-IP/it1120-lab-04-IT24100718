import java.util.Scanner;
public class IT24100718Lab4Q3{
	public static void main(String[]args){
		Scanner input = new Scanner (System. in);
		System.out.print("Enter number: "); double number =input.nextDouble();
		String result=(number>0)?"The number is positive": (number<0)?"The number is negative": "The number is Zero";
		System.out.println("\n"+result);
    }
}