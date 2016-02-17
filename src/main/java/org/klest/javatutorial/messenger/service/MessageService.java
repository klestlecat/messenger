package org.klest.javatutorial.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.klest.javatutorial.messenger.model.Message;

public class MessageService {

	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message (1L, "Hello World", "Klest");
		Message m2 = new Message (2L, "Hello Jersey", "Klest");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
}
