/**
 * Created by Tictum on 15/03/2017.
 */
public class pruebaMain {
    public static void main(String[] args) {
        try {
            MailService mailService= new MailServiceImpl();
            mailService.send("p.nacarino.montiel@gmail.com", "patata kawaii","hoiiiiii I'm temmie");
        }
        catch(Exception e){
            final String msg = "Excepción en el envío de emails con recursos incrustados.";
            System.out.println("\033[33m"+msg);
            System.out.print("\033[32m"+e.getStackTrace());
            e.printStackTrace();
        }

    }
}
