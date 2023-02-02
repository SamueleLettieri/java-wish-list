package org.lessons.java.christmas;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();		
		
		String wish, exit = "";
		
		Scanner s = new Scanner(System.in);
		
		
		while (!exit.equals("fine")) {
			System.out.print("Inserisci un desiderio: ");
			wish = s.nextLine();
			
			list.add(wish);
			
			System.out.println("La lista contiene: " + list.size() + " desideri" );
			System.out.print("Se vuoi fermarti digita fine, senno digita continua: ");
			exit = s.nextLine();
			
		}
		
		s.close();
		
		Collections.sort(list);
		System.out.println("Lista desideri: " + list);
	}
	
}
