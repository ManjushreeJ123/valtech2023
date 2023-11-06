package com.valtech.assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catchy {
	public static String findMostCatchyNumber(List<String> numbers) {
		Map<String, Integer> catchyScores = new HashMap<>();
		for (String number : numbers) {
			int catchyScore = calculateCatchyScore(number);
			catchyScores.put(number, catchyScore);
		}
		String mostCatchyNumber = null;
		int maxScore = Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> entry : catchyScores.entrySet()) {
			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				mostCatchyNumber = entry.getKey();
			}
		}
		System.out.println(mostCatchyNumber);
		return mostCatchyNumber;
	}

	private static int calculateCatchyScore(String number) {
// Define your catchy criteria here.
// You can check for repetitive numbers, first half equals the second half, etc.
// Implement your scientific comparison logic.
// Example criteria (you can customize these):
		boolean isRepetitive = isRepetitive(number);
		boolean isEqualHalves = isEqualHalves(number);
// Assign a catchy score based on your criteria.
		int catchyScore = 0;
		if (isRepetitive) {
			catchyScore++;
		}
		if (isEqualHalves) {
			catchyScore++;
		}
		return catchyScore;
	}

	private static boolean isRepetitive(String number) {
// Check if the number has repetitive digits (e.g., "1111" or "99999999").
		return number.chars().distinct().count() <= 2;
	}

	private static boolean isEqualHalves(String number) {
// Check if the first half of the number is equal to the second half.
		int length = number.length();
		if (length % 2 == 0) {
			String firstHalf = number.substring(0, length / 2);
			String secondHalf = number.substring(length / 2);
			return firstHalf.equals(secondHalf);
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> phoneNumbers = List.of("11112222", "12121212", "999999999", "98765432");
		String mostCatchyPhoneNumber = findMostCatchyNumber(phoneNumbers);
		System.out.println("The most catchy phone number is: " + mostCatchyPhoneNumber);
	}
}
