package com.tasks.collections;

import java.util.HashMap;
import java.util.Iterator;

public class Collections3 {
    public static void main(String[] args) {
        String string = "English texts for beginners to practice reading" +
                " and comprehension online and for free. Practicing your" +
                " comprehension of written English will both improve" +
                " your vocabulary and understanding of grammar and word order.";
        string = string.replaceAll("\\.","");

        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (Iterator<String> iterator = wordToCount.keySet().iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}


