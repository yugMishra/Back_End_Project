package dataStructures;

public class URLify {
	private static String urlify(String s,int trueLength,String p) {
		char[]sArray=s.toCharArray();
		char[]pArray=p.toCharArray();
		//Assuming enough space is present at the back of string
		//count the no of blank spaces
		int count=0;
		for(int i=0;i<trueLength;i++) {
			if(sArray[i]==' ') {
				count++;
			}
			//System.out.println(count);
		}
		//to get the length of final string
		int index=trueLength+(count*(p.length()-1));
		//System.out.println(index);
		//iterate from the back of string and replace 
		//blank spaces with the pattern
		for(int i=trueLength-1;i>=0;i--) {
			if(sArray[i]==' ') {
				for(int j=p.length()-1;j>=0;j--) {
					sArray[index-1]=pArray[j];
					index--;
					//System.out.println(sArray[index-1]+ p.charAt(j)+index);
				}
			}
			//replace char with the original char
			else {
				sArray[index-1]=sArray[i];
			    index--;
			}
		}
		return new String(sArray);	
	}
	public static void main(String[] args) {
		System.out.println(urlify("Smith is great                   ",14,"%123"));	
	}
}
