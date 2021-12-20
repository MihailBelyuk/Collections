package com.tasks.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        String words = "Arguments are scheduled to be" +
                "heard in Wake County Superior Court between" +
                "Jan. 3 and Jan. 5, with closing arguments planned" +
                "for Jan. 6. The state Supreme Court, which moved" +
                "last week to push back the primary election" +
                "by 10 weeks to May 17, has directed the panel to reach a decision by Jan. 11.";

        List<String> list = new ArrayList<>(List.of(words.split(" ")));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
