package com.lpoo.battleship.desktop;

import battle.logic.MyGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.width = 1024;
		//config.height = 768;
		
		config.title = "BattleShip";
		new LwjglApplication(new MyGame(), config);
	}
}
