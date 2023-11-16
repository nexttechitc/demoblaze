package PasswordEncrypt;

import java.util.Base64;

import org.testng.annotations.Test;



public class encrypt {

	@Test
public static void dhaka() {
		
		String password= "12345";
		byte[] passwordInBute = password.getBytes();
		String encodedPassword=  Base64.getEncoder().encodeToString(passwordInBute);
		System.out.println(encodedPassword);
			
		}
	String encreptedPassword = "MTIzNDU=";
		public static String returndepcreptedpassword(String encreptedPassword) {
			byte[] DecreptedPasswordInByte =  Base64.getDecoder().decode(encreptedPassword);
			String depcreptedpasswordinText=  new String(DecreptedPasswordInByte);
			
			return depcreptedpasswordinText;
			
		}
	


}
