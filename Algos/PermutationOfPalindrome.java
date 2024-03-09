package dataStructures;

import java.util.Scanner;

public class PermutationOfPalindrome {
	//1.papa is a permutattion of palindrome i.e paap,appa;
	//2.also abacbcbcaba is the same as above;
	//3.so if count of every char in string is even or any one of the char may be odd
	//1.count the no of occurrence of each char
	private static boolean permutationOfPalindrome(String s) {
		int[]charSet=new int[128];//assuming string is ASCII
		for(char c:s.toCharArray()) {
			if(c!=' ')
			charSet[c]++;
		}
		int oddCount=0;
		for(int count:charSet) {
			if(charSet[count]%2 != 0) {
				oddCount++;
				if(oddCount>1) 
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Input the string");
		Scanner sc=new Scanner(System.in);
		System.out.println("Is Permutation Of Palindrome: "+permutationOfPalindrome(sc.next()));
	}

}
