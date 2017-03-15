import java.io.File;

/**
 * Created by Tictum on 15/03/2017.
 */
public interface MailService {
    void send(String to, String subject, String text);

    void send(String to, String subject, String text, File... attachments);

}
