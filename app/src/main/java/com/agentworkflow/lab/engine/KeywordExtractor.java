package com.agentworkflow.lab.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility to extract keywords from user input.
 */
public class KeywordExtractor {
    
    private static final List<String> STOP_WORDS = Arrays.asList("i", "am", "feeling", "the", "a", "is", "my", "me", "want", "need", "to", "at", "in");

    public static List<String> extract(String input) {
        String[] words = input.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        List<String> keywords = new ArrayList<>();
        
        for (String word : words) {
            if (!STOP_WORDS.contains(word) && !word.isEmpty()) {
                keywords.add(word);
            }
        }
        return keywords;
    }
}
