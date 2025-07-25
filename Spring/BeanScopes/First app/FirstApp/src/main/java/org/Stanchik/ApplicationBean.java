package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class ApplicationBean {
    public void display() {
        System.out.println("Application Bean: " + this);
    }
}
