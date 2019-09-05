package com.example.hibernate.helloworld;

public class Message {

	private String messageText;
	private int id;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Message [messageText=" + messageText + ", id=" + id + "]";
	}
	
	
}
