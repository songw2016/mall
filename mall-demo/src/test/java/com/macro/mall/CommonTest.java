package com.macro.mall;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CommonTest {

	
	public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	public static void main(String[] args) {
		
		String rowPassword = "12345678";
		String encodedPassword = "$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG";
		String encodedPassword1 = "$2a$10$C3Rvj/W4xmhZLyLQNKHTnu08ZWMRZrGCq.F0VPsJ7Qfhou38.9uQy";
		
		PasswordEncoder passwordEncoder = passwordEncoder();
		if(!passwordEncoder.matches(rowPassword,encodedPassword1) ){
			System.out.println("not match" ); 
			//throw new BadCredentialsException("密码不正确");
        }else {
        	System.out.println("good match" ); 
        }
		
		String sourceText = "12345678";
		String md5Password = passwordEncoder.encode(sourceText);
		System.out.println(md5Password ); 
		
	}

}
