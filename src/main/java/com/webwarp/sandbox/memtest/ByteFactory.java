package com.webwarp.sandbox.memtest;

public class ByteFactory implements ObjectFactory {

    public Object makeObject() {
        return new Byte((byte) 33);
    }
}
