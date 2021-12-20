package com.tasks.collections;

import java.sql.SQLOutput;
import java.util.*;

public class Collections2 {
    public static void main(String[] args) {
        String words = "English texts for beginners to practice reading" +
                " and comprehension online and for free. Practicing your" +
                " comprehension of written English will both improve" +
                " your vocabulary and understanding of grammar and word order.";
        words = words.replaceAll("\\.", "");

        List<String> list = new ArrayList<>(List.of(words.toLowerCase().split(" ")));
        System.out.println(list);// Исходный набор слов в тексте

        Set<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);// Различающиеся слова
    }
}
