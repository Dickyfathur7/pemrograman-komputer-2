import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

public class Mp3Player extends Application {

	static String namaFile;
	boolean isPlay;

	public static void main(String args[]) {
		namaFile = args[0];
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Media media = new Media(namaFile);
		final MediaPlayer mediaPlayer = new MediaPlayer(media);
		isPlay = false;

		final Button btn = new Button();
		btn.setText("Mainkan");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					if(!isPlay) {
						mediaPlayer.play();
						btn.setText("Berhenti");
						isPlay = true;
					} else {
						mediaPlayer.stop();
						btn.setText("Mulai");
						isPlay = false;
					}
				} catch(Exception e) { e.printStackTrace(); }
			}
		});

		StackPane root = new StackPane();
		root.getChildren().addAll(btn);

		Scene scene = new Scene(root, 350, 250);

		primaryStage.setTitle("Putar Mp3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
