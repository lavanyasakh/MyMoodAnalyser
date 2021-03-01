package com.moosanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        }catch(NullPointerException e) {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Mood Analyser Program");
    }
}
