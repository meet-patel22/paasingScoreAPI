package com.assignment;

import static org.junit.Assert.assertTrue;

public class ScoreManagerTest {
    public void testPassingScore() {
		ScoreManager sm = new ScoreManager() ;
		//sm.checkPassingScore(1) ;
		assertTrue(sm.checkPassingScore(1));
		assertTrue(sm.checkPassingScore(6));
		assertTrue(sm.checkPassingScore(8));
		
	}

}
