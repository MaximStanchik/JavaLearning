package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class RequestBean {
    public void display() {
        System.out.println("Request Bean: " + this);
    }
}
