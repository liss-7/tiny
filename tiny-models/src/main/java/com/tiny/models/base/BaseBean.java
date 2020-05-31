package com.tiny.models.base;

import java.io.Serializable;

public class BaseBean implements Serializable {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用析构");
        super.finalize();
    }
}
