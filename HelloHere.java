package com.cropin.Assignment;

public class Validation {

	public static void main(String[] args) {
	String pass ="password1";
	

	}
public static boolean valPassword(String password) {
	
	if(password.length()>7) {
		if(checkPass(password)) {
			return true;
		}
			else {
				
				return false;
			
		}
		
	}
	else {
		System.out.println("too small");
		return false;
	}
	
}
public static boolean checkPass(String password) {
	boolean hasnum=false;boolean hascap=false; boolean haslow=false; char c;
	for(int i=0;i<password.length();i++) {
		c=password.charAt(i);
		if(Character.isDigit(c))
		{
			hasnum=true;
			
		}
		else if(Character.isUpperCase(c)) {
			hascap=true;
			
		}
		else if(Character.isLowerCase(c)) {
			haslow=true;
		}
		if(hasnum && hascap && haslow) {
			return true;
		}
			
	}
	return false;
	
}
}
