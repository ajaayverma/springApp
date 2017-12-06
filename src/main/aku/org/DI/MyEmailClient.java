package main.aku.org.DI;

public class MyEmailClient {
    public static void main(String[] args) {
        MyApplication app;
        app = new MyApplication();
        app.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

}
