package battle.starter;

import battle.events.OnClickTouch;
import battle.core.Player;
import battle.screens.PlaceScreen;
import battle.screens.PlayScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class Seafighter extends Game{

	Screen menu;
	Screen place;
	Screen play;
	
	private Player player1;
	private Player player2;
	private int height;
	private int width;

	@Override
	public void create() {
		setPlayer1(new Player());
		setPlayer2(new Player());
		
		//menu = new MainMenuScreen(this);
        place = new PlaceScreen(this);
       
       
        setScreen(place);
	
	}
	
	public void initPlay(){
		 play = new PlayScreen(this);
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public void gesture(OnClickTouch onClickTouch){
		
		if (onClickTouch.getX() >= 0 && onClickTouch.getY() >= 0){
			this.getPlayer1().play(onClickTouch.getX(), onClickTouch.getY(),this.getPlayer2());
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public Screen getPlay(){
		return play;
	}
	
}
