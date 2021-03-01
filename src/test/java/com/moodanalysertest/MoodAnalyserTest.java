package com.moodanalysertest;

import com.moosanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    static MoodAnalyser messageCheck = new MoodAnalyser();
    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        Assertions.assertEquals("SAD", messageCheck.analyseMood("I am Very sad"));
    }
    @Test
    public void givenMessageWhenNotSadShouldReturnHappy() {
        Assertions.assertEquals("HAPPY", messageCheck.analyseMood("I am Very good"));
    }
}
