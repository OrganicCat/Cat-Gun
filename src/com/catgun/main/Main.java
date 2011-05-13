package com.catgun.main;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.protoshell.main.CatGunGame;

import android.app.Activity;
import android.os.Bundle;

public class Main extends AndroidApplication {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new CatGunGame(), false);
    }
}