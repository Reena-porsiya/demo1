package com;

import java.util.stream.Stream;

public class FindEndWith {
	public static void main(String[] args) {
	Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
	
	stream.filter(str-> str.endsWith("s")).forEach(System.out::println);

}
}
