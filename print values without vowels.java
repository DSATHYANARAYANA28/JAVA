import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	String a = "CYBERSECURITY student ";
	 String s1 = "";
        s1 = a.replaceAll("[AEIOU,aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1); 
	}
}
