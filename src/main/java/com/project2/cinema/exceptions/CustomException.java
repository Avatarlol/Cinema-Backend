package com.project2.cinema.exceptions;

public abstract class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final boolean PRINT_FULL_STACKTRACE = false;
	
	public CustomException(String message) {
		super(message);
	}

	/**
	 * CustomExceptions printStackTrace function always prints the error message only unless PRINT_FULL_STACKTRACE is set to true.
	 */
	@Override
	public void printStackTrace() {
		if(PRINT_FULL_STACKTRACE) {
			super.printStackTrace();
		}else {
			System.err.println(super.getMessage());
		}
		
	}
	
}