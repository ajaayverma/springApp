package main.aku.org.DI;

public class MyApplication {

    private EmailService email = new EmailService();

    /*private EmailService emailService;*/

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}