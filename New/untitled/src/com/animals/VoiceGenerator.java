package com.animals;

// creating new class for generating the voice, using the loop for quantity of voices
public class VoiceGenerator {
    public static String generateVoice(String voice, int repetitions) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            res.append(voice).append(" ");
        }
        return res.toString();
    }
}