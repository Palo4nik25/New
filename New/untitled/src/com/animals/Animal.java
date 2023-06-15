package com.animals;
//this will be our Animal class, which will be used in the main class
public class Animal {
    //creating variables
    private String name;
    private String voice;
    private String breed;
    private int age;

    //creating a simple constructor
    public Animal(String name, String voice, String breed, int age) {
        setAttributes(name, voice, breed, age);
    }

    //creating setter
    private void setAttributes(String name, String voice, String breed, int age) {
        this.name = name;
        this.voice = voice;
        this.breed = breed;
        this.age = age;
    }

    //creating getter
    public String getValues() {
        StringBuilder result = new StringBuilder();
        result.append("My name is ").append(name).append(". My age is ").append(age).append(". I'm a ").append(breed).append(".\n");
        String generatedVoice = VoiceGenerator.generateVoice(voice, 3);
        result.append(generatedVoice);
        return result.toString();
    }
}
