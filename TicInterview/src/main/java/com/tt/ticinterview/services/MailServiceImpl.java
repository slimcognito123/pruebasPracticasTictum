package com.tt.ticinterview.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.messaging.MessagingException;
import org.springframework.util.Assert;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;
import org.springframework.stereotype.Service;

/**
 * Created by Tictum on 15/03/2017.
 */
@Service(value = "Mail")
public class MailServiceImpl implements MailService{

    private static final Log log = LogFactory.getLog(MailServiceImpl.class);

    /** wrapper de Spring sobre javax.mail */
    private JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

    public void setMailSender(JavaMailSenderImpl mailSender) {
        this.mailSender = mailSender;
    }

    /** correo electrónico del remitente */
    private String from = "TicInterviews@gmail.com";

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    /** flag para indicar si está activo el servicio */
    public boolean active = true;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private static final File[] NO_ATTACHMENTS = null;

    /** envío de email
     * @param to correo electrónico del destinatario
     * @param subject asunto del mensaje
     * @param text cuerpo del mensaje
     */
    public void send(String to, String subject, String text) {
        send(to, subject, text, NO_ATTACHMENTS);
    }
    /** envío de email con attachments
     * @param to correo electrónico del destinatario
     * @param subject asunto del mensaje
     * @param text cuerpo del mensaje
     * @param attachments ficheros que se anexarán al mensaje
     */
    public void send(String to, String subject, String text, File... attachments) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS


        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "TicCubana123");
            }
        };
        Session session = Session.getInstance(props, auth);

        mailSender.setSession(session);
        // chequeo de parámetros
        Assert.hasLength(to, "email 'to' needed");
        Assert.hasLength(subject, "email 'subject' needed");
        Assert.hasLength(text, "email 'text' needed");

        // asegurando la trazabilidad
        if (log.isDebugEnabled()) {
            final boolean usingPassword = !"".equals(mailSender.getPassword());
            log.debug("Sending email to: '" + to + "' [through host: '" + mailSender.getHost() + ":"
                    + mailSender.getPort() + "', username: '" + mailSender.getUsername() + "' usingPassword:"
                    + usingPassword + "].");
            log.debug("isActive: " + active);
        }
        // el servicio esta activo?
        if (!active) return;

        // plantilla para el envío de email
        final MimeMessage message = mailSender.createMimeMessage();

        try {
            // el flag a true indica que va a ser multipart
            final MimeMessageHelper helper = new MimeMessageHelper(message, true);

            // settings de los parámetros del envío
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setFrom(getFrom());
            helper.setText(text);


            // adjuntando los ficheros
            if (attachments != null) {
                for (int i = 0; i < attachments.length; i++) {
                    FileSystemResource file = new FileSystemResource(attachments[i]);
                    helper.addAttachment(attachments[i].getName(), file);
                    if (log.isDebugEnabled()) {
                        log.debug("File '" + file + "' attached.");
                    }
                }
            }

        } catch (MessagingException e) {
            new RuntimeException(e);
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }

        // el envío
        this.mailSender.send(message);
    }
}
