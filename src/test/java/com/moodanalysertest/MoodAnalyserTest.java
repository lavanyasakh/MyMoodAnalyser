package com.moodanalysertest;

import com.moosanalyser.MoodAnalyser;
import com.moosanalyser.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    static String mood = null;
    @Test
    public void givenMessage_WhenNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood)
        }catch(MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
        @Test
        public void givenMessage_whenEmpty_ShouldThrowException() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            try {
                ExpectedException exceptionRule = ExpectedException.none();
                exceptionRule.expect(MoodAnalyserException.class);
                mood = moodAnalyser.analyseMood();
                Assertions.assertEquals("HAPPY",mood);
            } catch (MoodAnalyserException e) {
                Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
            }

}
