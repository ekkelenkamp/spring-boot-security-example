package com.security.spring.infrastructure.security;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Base64;

public class Base64EncodeDecodeUtility {

//	public static void main(String[] args) throws UnsupportedEncodingException {
//		System.out.println(encode("admin", "password"));
//		System.out.println(decode(encode("admin", "password")));
//	}

	public static String encode(String username, String password) throws UnsupportedEncodingException {
		byte[] encodedValue = null;
		encodedValue = Base64.getEncoder().encode((username + ":" + password).getBytes(Charset.forName("UTF-8")));
		return new String(encodedValue);
	}

	public static String[] decode(String encodedValue) {
		String decodedValue = new String(Base64.getDecoder().decode(encodedValue),Charset.forName("UTF-8"));
		return decodedValue.split(":");
	}
}
