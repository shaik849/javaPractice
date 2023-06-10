package com.learning.java.Strings;

import java.util.Arrays;

public class StringsPractice {
public static void main(String[] args) {
	String str = "shaik";
	String str1 = new String("shaik");
	
	System.out.println(str == str1);
    System.out.println(str.equals(str1));	
   char[] strArray = str.toCharArray();
   System.out.println(Arrays.toString(strArray));
   String str3= "geek ss@for@geekss";
   str = str3.replaceAll("\\s", "");
   
   System.out.println(str);
    String str4 = "-10";
    int a = Integer.parseInt(str4);
    System.out.println(a);
//   String[] arrOfStr = str3.split("@");
//   System.out.println(Arrays.toString(arrOfStr));
//   System.out.println(str3.substring(2, 5));
//   
}
}
