package com.sapient.week4;

import java.util.*;

public class Week4_runner {

	public static void main(String[] args) {
		Week4 example = new Week4();
		example.addToMap();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Set<String> find= example.mp.get(input);
		Set<String> inp = new HashSet<>();
		String line;
		if(!find) {
			System.out.println("Can not find key.");
			System.out.println("Add key to map?");
			System.out.println("Y/N");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("Y")) {

			    while (sc.hasNextLine()){   
			       line=sc.nextLine();  
			       if(line.isEmpty()){      
			           break;
			       }           
			       inp.add(line);
			    }
				example.mp.put(input, inp);
			} else if(choice.equalsIgnoreCase("Y")) {
				System.out.println("___SAYONARA___");
			} else {
				System.out.println("Wrong Input");
			}
			if(choice.equalsIgnoreCase("Y")) {
				System.out.println("\nUpdated value of map is \n");
				for(String i : example.mp.keySet()) {
					System.out.println("key is " + i + " ,value is "+ example.mp.get(i));
				}
			}
		} 
		else {
			System.out.println(find);
		}
	}

}