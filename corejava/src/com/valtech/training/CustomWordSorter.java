//package com.valtech.training;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class CustomWordSorter {
//	
//	private static class Word implements Comparable<Word>{
//		private String actualWorld;
//		private int vowelCount;
//		private float ratio;
//		
//		public Word(String word) {
//			actualWorld = word;
//			for(int i =0;i<word.length();i++) {
//				if("aeiouAEIOU".contains(""+word.charAt(i)));{
//				vowelCount++;
//			}
//		}
//		ratio = vowelCount * 1000 / word.length();
//		}
//		@Override
//		public int compareTo(Word o) {
//			// compare ratio...
//			if(ratio !=o.ratio) {
//				return (int) (o.ratio - ratio);
//			}
//			
//			// ratio is same...Compare the index 
//				if(ratio ==o.ratio) {
//			int length = actualWorld.length()>o.actualWorld.length()?
//					o.actualWorld.length():actualWorld.length();
//			for(int i=0;i<length;i++) {
//				if("aeiouAEIOU".equals(""+actualWorld.charAt(i))) {
//					return -1;
//				}
//				if("aeiouAEIOU".equals(""+o.actualWorld.charAt(i))) {
//					return 1;
//			}
//				}
//				
//			return 0;
//		}
//	
//	}
//
//	
//	public List<String>breakAndSort(String str){
//		//split the word 
//		List<String> segments = Arrays.asList(str.split(""));
//		//count vowels
//		//sort
//		List<Word> words = segments.stream().map(s -> new Word(s)).collect(Collectors.toList());
//		Collections.sort(words);
//		return words.stream().map(w->w.actualWorld).collect(Collectors.toList());
//		
//	return segments;
//		
//	}
//}
////public static void main(String[] args) {
////CustomWordSorter sorter = new CustomWordSorter();
////System.out.println(sorter.breakAndSort("Hello how are you"));
////System.out.println(sorter.brealAndSort(""));
////
////
////}
////	}
