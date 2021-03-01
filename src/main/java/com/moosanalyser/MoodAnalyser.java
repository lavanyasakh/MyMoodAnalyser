package com.moosanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.isEmpty())
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please Enter A message");
            if (message.contains("sad"))
                return "SAD";
        }catch(NullPointerException e) {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Mood Analyser Programming");
    }
}
