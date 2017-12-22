package com.java.ws.security;

import com.sun.xml.wss.impl.callback.PasswordValidationCallback.PasswordValidationException;
import com.sun.xml.wss.impl.callback.PasswordValidationCallback.PasswordValidator;
import com.sun.xml.wss.impl.callback.PasswordValidationCallback.Request;

public class MyPasswordValidator implements PasswordValidator {

	@Override
	public boolean validate(Request arg0) throws PasswordValidationException {
		// TODO Auto-generated method stub
		return true;
	}

}
