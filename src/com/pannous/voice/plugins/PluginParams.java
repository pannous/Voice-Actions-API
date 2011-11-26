package com.pannous.voice.plugins;

public class PluginParams {

	// let Jeannie and other plugins know if the action was already handled
	public static final String HANDLED = "HANDLED";
	
	// let Jeannie know which plugin reacted
	public static final String HANDLED_BY = "HANDLED_BY";

	// let Jeannie speak the answer
	public static final String RESPONSE="RESPONSE";
	
	
	// let Jeannie learn which keywords belong to this Action! 
	public static final String KEYWORDS = "KEYWORDS";

//	public static final String INTENT= "INTENT";
//	public static final String DATA= "DATA";

	// let Jeannie know the context
	public static final String SOURCE = "SOURCE";
	
//	tell Jeannie to keep listening!
	public static final String LISTEN_IN_BACKGROUND= "LISTEN_IN_BACKGROUND"; 

//	// give Jeannie an image
//	public static final String IMAGE= "IMAGE"; // via action "show image"

	// give Jeannie an action
	public static final String ACTION= "ACTION";

	// let Jeannie NOT speak when she performs the ACTION
	public static final String QUIET="QUIET";
	
	// let Jeannie know the subject/topic of this context (might not apply)
	public static final String SUBJECT = "SUBJECT";
	
	// let Jeannie know the person in this context (might not apply)
	public static final String PERSON = "PERSON";
}
