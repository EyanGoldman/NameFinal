import java.util.Random;
import java.util.Scanner;
public class NameFinal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.nextLine().toCharArray();
		hyphen(input);
		System.out.println(random(input));
		System.out.println("new changes");
	}
	//marco
	static char[] reverse() 
	{
		return null;
	}
	//damon
	static int vowel(char[] charray){
		int vowelnum = 0;
		for(int i = 0; i < charray.length; i++){
			if(charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u' || charray[i] == 'A' || charray[i] == 'E' || charray[i] == 'I' || charray[i] == 'O' || charray[i] == 'U'){
				vowelnum++;
			}
		}
		return vowelnum;
	}
	//Nicky
	static int consonentFrequency(char[] input) 
	{
		int consonents= 0;
		for (int i = 0; i < input.length; i++) 
		{
			if(input[i]!='a' && input[i]!= 'A' && input[i]!= 'e' && input[i]!='E' && input[i]!='i' && input[i]!= 'I' 
					&& input[i]!= 'o' && input[i]!= 'O' && input[i]!= 'u' && input[i]!= 'U')
				/*

			 		input[i] == 'b' || input[i] == 'B' || input[i] == 'c' || input[i] == 'C' || input[i] == 'd' || 
					input[i] == 'D' || input[i] == 'f' || input[i] == 'F' || input[i] == 'g' || input[i] == 'G' 
					|| input[i] == 'h' || input[i] == 'H' || input[i] == 'j' || input[i] == 'J' || input[i] == 'k' 
					|| input[i] == 'K' || input[i] == 'l' || input[i] == 'L' || input[i] == 'm' || input[i] == 'M' 
					|| input[i] == 'n' || input[i] == 'N' || input[i] == 'p' || input[i] == 'P' || input[i] == 'q' 
					|| input[i] == 'Q' || input[i] == 'r' || input[i] == 'R' || input[i] == 's' || input[i] == 'S' 
					|| input[i] == 't' || input[i] == 'T' || input[i] == 'v' || input[i] == 'V' || input[i] == 'w' 
					|| input[i] == 'W' || input[i] == 'x' || input[i] == 'X' || input[i] == 'y' || input[i] == 'Y' 
					|| input[i] == 'z' || input[i] == 'Z'
				 */
			{
				consonents++;
			}
		}
		return consonents;
	}
	//Ryan
	static char[] firstName()
	{
		return null;
	}
	static char[] lastName(char [] charray)
	{
		int spacenum = charray.length;
		for (int i = charray.length - 1; i > 0; i--) {
			if (charray[i] == ' '){
				spacenum = charray.length - i;
				break;
			}
		}
		char[] lastname = new char[spacenum-1];
		for (int i = 0; i < lastname.length; i++) {
			lastname[i] = charray[charray.length - spacenum + i + 1];
		}
		return lastname;
	}
	static String middleName()
	{
		return null;
	}
	static boolean hyphen(char[] input)
	{
		//Nicky
		boolean hyphen = false;
		for (int i = 0; i < input.length; i++) 
		{
			if (input[i] == '-')
			{
				hyphen = true;
			}
		}
		if (hyphen == false)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	static char[] lowerCase()
	{
		return null;
	}
	static char[] upperCase()
	{
		return null;
	}
	static char[] random(char[] array)
	{
		Random gen = new Random();
		char[] charray = new char[array.length];
		int[] alreadypicked = new int[array.length];
		for (int i = 0; i < alreadypicked.length; i++) {
			alreadypicked[i] = -1;
		}
		boolean picked = true;
		int choice = 0;
		for (int i = 0; i < charray.length; i++) {//iterate across charray and set its values
			picked = true;
			while(picked){
				picked = false;
				choice = gen.nextInt(array.length);
				for (int j = 0; j < alreadypicked.length; j++) {//iterate through all values that have been picked
					if(choice == alreadypicked[j]){//check if this has been picked
						picked = true;
						System.out.println(charray);
					}
				}
			}
			alreadypicked[i] = choice;
			charray[i] = array[choice];
		}
		return charray;
	}
	static boolean palindrome(char[] input)
	{
		return false;
	}
	static char[] sorted(char[] array)
	{
		int[] intarray = new int[array.length];
		int[] charray = new int[array.length];
		boolean[] alreadyused = new boolean[array.length];
		
		int least = 10000;
		for (int i = 0; i < array.length; i++) {
			intarray[i] = (int) array[i];
		}
		for (int i = 0; i < intarray.length; i++) {
			least = 10000;
			for (int j = 0; j < intarray.length; j++) {
				if(!alreadyused[j]){
					
				}
			}
			alreadyused[i] = true;
		}
		//return charray;
	}
	static char[] initials()
	{
		return null;
	}
	static boolean title()
	{
		return false;
	}
	static char[] strongSyllable()
	{
		return null;
	}

}