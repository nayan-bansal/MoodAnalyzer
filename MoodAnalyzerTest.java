package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {

@Test
public void Analyze() {

	MoodAnalyzer moodAnalyser = new  MoodAnalyzer();

	String mood = moodAnalyser.moodAnalyze("I am in Sad Mood");
	 assertSame("Please check the method in main", "SAD", mood);
}
}


