package cosas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Tictum on 08/03/2017.
 */
@Controller
@RequestMapping("greet")
public class GreetController {


    @RequestMapping(method = RequestMethod.GET)
    public @ModelAttribute("fileFormBean") FileFormBean getInitialMessage() {
        return new FileFormBean();
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ModelAttribute("message") String guardaFichero(@ModelAttribute FileFormBean fileFormBean) {

        try {
            grabarFicheroALocal(fileFormBean);
        } catch (Exception e) {
            e.printStackTrace();
            return "No se ha podido grabar el fichero";
        }
        return "Fichero grabado correctamente";
    }

    private void grabarFicheroALocal(FileFormBean fileFormBean) throws Exception {
        CommonsMultipartFile uploaded = fileFormBean.getFichero();
        File localFile = new File("/"+uploaded.getOriginalFilename());
        FileOutputStream os = null;

        try {

            os = new FileOutputStream(localFile);
            os.write(uploaded.getBytes());

        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
