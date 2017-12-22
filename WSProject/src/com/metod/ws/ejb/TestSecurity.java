package com.metod.ws.ejb;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestSecurity
 */
@Stateless
@LocalBean
public class TestSecurity {

    /**
     * Default constructor.
     */
    public TestSecurity() {
        // TODO Auto-generated constructor stub
    }

    @PermitAll
    @DenyAll
    @RolesAllowed("user")
    public String hello() {
        return "hello";
    }

}
