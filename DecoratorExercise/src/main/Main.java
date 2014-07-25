package main;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import decorator.Chat;
import decorator.ChatImpl;
import decorator.LoggerDecorator;
import decorator.Message;
import decorator.ObsceneFilterDecorator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Chat chat = new LoggerDecorator(new ObsceneFilterDecorator(new ChatImpl()));
		Chat chat = new ObsceneFilterDecorator(new LoggerDecorator(new ChatImpl()));
		chat.send(new Message("cica", new Date(), "fuck"));
		System.out.println(chat.receive(1000, TimeUnit.DAYS));

	}

}
