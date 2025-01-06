// logic:
//getting input -  two int
// finding big num
// infinite loop
// multiple -  brea - divisible by lowest value 
// LCM
import java.util.*;
public class Main
{
	public static void main(String[] args) throws InterruptedException 
	{
	    Scanner leo =  new Scanner(System.in);
	    System.out.println("enter number 1:");
	    int a = leo.nextInt();
	    System.out.println("enter numer 2: ");
	    int b =  leo.nextInt();
	    
	    int bigger =  a>b ? a:b ;
	    int lcm = bigger;
	    
	    while(true){
	        if (lcm % a  ==  0 && lcm % b == 0)
	            break;
	            else
	           lcm += bigger;
	           
	        
	        
	    }
	    System.out.println("LCM of " + a + " and " + b + " is: " + lcm); 
	    
	    }
	    
	}
