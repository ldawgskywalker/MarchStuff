import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class AudioPlaylist extends Application{
	private ArrayList<AudioClip> playlist = new ArrayList<AudioClip>();
	private Button play, stop, next;
	private int track;
	
	@Override 
	public void start(Stage primaryStage){
		track=0;
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
		
		
		
		play = new Button("PLAY");
		play.setStyle("-fx-font:20 Arial");
		stop = new Button("STOP");
		stop.setStyle("-fx-font:20 Arial");
		next = new Button("NEXT");
		next.setStyle("-fx-font:20 Arial");
		
		
		play.setOnAction(E->{
			playlist.get(track).play();
		});
		stop.setOnAction(E->{
			playlist.get(track).stop();
		});
		next.setOnAction(E->{
			track++;
		});
		
		FlowPane pane = new FlowPane(play,stop,next);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: cyan");
		
		Scene scene = new Scene(pane, 300, 100);
		
		primaryStage.setTitle("Playlist");
		primaryStage.setScene(scene);
		
	}
	
	public static void main(String[] args){
		
	}
}
