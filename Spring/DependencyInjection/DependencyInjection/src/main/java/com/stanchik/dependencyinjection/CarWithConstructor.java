package com.stanchik.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithConstructor {
    private Engine engine;
    @Autowired
    public CarWithConstructor(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return this.engine;
    }
}
