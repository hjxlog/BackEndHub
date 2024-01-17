package com.hjxlog.service;

/**
 * 用于标识一个接口是一个函数式接口：@FunctionalInterface
 * 函数式接口是只包含一个抽象方法的接口
 * 编译器会在编译时检查该接口是否符合函数式接口的要求，即只包含一个抽象方法。如果接口包含多于一个的抽象方法，编译器将会报错。
 */
@FunctionalInterface
public interface Command {

    void execute();

}
