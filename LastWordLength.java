package javaHandson;

public class LastWordLength {

	public static void main(String[] args) 
	
	{
		String inputString = "Somewhere in the ocean of Hope";
		String[] split = inputString.split(" ");
		String lastword = split[split.length-1];
		System.out.println("Last word in the give string - " +lastword);
		System.out.println("Length is " +lastword.length());
	}

}
