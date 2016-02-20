package org.klest.javatutorial.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.klest.javatutorial.messenger.model.Message;
import org.klest.javatutorial.messenger.model.Profile;

public class DatabaseClass {

	// This is not thread safe he said??? (No concurrency protection in the following lines
	//It is just for the purposes of the tutorial
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
}
