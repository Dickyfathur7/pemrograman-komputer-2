import java.io.File;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.Line;

public class WavPlayer {
	public void play(String wavFile) {
		try {
			System.out.println("Mainkan file " + wavFile);
			File file = new File(wavFile);
			final Clip clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
			clip.addLineListener(new LineListener() {
				@Override 
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP) {
						clip.close();
					}
				}
			});

			System.out.println("memulai...");

			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Double d = clip.getMicrosecondLength() * 0.001;
			Thread.sleep(d.intValue() + 10);
			
			System.out.println("Proses pencetakan teks");

			System.out.println("Selesai");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		WavPlayer app = new WavPlayer();

		app.play(args[0]);
	}
}
