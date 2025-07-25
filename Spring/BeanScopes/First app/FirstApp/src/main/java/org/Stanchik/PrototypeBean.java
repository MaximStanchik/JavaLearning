package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public void display() {
        System.out.println("Prototype Bean: " + this);
    }
}
