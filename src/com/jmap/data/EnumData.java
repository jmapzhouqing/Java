package com.jmap.data;

public class EnumData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

enum Size{
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
		return this.abbreviation;
	}
	
	private String abbreviation;
}