package com.sdacademy.builderexample;

public class BuilderExample {

    public static void main(String[] args) {
        ConsoleWriter consoleWriter = new ConsoleWriter();

        App app = new App(consoleWriter);

        app.start();
    }

}
