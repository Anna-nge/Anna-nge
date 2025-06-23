package Quiz_1;

public class Q11_6643005 {
	public static boolean tripleH(String str) { 
		boolean result = false;
		if (str.contains("HHH")) {
			result = true;
		} else {
			int count = 0;
			int len = str.length();
			for (int i = 0; i < len; i++) {
				if(str.charAt(i) == 'H' ) {
					count++;
				}
			}
			if (count == 3) {
				result = true;
			}
		}
	                
		
		return result;
	}

	public static void main(String[] args){ 
	        System.out.println(tripleH ("HH12HH3")); // false
	        System.out.println(tripleH ("ABCDCDE")); // false
	        System.out.println(tripleH ("HASDASDHH")); // true 
	        System.out.println(tripleH ("HCCCHH")); // true 
	        System.out.println(tripleH ("HHH2ABBHHA")); // true
	        System.out.println(tripleH ("H82ABAHHHC28")); // true 
	        System.out.println(tripleH ("HHAHH#HH")); // false 
	        System.out.println(tripleH ("8*8*#H8HH")); // true 

	    }

}
