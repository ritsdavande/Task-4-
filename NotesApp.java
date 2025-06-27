package com.NotesApp.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {

	private static final String FILE_NAME = "notes.txt";;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to App...!!");
		
		int choice=0;
		while(choice!=3) {
			
		System.out.println("1)WriteNote");
		System.out.println("2)ViewNote");
		System.out.println("3)Exit");
		System.out.println("Enter your Choice");
		  choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			writeNotes(sc);
			break;
		case 2:
			readNotes();
			break;
		case 3:
			System.out.println("Exiting from App");
			break;
		default:
				break;
			
		}

	}sc.close();
}
	

    private static void writeNotes(Scanner sc) {
        System.out.print("Enter your note: ");
        String note = sc.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(note + "\n");
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }
	private static void readNotes() {
		// TODO Auto-generated method stub
		  System.out.println("\n--- Saved Notes ---");
	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            boolean empty = true;

	            while ((line = br.readLine()) != null) {
	                System.out.println("- " + line);
	                empty = false;
	            }

	            if (empty) {
	                System.out.println("(No notes found.)");
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("No notes found yet.");
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    
		
	}

	
}
