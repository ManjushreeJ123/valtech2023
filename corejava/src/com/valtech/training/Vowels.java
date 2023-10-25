package com.valtech.training;

////public class Vowels {
//
//	import java.util.*;
//	import java.lang.*;
//	import java.io.*;
//	 public class Vowels {
//	public static class pair
//	{
//	    int first;
//	    String last;
//	     
//	    pair(int first,String last)
//	    {
//	        this.first = first;
//	        this.last = last;
//	    }
//	}
//	 static boolean isVowel(char ch)
//	{
//	    ch = Character.toUpperCase(ch);
//	    return (ch == 'A' || ch == 'E' || 
//	            ch == 'I' || ch == 'O' ||
//	            ch == 'U');
//	}
//	 static int countVowels(String str)
//	{
//	    int count = 0;
//	    for(int i = 0; i < str.length(); i++)
//	     if (isVowel(str.charAt(i))) 
//	            ++count;
//	             
//	    return count;
//	}
//	 static void sortArr(String arr[], int n)
//	{
//	     ArrayList<pair> vp = new ArrayList<>();
//	     for(int i = 0; i < n; i++) 
//	    {
//	      vp.add(new pair(countVowels(arr[i]),arr[i]));
//	    }
//	 Collections.sort(vp, (a, b) -> a.first - b.first);
//	   for(int i = 0; i < vp.size(); i++)
//	        System.out.print(vp.get(i).last + " ");
//	}
//	public static void main(String[] args) 
//	{
//	    String arr[] = { "Hello", "How", "Are", "You" };
//	    int n = arr.length;
//	     sortArr(arr, n);
//	}
//	}

import java.util.Arrays;
import java.util.Comparator;

public class Vowels {
    public static void main(String[] args) {
        String str = "are you hello how";
        sortWordsByVowels(str);
    }

    public static void sortWordsByVowels(String str) {
        String[] words = str.split("\\s");
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return countVowels(s2) - countVowels(s1);
            }
        });

        System.out.println(String.join(" ", words));
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}