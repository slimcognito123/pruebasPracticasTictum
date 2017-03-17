package com.tt.ticinterview.services;
import com.tt.ticinterview.services.*;
/**
 * Created by Tictum on 15/03/2017.
 */

/**
 * En clase model.manager.InterviewerManager
 */
public class pruebaMain {
    public static void main(String[] args) {
        try {
            MailService mailService= new MailServiceImpl();
            mailService.send("fjnebrera@gmail.com", "patata kawaii","hoiiiiii I'm temmie");
        }
        catch(Exception e){
            final String msg = "Excepción en el envío de emails con recursos incrustados.";
            System.out.println("\033[33m"+msg);
            System.out.print("\033[32m"+e.getStackTrace());
            e.printStackTrace();
        }

    }
}
