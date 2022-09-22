import java.util.*;

class Main{
  static void printSubStr(String str, int low, int high)
  {
  	for (int i = low; i <= high; ++i)
  		System.out.print(str.charAt(i));
  }
  static int longestPalSubstr(String str)
  {
  	int n = str.length();
  	int maxLength = 1, start = 0;
  	for (int i = 0; i < str.length(); i++) {
  		for (int j = i; j < str.length(); j++) {
  			int flag = 1;
  			for (int k = 0; k < (j - i + 1) / 2; k++)
  				if (str.charAt(i + k) != str.charAt(j - k))
  					flag = 0;
  			if (flag!=0 && (j - i + 1) > maxLength) {
  				start = i;
  				maxLength = j - i + 1;
  			}
  		}
  	}
  	System.out.print("Longest palindrome subString is: ");
  	printSubStr(str, start, start + maxLength - 1);
  	return maxLength;
  }
  public static void main(String[] args)
  {
  	Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String str = inp.nextLine();
  	System.out.print("The length is: "
  		+ longestPalSubstr(str)+" characters.");
  }
}
/*
GOUCHER COLLEGE  
AP INSTITUTE 2008  
PALINDRAMA  
 A palindrome is a string which reads the same forwards as it does backwards –  e.g., a, gig, radar, racecar, glenelg and peep. Write a program which inputs a string of  letters (all lower case) {a, b, c,…., z} and outputs the longest substring which is a  palindrome.  
Input:  
 A single string of lowercase letters.  
Output:  
 The longest substring of the input which is a palindrome. If there are two or more  equally long palindrome substrings output the leftmost one. 

Sample input:  
 bahuibyasfhbhuahsfbuhuashfbuabcdedcbakasjfkjasjaskjajhuye 
  Sample output:  
 A longest palindrome substring is:  
 abcdedcba 

Sample input:  
 baclevelcdb  
Sample output:  
 A longest palindrome substring is:  
 clevelc 
 
Input  
tenanimalsislaminanetaaaaabbbbbstarstarrats  
Output  
A longest palindrome substring is:  
tenanimalsislaminanet  

Input  
nevereverevenneverevereven  
Output  
A longest palindrome substring is:  
nevereverevenneverevereven 

Input  
spacecapsababasmartrams  
Output  
A longest palindrome substring is:  
spacecaps 

Input  
wasitacaroracatisawjklmnamanaplanacanalpanamayuixztenanimalsislaminanet opuitunarolloranutmnas  
Output  
A longest palindrome substring is:  
amanaplanacanalpanama  

Input  
z  
Output  
A longest palindrome substring is:  
z
*/
