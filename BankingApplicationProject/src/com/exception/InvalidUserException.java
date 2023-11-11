package com.exception;

public class InvalidUserException extends Exception
{

String msg;

	
	public InvalidUserException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return "Exception is:"+msg;
	}
}
