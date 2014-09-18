package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class ActivityTwo extends Activity {
	TextView tw1;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		tw1 = (TextView) findViewById(R.id.textView1);
		//Intent intent = new Intent(this,MainActivity.class);
		String s = (String)getIntent().getSerializableExtra("Answer");
		tw1.setText(s);
	}
}
