package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		
		Playable x ,y;
		x = new Veena();
		y = new Saxophone();
		
		Veena veena = new Veena();
		
		Saxophone saxophone = new Saxophone();
		
		x.play();
		y.play();
		veena.play();
		saxophone.play();
	
		
		
	}

}
