package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m,String mailid, MailMessage message,  String subject) {
        // Format the email address

        // Format the message given the content type and raw message
        // Send message
        m.send(mailid, subject, message);
    }
    // end::buildAndSendMail[]



//    public void SetmId()
    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    public class Mailid{
        public String Mailid(String firstName,String lastName,String division){
            return firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
                    + division.substring(0, 5) + ".compa.ny";
        }
    }
    public class Mailmesage{
        public MailMessage SetMessage(MailFont font, String message1, String message2, String message3){
            return formatMessage(font, message1 + message2 + message3);

        }
    }
    private class MailFont {


    }

    private class MailMessage {

    }

}