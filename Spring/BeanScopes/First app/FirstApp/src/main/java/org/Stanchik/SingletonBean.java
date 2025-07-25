package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {
    public void display() {
        System.out.println("Singleton Bean: " + this);
    }
}
