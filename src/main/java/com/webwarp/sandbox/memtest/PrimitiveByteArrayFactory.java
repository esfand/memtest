package com.webwarp.sandbox.memtest;

public class PrimitiveByteArrayFactory implements ObjectFactory {

    public Object makeObject() {
        return new byte[1000];
    }
}