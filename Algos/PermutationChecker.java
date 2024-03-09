package dataStructures;

public class PermutationChecker {
	static boolean isPermutation(String s,String t) {
		if(s.length()!= t.length()) {
			return false;
		}
		int[]letters=new int[128];
		char[]sArray=s.toCharArray();
		for(char c:sArray) {
			letters[c]++;  //having count of each char in string1
		}
		for(int i=0;i<t.length();i++) {
			letters[t.charAt(i)]--;  //having count of each char in str2
			if(letters[t.charAt(i)] < 0) //making sure count matches
				return false;
		}
		return true;
	}
	
	static String sort(String s){
		char[]sArray=s.toCharArray();
		java.util.Arrays.sort(sArray);
		return new String(sArray);
	}
	static boolean isPermutation2(String s,String t) {
		if(s.length()!=t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		System.out.println("input strings are purpumations: "+isPermutation2("abcd"," abdc"));
	}

}
