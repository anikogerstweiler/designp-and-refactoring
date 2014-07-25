package main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Invoker implements Runnable {
	
	private static final int PROCESSING_BUFFER_SIZE = 1024;

	private static final int UNDO_BUFFER_SIZE = 1024;

	private BlockingQueue<Command> commands = new ArrayBlockingQueue<>(PROCESSING_BUFFER_SIZE);
	
	private Command[] executedCommand = new Command[UNDO_BUFFER_SIZE];
	private int writePointer = 0;
	
	private Accounting accounting;
	
	public Invoker(Accounting accounting) {
		this.accounting = accounting;
		new Thread(this).start();
	}

	public void add(Command command) {
		commands.add(command);
	}
	
	public void undo(long id) {
		for (int i = 0; i < UNDO_BUFFER_SIZE; i++) {
			Command command = executedCommand[i];
			if (command != null && command.getId() == id) {
				command.undo(accounting);
				executedCommand[i] = null;
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			if (commands.isEmpty()) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				Command command = commands.poll();
				command.execute(accounting);
				executedCommand[writePointer] = command;
				writePointer = (writePointer + 1) % UNDO_BUFFER_SIZE;
			}
		}
		
	}
	
	
}
