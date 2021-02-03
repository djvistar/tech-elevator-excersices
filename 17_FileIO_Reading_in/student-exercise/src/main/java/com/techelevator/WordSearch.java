package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
	

	
		File inputFile = getInputFileFromUser();
		String word = wordToSearch();
		searchTerm(inputFile, word);

	}

	
	private static File getInputFileFromUser() {
		
		Scanner fileInput = new Scanner(System.in);
		System.out.print("What is the file that should be searched? ");
		String filePath = fileInput.nextLine();

		File inputFile = new File(filePath);
		if (!inputFile.exists()) {
			System.out.println(filePath + " Does not exist");
			System.exit(1);
	}
		return inputFile;
	}

	
	
	public static String wordToSearch() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("What is the search word you are looking for? ");
//	    String searchTerm = userInput.nextLine();
		String searchWord = userInput.nextLine();

		return searchWord;

	}

	public static String searchTerm(File inputFile, String searchWord) {
		
		Scanner isCaseSensitive = new Scanner(System.in);
		System.out.print("Should the search be case sensitive? (Y\\N)");
		String yesOrNo = isCaseSensitive.nextLine().toLowerCase().substring(0, 1);
		

		try (Scanner input = new Scanner(inputFile)) {
			int count = 0;
			
			while (input.hasNextLine()) {
				if (yesOrNo.equals("N")) {
					count++;
					
					String line = input.nextLine();
					
					if (line.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(count + ") " + line);
					} else {
					}
				} else {
					String line = input.nextLine();
					if (line.contains(searchWord)) {
						System.out.println(count + ") " + line);
					}
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}
		return "";
					
		
}		
	
}
		

