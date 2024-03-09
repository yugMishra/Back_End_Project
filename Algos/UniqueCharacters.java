package dataStructures;

import java.util.HashSet;

public class UniqueCharacters {
	private static boolean isUnique(String str) {
		str=str.toLowerCase();
		boolean []char_set=new boolean[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(char_set[ch] && ch!=' ') {
				return false;          //Character already visited
			}
			char_set[ch]=true;
		}
		return true;
	}
	
	private static boolean isUnique1(String str) {
		str=str.toLowerCase();
		HashSet<Character> char_set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(char_set.contains(ch)&& ch!=' ') {
				return false;  //Character alredy visited
			}
			else if(ch!=' ')
			char_set.add(ch);
		}
		return true;
	}
	
	private static boolean isUnique2(String str) {
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ') {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Input String have unique characters: "+isUnique2("Abcda"));
	}


}
