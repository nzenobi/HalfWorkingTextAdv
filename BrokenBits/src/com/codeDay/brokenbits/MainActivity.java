package com.codeDay.brokenbits;

import textadventure.Player;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText cons;
	private Player playerDude;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		playerDude = new Player();
		EditText console = (EditText) findViewById(R.id.console);
		console.setText("Welcome");
		cons = console;
		Button butt = (Button) findViewById(R.id.button);
		butt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				playerDude.act(cons.getText().toString());
				cons.setText("");
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void append(String s){
		cons.append(s);
	}
	
	

}
