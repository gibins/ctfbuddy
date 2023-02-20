package com.ctftools.crypto;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import com.ctftools.crypto.data.DomctfXOR;

public class Start {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		System.out.println("Crpto Engine");

		/*
		 * MessageDigest md = MessageDigest.getInstance("SHA-256"); md =
		 * MessageDigest.getInstance("SHA-256", "ProviderC");
		 */
		
		
		
		System.out.println("Data " + DomctfXOR.data);
		System.out.println("Data byte "+DomctfXOR.data.getBytes());
		System.out.println("Data String "+DomctfXOR.data.getBytes().toString());
		
		
		System.out.println("Single character "+"A".getBytes().toString());
		
		String s = new String("A".getBytes());
		System.out.println("Single Character "+s);
		
		//String equalent for that
		String sd = new String(DomctfXOR.data.getBytes());
		System.out.println("String conversion "+sd);
		
		//
		converter(DomctfXOR.data);

	}
	
	
	public static void converter(String data)
	{
		String[] cipherArray = data.split("(?<=\\G.{2})");
		System.out.println("Length "+cipherArray.length);
		
		System.out.println(""+cipherArray[0].getBytes(Charset.defaultCharset())[0]);
		
		for(String s :cipherArray )
		{
			System.out.println("character "+ s);
		}
	}
}
