package com.sapient.week4;

import java.util.*;

public class Week4 {
	Map<String, Set<String>> mp = new HashMap<> ();

	public void addToMap() {
		Set<String> st1 = new HashSet<>();
		st1.add("Good Morning");
		st1.add("Shubhodaya");
		st1.add("Subhsakal")
		st1.add("Shubhohday");
		st1.add("Bonjour");
		st1.add("Guten Morgen")

		Set<String> st2 = new HashSet<>();
		st2.add("Good Evening");
		st2.add("Shubha sange");
		st2.add("Subhratri")
		st2.add("Susandhya");
		st2.add("Bonsoir");
		st2.add("Guten Nacht")

		this.mp.put("GoodMorning",st1);
		this.mp.put("GoodEvening",st2);

	}
}