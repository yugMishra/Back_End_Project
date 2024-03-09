package dataStructures;

public class CapitalizeIfFoundInSet {
	  public static boolean isInSet(char ch, String s) {
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == ch) {
	                return true;
	            }
	        }
	        return false;
	    }
	public static String convertedString(String s,String set) {
		char[]sArray=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(isInSet(sArray[i],set)&&(isInSet(sArray[i-1],set)&& i>0)){
			sArray[i]-=32;
			sArray[i-1]-=32;
			}	
		}
		return new String(sArray);
	}
	public static void main(String[] args) {
		String input="Testing is a boring job";
		String set="aeioubt";
		System.out.println(convertedString(input,set));
	}

}
