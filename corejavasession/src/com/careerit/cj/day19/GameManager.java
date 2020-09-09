package com.careerit.cj.day19;

import java.util.Scanner;

interface Game {
	void start();
	void play();
	void stop();
	
}

 abstract class AbstractGame implements Game{
	@Override
	public void start() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is going start");
	}
	@Override
	public void stop() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is going to stop");
	}

}
class Car extends AbstractGame implements Game {

	
	@Override
	public void play() {
		System.out.println("You are playing car game, please wear seat belt....");
	}

	
}

class Bike extends AbstractGame implements Game {
	@Override
	public void play() {
		System.out.println("You are playing Bike game, please wear  Helmet....");
	}

}

class Ship extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing Ship game, please wear life jocket....");
	}

	
}

public class GameManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Car 2. Bike 3. Ship");
		int ch = sc.nextInt();
		Game game = selectGame(ch);
		game.start();
		game.play();
		game.stop();
		sc.close();
	}

	private static Game selectGame(int ch) {
		Game game = null;
		if (ch == 1) {
			game = new Car();
		} else if (ch == 2) {
			game = new Bike();
		} else if (ch == 3) {
			game = new Ship();
		} else {
			throw new IllegalArgumentException("Please select valid game type only");
		}
		return game;

	}
}
