package com.hjxlog.module.thread.sample02;

public class Consumer {

//    private ThreadLocal<String> name = new ThreadLocal<>();

    private String name;
    public void printName(String param) {
//        name.set(param); // 在当前线程内设置name的值
        name = param;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // 设置中断标志
            throw new RuntimeException(e);      // 重新抛出异常
        }

        // 只会得到当前线程设置的name值，其他线程对其的更改不会影响到这里
//        if (!name.get().equals(param)) {
//            System.out.println("name:" + name.get() + ", param:" + param);
//        }
        if(!name.equals(param)){
            System.out.println("name:" + name + ", param:" + param);
        }
    }

}