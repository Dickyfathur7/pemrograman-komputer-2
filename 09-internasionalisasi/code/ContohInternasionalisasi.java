import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.util.Locale;
import java.util.ResourceBundle;

public class ContohInternasionalisasi extends Application {

	BorderPane root;
	Scene scene;
	MenuBar menu;
	Menu menuFile;
	Menu menuTools;
	Menu menuChangeLang;
	MenuItem menuExit;
	RadioMenuItem menuBahasa;
	RadioMenuItem menuEnglish;
	RadioMenuItem menuJapanese;
	Label label;
	Button btnShow;
	Locale currentLocale;
	ResourceBundle messages;
	
	public static void main(String args[]) {
		launch(args);
	}

	// init component
	private void initComponent() {
		root = new BorderPane();
		scene = new Scene(root, 480, 320);

		menu = new MenuBar();
		menuFile = new Menu("File");
		menuExit = new MenuItem("Exit");
		menuTools = new Menu("Tools");	
		menuChangeLang = new Menu("Change Language");
		menuBahasa = new RadioMenuItem("Bahasa");
		menuEnglish = new RadioMenuItem("English");
		menuJapanese = new RadioMenuItem("Japanese");
		

		menu.getMenus().add(menuFile);
		menuFile.getItems().add(menuExit);
		menu.getMenus().add(menuTools);
		menuTools.getItems().add(menuChangeLang);
		menuChangeLang.getItems().addAll(menuBahasa, menuEnglish, menuJapanese);

		root.setTop(menu);

		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
	
		label = new Label("Welcome");
		btnShow = new Button("Show");
		vbox.getChildren().addAll(label, btnShow);

		root.setCenter(vbox);

		ToggleGroup langGroup = new ToggleGroup();
		menuBahasa.setToggleGroup(langGroup);
		menuEnglish.setToggleGroup(langGroup);
		menuJapanese.setToggleGroup(langGroup);
		menuEnglish.setSelected(true);
	
		menuBahasa.setOnAction(new MenuBahasaOnClick());
		menuEnglish.setOnAction(new MenuEnglishOnClick());
		menuJapanese.setOnAction(new MenuJapaneseOnClick());
	}

	@Override
	public void start(Stage primaryStage) {
		initComponent();

		primaryStage.setTitle("Aplikasi Internasional");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void changeLanguage(ResourceBundle messages) {
		System.out.println(messages.getString("message"));
		menuFile.setText(messages.getString("file"));
		menuExit.setText(messages.getString("exit"));
		menuTools.setText(messages.getString("tools"));
		menuChangeLang.setText(messages.getString("changelang"));
		menuEnglish.setText(messages.getString("english"));
		menuJapanese.setText(messages.getString("japanese"));
		menuBahasa.setText(messages.getString("bahasa"));
		label.setText(messages.getString("message"));
		btnShow.setText(messages.getString("show"));
	}

	// --- inner class action

	private class MenuBahasaOnClick implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			currentLocale = new Locale("in", "ID");
			messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			changeLanguage(messages);
		}
	}

	private class MenuEnglishOnClick implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			currentLocale = new Locale("en", "US");
			messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			changeLanguage(messages);
		}
	}

	private class MenuJapaneseOnClick implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			currentLocale = new Locale("jp", "JP");
			messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			changeLanguage(messages);
		}
	}
	
}
