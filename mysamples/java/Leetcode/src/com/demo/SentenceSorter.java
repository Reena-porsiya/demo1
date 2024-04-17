package com.demo;

public class SentenceSorter {

    public String sortSentence(String s) {
        String words[] = s.split(" ");
        int n = words.length;

        int[] nums = new int[n];
        String[] sortedWords = new String[n];

        for (int i = 0; i < n; i++) {
            int len = words[i].length();
            int num = Integer.parseInt(words[i].substring(len - 1));
            nums[i] = num;
            sortedWords[i] = words[i].substring(0, len - 1);
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int tempNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tempNum;

                    String tempWord = sortedWords[i];
                    sortedWords[i] = sortedWords[j];
                    sortedWords[j] = tempWord;
                }
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sortedWords[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        SentenceSorter sorter = new SentenceSorter();
        String shuffledSentence = "sentence4 a3 is2 This1";
        String originalSentence = sorter.sortSentence(shuffledSentence);
        System.out.println("Original Sentence: " + originalSentence);
    }
}
