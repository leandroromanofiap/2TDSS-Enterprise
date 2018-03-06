package br.com.fiap.jpa.exception;

public class MotoristaNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public MotoristaNotFoundException() {
		super();
	}

	public MotoristaNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MotoristaNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MotoristaNotFoundException(String message) {
		super(message);
	}

	public MotoristaNotFoundException(Throwable cause) {
		super(cause);
	}

}
