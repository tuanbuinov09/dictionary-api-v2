package com.example.demo.exception;

public class EnWordNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnWordNotFoundException(int id) {
		// TODO Auto-generated constructor stub
		super("Could not find enWord " + id);
	}
}
