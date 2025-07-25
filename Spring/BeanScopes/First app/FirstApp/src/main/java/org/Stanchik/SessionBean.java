package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class SessionBean {
    public void display() {
        System.out.println("Session Bean: " + this);
    }
}
