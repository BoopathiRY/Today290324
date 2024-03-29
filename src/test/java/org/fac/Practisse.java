package org.fac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practisse {
	
	public static void main(String[] args) {
	
		String s="friday";
		
		Integer count=0;
		
		Map<Character,Integer>m=new HashMap<>();
		
		for (int i=0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (m.containsKey(ch)) {
				 count = m.get(ch);
				
				m.put(ch, ++count);
			}
			else
			{
				m.put(ch, 1);

			}
		}
		System.out.println(m);
		
		
		
		
	}
	

}
//WebDriver driver = new ChromeDriver();
//driver.get("https://demo.nopcommerce.com/register");
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());