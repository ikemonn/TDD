package Bowling;

import java.awt.List;
import java.util.*;


public class Game {

	private int score = 0;
	private ArrayList<Integer> rolls = new ArrayList<Integer>();

	public void roll(int pins) {
		rolls.add(pins);
	}

	public int score() {
		for (int roll: rolls) {
			score += roll;
		}
		return score;
	}

}
