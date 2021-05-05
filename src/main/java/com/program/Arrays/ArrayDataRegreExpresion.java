package com.program.Arrays;

import java.util.ArrayList;

public class ArrayDataRegreExpresion {
	
	public static void main(String[] args) {
		
	    String[] str= {"ABC@EDFRD123456789%$#^&*()!@","DEF"};
	    ArrayList<String> arrList=new ArrayList<String>();
		for (String data : str) {
		    String newData = data.replaceAll("[^A-Za-z]","");
		   
			if(newData==data)
			{
				System.out.println("hel€lo pushpak wani");
				arrList.add(newData);
			}
			else
			{
				System.out.println("Not Equals");
				arrList.add(newData);
			}
		}
		System.out.println("data got filters "+" "+ arrList);
	
		
	}
	
	

}
