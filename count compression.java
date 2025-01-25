import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String s = "aaaaaabbdddddccaa";
		String res = "";
		int c=1;
		for(int i = 0; i<s.length() ; i++){
		   if((i+1)<s.length() && s.charAt(i)== s.charAt(i+1)){
		       c++;
		   }
		   else{
		       res = res + s.charAt(i);
		       res = res+c;
		       c=1;
		   }
		}
		System.out.println(res);
	}
	
}
