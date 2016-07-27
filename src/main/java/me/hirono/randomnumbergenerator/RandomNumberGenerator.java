package me.hirono.randomnumbergenerator;

import java.util.Random;

/**
 * @author jeffery.hirono
 */
public class RandomNumberGenerator {
	public int getNumber() {
		Random rand = new Random();

		int  n = rand.nextInt(50) + 1;
		return n;
	}
}
