package com.nigel.puzzles;

public class NonStaticBlock {

	static {
		System.out.println("Inside Static Block");
	}

	{
		System.out.println("Inside Normal Block");
	}

	public NonStaticBlock(String message) {

		System.out.println(message);
	}

	public static void main(String[] args) {
		NonStaticBlock nonStaticBlock1 = new NonStaticBlock("First time");
		NonStaticBlock nonStaticBlock2 = new NonStaticBlock("Second time");
		NonStaticBlock nonStaticBlock3 = new NonStaticBlock("Third time");
		NonStaticBlock nonStaticBlock4 = new NonStaticBlock("Fourth time");
	}

}
