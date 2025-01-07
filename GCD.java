import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	 System.out.println("Enetr number1 : ");
	 int a = sc.nextInt();
	  System.out.println("Enetr number2 : ");
	 int b = sc.nextInt();
	 int temp ; 
	 
	 while(b>0){
	     temp = b;
	     b = a % b;
	     a = temp;
	 }
	 if (a ==  1)
	 System.out.println("CO prime");
	 else
	 System.out.println("Not a co prime");
}
}
