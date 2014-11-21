package model.net;

import javax.mail.Message.RecipientType;
import org.codemonkey.simplejavamail.Email;
import org.codemonkey.simplejavamail.Mailer;
import org.codemonkey.simplejavamail.TransportStrategy;
import org.junit.Test;

/**
 *
 * @author skuarch
 */
public class TestingMail {

    @Test
    public void sendMail() {

        final Email email = new Email();

/*      email.setFromAddress("lollypop", "skuarch@gmail.com");
        email.setSubject("hey");
        email.addRecipient("C. Cane", "skuarch@gmail.com", RecipientType.TO);
        //email.addRecipient("C. Bo", "chocobo@candyshop.org", RecipientType.BCC);
        email.setText("We should meet up! ;)");
        email.setTextHTML("<img src='cid:wink1'><b>We should meet up!</b><img src='cid:wink2'>");
*/
        //new Mailer("smtp.gmail.com", 465, "skuarch", "Trex12sk",TransportStrategy.SMTP_SSL).sendMail(email);
        //si funciono
        
    }

}
