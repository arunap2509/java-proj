package com.company;

import java.util.HashMap;

public class RnaTranscription {
    public String GetRnaStrand(String dna) {
        StringBuilder rna = new StringBuilder();

        HashMap<Character, Character> mapping = new HashMap<>();

        mapping.put('G', 'C');
        mapping.put('C', 'G');
        mapping.put('T', 'A');
        mapping.put('A', 'U');

        if (dna == null) {
            return null;
        }

        for(int i = 0; i < dna.length(); i++) {
            rna.append(mapping.get(dna.charAt(i)));
        }

        return rna.toString();
    }
}
