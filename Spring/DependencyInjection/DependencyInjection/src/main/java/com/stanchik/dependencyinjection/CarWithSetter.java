package com.stanchik.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class CarWithSetter {
    private Engine engine;
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return this.engine;
    }
}
