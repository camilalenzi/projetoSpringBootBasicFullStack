package camila.camila;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroUsuarioController {

    @GetMapping("/consultaUsuario")
    public String  consultaUsuario(@RequestParam(name = "name") String nome){

            //logica de consulta usuario
            String retorno = nome;


            return retorno;
        }


    }




