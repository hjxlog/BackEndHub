package com.hjxlog.module.thread.sample03;

import java.util.concurrent.Callable;

public class CallerThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "实现Callable接口创建线程...";
    }
}
