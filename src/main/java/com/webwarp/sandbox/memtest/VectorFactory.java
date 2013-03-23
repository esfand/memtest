package com.webwarp.sandbox.memtest;

public class VectorFactory implements ObjectFactory {

    public Object makeObject() {
        return new java.util.Vector(10);
    }
}