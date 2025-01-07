import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 int sm = 0; 
	 int up = 0;
	 int dg = 0;
	 int sp = 0;
	 
	 Scanner sc =  new Scanner(System.in);
	 System.out.println("enter your password");
	  String a = sc.nextLine();
	 
	 if (a.length() > 7 ){
	     
	     for(char i : a.toCharArray()){
	         if(Character.isUpperCase(i))
	         up++;
	         else if(Character.isLowerCase(i))
	         sm++;
	         else if(Character.isDigit(i))
	         dg++;
	         else
	         sp++;
	     }
	     if(dg > 0 && sm > 0 && sp > 0 && up > 0)
	     System.out.println("Strong password");
	     else
	     System.out.println("Weak");
	 }
	 else 
	 System.out.println("passowrd is week due to less character");
	}
}
