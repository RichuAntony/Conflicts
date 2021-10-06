package org.hydra;

import javax.swing.Spring;

public class Hail {
	private void captian() {
		System.out.println("captian");
		
	}
	public void ironMan() {
		System.out.println("ironMan");
		
		
	}
	private void thor() {
		System.out.println("thor");

		System.out.println("new joinee B");
		System.out.println("New joinee A");

	}
	public static void main(String[]args) {
		Hail a=new Hail();
		a.captian();
		a.ironMan();
		a.thor();
		
	}
	

}
