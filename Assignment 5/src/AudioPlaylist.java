import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class AudioPlaylist extends Application{
	private ArrayList<AudioClip> playlist;
	private Button play, stop, next, reset;
	private int track;

	@Override 
	public void start(Stage primaryStage){
		//INITIALIZING
		track=0;
		playlist = new ArrayList<AudioClip>();
	
		//ARRAYLIST OF SONGS
		//Gurysborough Trian - Stan Rogers
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s0hjwKD6Nohh&command=download_mp3"));
		//For What It's Worth - Buffalo Springfield
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s0TB0nTjNQMY&command=download_mp3"));
		//Tom Sawyer - Rush
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s0Q7jI4bWC9F&command=download_mp3"));
		//Eye in the Sky - Alan Parsons Project
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s0pjoqO7cVAh&command=download_mp3"));
		//90's Game of Thones Theme
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s11RZKcSrT4o&command=download_mp3"));
		//Heart of Gold - Neil Young
		playlist.add(new AudioClip("http://vocaroo.com/media_command.php?media=s1nV8AIV7HUr&command=download_mp3"));
		
		
		//SETUP BUTTONS
		play = new Button("PLAY");
		play.setStyle("-fx-font:20 Arial");
		stop = new Button("STOP");
		stop.setStyle("-fx-font:20 Arial");
		next = new Button("NEXT");
		next.setStyle("-fx-font:20 Arial");
		reset = new Button("RESET");
		reset.setStyle("-fx-font:20 Arial");
		
		//GIVE BUTTONS COMMANDS
		play.setOnAction(this::processOnButtonClick);
		stop.setOnAction(this::processOnButtonClick);
		next.setOnAction(this::processOnButtonClick);
		reset.setOnAction(this::processOnButtonClick);
		
		//FLOWPANE
		FlowPane pane = new FlowPane(play,stop,next,reset);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: purple");

		//SCENE
		Scene scene = new Scene(pane, 300, 100);
		
		primaryStage.setTitle("Playlist");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	//BUTTON COMMANDS
	public void processOnButtonClick(ActionEvent event){
		//PLAY
		if(event.getSource()==play){
			playlist.get(track).play();
		}
		//STOP
		if(event.getSource()==stop){
			playlist.get(track).stop();
		}
		//NEXT
		if(event.getSource()==next){
			//STOPS TRACK
			playlist.get(track).stop();
			//IF SMALLER TRACK LESS THAN PLAYLIST SIZE, 
			if(track<playlist.size()){
				//ADD ONE TO TRACK
				track++;
			}
			//PLAY NEXT SONG
			playlist.get(track).play();
		}
		//RESET
		if(event.getSource()==reset){
			//STOPS CURRENT SONG
			playlist.get(track).stop();
			//GOES BACK TO FIRST SONG
			track=0;
		}
	}
	//MAIN METHOD
	public static void main(String[] args){
		Application.launch(args);
	}
}
