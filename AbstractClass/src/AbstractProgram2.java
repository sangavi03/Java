abstract class Games{
	abstract void play();
	abstract void pause();
	abstract void stop();
	abstract void run();
}

class Mario extends Games{
	void play() {
		System.out.println("To play the game press green button.");
	}
	void pause() {
		System.out.println("To pause the game press yellow button.");
	}
	void stop() {
		System.out.println("To stop the game press red button.");
	}
	void run() {
		System.out.println("To run the game press blue button.");
	}
}
class PacMan extends Mario{
	void play() {
		System.out.println("To play the game press green button.");
	}
	void pause() {
		System.out.println("Game cannot be paused");
	}
	void stop() {
		System.out.println("To stop the game press red button.");
	}
	void run() {
		System.out.println("Game does not support run option for this game");
	}
}

public class AbstractProgram2 {

	public static void main(String[] args) {

		System.out.println("Game Mario: ");
		Mario mario = new Mario();
		mario.play();
		mario.pause();
		mario.play();
		mario.stop();
		mario.run();
		System.out.println("Game PacMan: ");
		PacMan pacman = new PacMan();
		pacman.play();
		pacman.pause();
		pacman.stop();
		pacman.run();
	}

}
