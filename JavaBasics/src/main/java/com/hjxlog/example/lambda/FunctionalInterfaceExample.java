package com.hjxlog.example.lambda;

import com.hjxlog.service.Command;

public class FunctionalInterfaceExample {

    private final Command command;

    public FunctionalInterfaceExample(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public static void main(String[] args) {
        // 使用Lambda表达式创建FunctionalInterfaceExample实例
        FunctionalInterfaceExample example = new FunctionalInterfaceExample(() -> {
            System.out.println("Command execute...");
        });
        example.executeCommand();
    }
}
