package com.moosanalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Mood Analyser Program");
    }
}
