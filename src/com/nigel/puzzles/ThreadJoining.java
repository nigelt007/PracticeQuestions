package com.nigel.puzzles;

public class ThreadJoining extends Thread {

	public ThreadJoining(String name) {
		super(name);
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			}

			catch (Exception ex) {
				System.out.println("Exception has" + " been caught" + ex);
			}
			System.out.println(i);
		}
	}

}
