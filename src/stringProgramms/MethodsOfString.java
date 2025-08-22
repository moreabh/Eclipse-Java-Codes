package stringProgramms;

import java.util.Arrays;

public class MethodsOfString {

	public static void main(String[] args) {
		String s1 = "Abhishek";
		String s2 = "I love India";
		String s3 = "  ";
		String s4 = "coincidence";
		
		
		System.out.println("Used to fetch the particular Index "+s1.charAt(0));
		System.out.println("Used to fetch the ASCII Code of the particular character "+s1.codePointAt(0));
		System.out.println("Used to fetch the code point before this index "+s1.codePointBefore(1));
		System.out.println("Used to compare the string "+s1.compareTo(s2));
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		System.out.println("Used to compare two string ignoring cases "+s1.compareToIgnoreCase(s2));
		System.out.println("Used to concat two string "+s1.concat(s2));
		System.out.println("Used to check wether both string have same content or not "+s1.contentEquals(s2));
		System.out.println("Used to check wether given string is ends with given string "+s1.endsWith("ek"));
		
		byte [] ar = s2.getBytes();
		System.out.println("Used to get an array of byte of given string character "+s2.getBytes());
		System.out.println("Use to add some extra space at left side"+s1.indent(20));
		System.out.println("Used to give index of the given character from initial "+s1.indexOf('s'));
//		System.out.println(s2.indent(15));
//		System.out.println(s2);
		System.out.println("Used to index of given string into main string "+s1.indexOf("is"));
		System.out.println("Used to check wether string is blank or not "+s1.isBlank());
		System.out.println("Used to check wether given string is empty or not including blank space "+s1.isEmpty());
		System.out.println("s3 contains blank space so it is not empty "+s3.isEmpty());
		System.out.println("It givex the last occurance index of given char "+s4.lastIndexOf('i'));
		System.out.println(s4+" length:"+s4.length());
		System.out.println("repeating string n times: "+"repeating ".repeat(3));
		System.out.println("replace character of string with new given character "+s1.replace('k', 'm'));
		System.out.println("replace sequence of character to original string with given string "+s1.replace("ek", "li"));
		System.out.println("Use to check the string present in main string "+s1.contains("Abhish"));
		System.out.println(s1.split(s4));   
		
		

	}

}
