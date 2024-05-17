package com;

import java.util.stream.Stream;

public class FindUppercase {

	public static void main(String[] args) {
		 Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks"); 
		 
		 stream.filter(str-> Character.isUpperCase(str.charAt(2))).forEach(System.out::println);

	}

}
