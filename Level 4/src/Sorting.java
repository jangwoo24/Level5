
public class Sorting {
	public static void main(String[] args) {
		Sorting S = new Sorting();
	}
	Sorting() {
		String[] testArray = null;
		sort(testArray);
	}
	static String[] sort(String[] s) {
		int length = s.length;
		String temp = "";
		while(length>0) {
			for(int i = 0; i<length-1; i++) {
				if(s[i].compareTo(s[i+1])>0) {
					temp = s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
				}
			}
			length--;
		}
		return s;
		
	}
	
}
