package com.moodanalysertest;

import com.moosanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    static MoodAnalyser messageCheck = new MoodAnalyser(null);
    @Test
    public void givenNullPointeShouldReturnHappy() {
        Assertions.assertEquals("HAPPY", messageCheck.analyseMood());
    }

}
