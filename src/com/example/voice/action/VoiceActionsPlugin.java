package com.example.voice.action;

import com.example.voice.actions.plugin.VoiceActionsTestReceiver;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;

public class VoiceActionsPlugin extends Activity{

	public static final String ACTION_INTENT = "com.android.voice.ACTION";
	private VoiceActionsTestReceiver receiver;
//		public static final String ACTION_INTENT = "com.pannous.voice.ACTION";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// register plugin programmatically 
		IntentFilter filter=new IntentFilter(ACTION_INTENT);
		receiver=new VoiceActionsTestReceiver();
		registerReceiver(receiver, filter);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		unregisterReceiver(receiver);
	}
}
