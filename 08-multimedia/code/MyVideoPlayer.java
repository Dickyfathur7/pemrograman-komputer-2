import javafx.application.Application;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.media.Media;
import java.nio.file.Paths;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MyVideoPlayer extends Application {
	static String namaFile;

	public static void main(String args[]) {
		namaFile = args[0];
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// setting scene
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		Scene scene = new Scene(new Group(), width, height);
		primaryStage.setScene(scene);

		// name and display the stage
		primaryStage.setTitle("Pemutar Video-Qu");
		primaryStage.show();

		// setting media
		Media media = new Media(Paths.get(namaFile).toUri().toString());

		// setting player and play automatic
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);

		// create view
		MediaView mediaView = new MediaView(mediaPlayer);
		((Group) scene.getRoot()).getChildren().add(mediaView);
	}

}
