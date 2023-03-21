package com.userCrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class DoctorNotFoundException  extends Exception
{
	private static final int serialVersionUID=1;

	public DoctorNotFoundException(String msg)
	{
		super(msg);
	}
}
