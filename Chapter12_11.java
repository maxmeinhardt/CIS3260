package edu.gsu.cis.Chapter12;
//pg 489
//imports java file class
//java.io used for accessing system files
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter12_11 {

	// throws IOException used to catch FileNotFound exception
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		// if import file class, File file = new File ("/Users/crazymoose55/Desktop");
		java.io.File file = new java.io.File("/Users/crazymoose55/Desktop/12_11.txt");
		if (file.exists() == false) {
			
		
		PrintWriter output = new PrintWriter(file);

		output.print("Fast and Furious is my favorite movie.");
		output.close();
		}else{
			System.out.println("File already exists");
		}
	
		//new Scanner that reads input of created / existing file
		Scanner fileInput = new Scanner(new File("/Users/crazymoose55/Desktop/12_11.txt"));
		StringBuilder fileString = new StringBuilder();
		
		
		//hasNext() works similarly to nextLine(), it will take whatever text up until a space
		while(fileInput.hasNext()){
			//added a space after next() to make sure the sentence structure & spaces still exist
			fileString.append(fileInput.next() + " ");
		}
		System.out.println(fileString);
		System.out.println("Enter the String you want removed:");
		String s1 = input.nextLine();
		
		//assigning the start index (if included) of the string to int value x
		int x = fileString.indexOf(s1);
		
		//since StringBuilder delete deletes to the end of the substring-1, you add the int value into it to make sure it deletes the entire string
		fileString.delete(x,x+s1.length());
		
		//displays what will be printed to the file
		System.out.println(fileString);
		
		
		//creates a new file with the same address that overwrites the old file
		PrintWriter output = new PrintWriter(file);

		//prints the edited string to the file
		output.print(fileString);
		output.close();
	
		

	}

}
