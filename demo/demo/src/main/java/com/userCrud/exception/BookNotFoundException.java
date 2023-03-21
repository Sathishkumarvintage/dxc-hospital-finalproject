package com.userCrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class BookNotFoundException  extends Exception
{
	private static final int serialVersionUID=1;

	public BookNotFoundException(String msg)
	{
		super(msg);
	}
}