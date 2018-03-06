package br.com.fiap.jpa.exception;

public class VeiculoNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public VeiculoNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VeiculoNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public VeiculoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public VeiculoNotFoundException(String message) {
		super(message);
	}

	public VeiculoNotFoundException(Throwable cause) {
		super(cause);
	}

}
