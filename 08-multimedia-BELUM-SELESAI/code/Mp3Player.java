import javax.media.Player;
import javax.media.NoPlayerException;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import java.io.IOException;
import java.io.File;
import java.net.URL;

public class Mp3Player {

	private Player audioPlayer = null;

	public Mp3Player(URL url) throws IOException, NoPlayerException, CannotRealizeException {
		audioPlayer = Manager.createRealizedPlayer(url);
	}

	public Mp3Player(File file) throws IOException, NoPlayerException, CannotRealizeException {
		this(file.toURL());
	}

	public void play() {
		audioPlayer.start();
	}

	public void stop() {
		audioPlayer.stop();
		audioPlayer.close();
	}

	public static void cetakPetunjuk() {
		System.out.println("Caranya: java Mp3Player <file-audio>");
	}

	public static void main(String args[]) {
		try {
			if(args.length == 1) {
				File audioFile = new File(args[0]);
				Mp3Player player = new Mp3Player(audioFile);

				System.out.println("Memutar file '" + audioFile.getAbsolutePath() + "'");
				System.out.println("Tekan Enter untuk keluar");
				player.play();

				System.in.read();
				System.out.println("Keluar");
				player.stop();
			} else {
				cetakPetunjuk();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
}
