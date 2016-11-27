package eu.gestionservices.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Systeme {
	private static final Logger logger = LogManager.getLogger("HelloWorld");

	private String message;
	
	public void setMessage(String m) {
		message = m;
	}
	public String getMessage() {
		return message;
	}

}
