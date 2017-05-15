package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    private String mId;
    private MailMessage mMessage;
    public void buildAndSendMail(MailMan m,  String subject) {
        // Format the email address

        // Format the message given the content type and raw message
        // Send message
        m.send(getMid(), subject, mMessage);
    }
    // end::buildAndSendMail[]
    public void SetMid(String firstName,String lastName,String division){
         this.mId = firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
                + division.substring(0, 5) + ".compa.ny";
    }
    public String getMid(){
        return this.mId;
    }
    public void SetMessage(MailFont font, String message1, String message2, String message3){
        this.mMessage = formatMessage(font, message1 + message2 + message3);

    }
    public MailMessage getMessage(){
        return this.mMessage;
    }
//    public void SetmId()
    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}