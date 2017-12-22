package com.java.ws.security;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WSSecurity {
	
	@WebMethod
	public String secureHello(){
		return "hello secure client";
	}
	
}
