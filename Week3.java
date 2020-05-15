package com.sapient.week3;

import java.util.*;

public class Week3 {
    public static HashMap<Character, Integer> prime(int cnt){
        char[] characterSet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Boolean[] arr = new arr[Integer.MAX_VALUE];
		for(int i = 0; i < arr.size(); i++)
			arr[i] = true;
		
		
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int it = 0;
        for (int i = 1; i<Integer.MAX_VALUE; i++) {
            if(cnt == 0){
                break;
            }
			
			if(!arr[i])
				continue;
			
			

            for (int j = i+i; j <= Integer.MAX_VALUE; j+= i) {
                arr[j] = false;
            }
			hmap.put(characterSet[it],i);
			it = it+1;
			cnt = cnt - 1;
        }
        return hmap;
    }

    public static void HexCode(String sentence){
        try{
            HashMap<Character, Integer> hmap = prime(26);
            StringBuilder ans = new StringBuilder();
            sentence = sentence.toLowerCase();
            for(int i = 0;i<sentence.length();i++){
                char c = sentence.charAt(i);
                ans.append(Integer.toHexString(hmap.get(c)));
            }
            System.out.println(ans.toString().toUpperCase());
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("wrong sentence");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        HexCode(sentence);
        sc.close();
      }
}