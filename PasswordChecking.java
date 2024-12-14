/*
 * Name - Nang Nu Nu Aye
 * ID - 6643005
 * Section - 545
 */



package classEx2;
public class PasswordChecking {
	

	public static boolean isPasswordVaild(String password) {
		if(password.length()<8) {
				return false;
			}
		boolean hasUppercase= false;
		boolean hasDigit= false;
		boolean hasSymbol= false;
		String symbols= "_@#$&/";
			
		for(char ch: password.toCharArray()) {
			if(Character.isUpperCase(ch)) {
					hasUppercase= true;
			}
			if(Character.isDigit(ch)) {
					hasDigit= true;
			}
			if(symbols.indexOf(ch) != -1) {
					hasSymbol=true;
			}
		}
			return hasUppercase && hasDigit && hasSymbol;
		}

	public static void main(String[] args) {
		
		String[]testPasswords= {
				"password123@", "password234", "Password345@", "PASS","weakpassword1","vaild_password123","Short@1","noUppercase123"
		};
		for(String password: testPasswords) {
			System.out.println(password + ":"+ isPasswordVaild(password));
		}
	
		

		
}
		
	}

