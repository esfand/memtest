package com.webwarp.sandbox.memtest;

import java.util.*;

public class FullLinkedListFactory implements ObjectFactory {

    public Object makeObject() {
        LinkedList result = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            result.add(new Object());
        }
        return result;
    }
}