package com.fin.proj.board.exception;

public class BoardException extends RuntimeException {
	public BoardException() {}
	
	public BoardException(String msg) {
		super(msg);
	}
}