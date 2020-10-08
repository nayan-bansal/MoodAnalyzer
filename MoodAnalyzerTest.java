package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {

@Test
public void Analyze() {

	MoodAnalyzer moodAnalyser = new  MoodAnalyzer();

	String mood = moodAnalyser.moodAnalyze_Happy("I am in Happy Mood");
	 assertSame("Please check the method in main", "HAPPY", mood);
}
}


