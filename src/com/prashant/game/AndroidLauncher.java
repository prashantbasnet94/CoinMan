package com.prashant.game;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.prashant.game.CoinMan;

public class AndroidLauncher extends AndroidApplication {
	MediaController mediaController;
	MediaPlayer mediaPlayer;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
		mediaPlayer.start();
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new CoinMan(), config);

	}
}
