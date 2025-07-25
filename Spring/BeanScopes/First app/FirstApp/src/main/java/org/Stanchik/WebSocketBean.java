package org.Stanchik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "websocket")
public class WebSocketBean {
    public void display() {
        System.out.println("WebSocket Bean: " + this);
    }
}