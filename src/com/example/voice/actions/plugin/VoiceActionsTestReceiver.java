package com.example.voice.actions.plugin;

import static com.pannous.voice.plugins.PluginParams.*;

import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class VoiceActionsTestReceiver extends BroadcastReceiver {

	// SAY the keyword to activate this plugin!
	final String keyword="test";// plugin test
	
	final String source="http://test.com";

	// method has to return after 5 seconds!!! don't do any work here, just call an intent!
	@Override
	public void onReceive(Context context, Intent intent) {
		try {
			// what did Jeannie hear?
			String input = intent.getStringExtra("input");// SpeechRecognizer.RESULTS_RECOGNITION		

			Log.e("VoiceActionsTestReceiver","received "+input);

			// save feedback for Jeannie here:
			Bundle results = getResultExtras(true);		
			
			// do we handle the input?
			if(input==null||!input.contains(keyword))
				return;// only handle OUR keywords !!!
			
			// already handled?
			if(results.getBoolean(HANDLED, false)) 
				return;// some other app was faster
			
			results.putBoolean(HANDLED, true);	
			results.putString(HANDLED_BY, "VoiceActionsTestReceiver");
			results.putString(RESPONSE, "3rd party plugin test ok");
			// tell Jeannie what to do
			results.putString(ACTION, "hide");			
			
			// perform our action. ONLY via intent / thread !
			String intent0 = Intent.ACTION_VIEW;
			Intent action = new Intent(intent0);
			intent.setData(Uri.parse(source));
			context.startActivity(action);
			
			// method has to return after .2 seconds!!! don't do any work here, just start an intent!
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
