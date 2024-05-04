package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    // Com o prototype scope, é criado dois diferentes objetos, mesmo que referenciando a mesma classe

    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi confirmado");
    }
    public void enviarMensagemBoasVindas() {
        financeiro.setEmail("tech@dio.com.br");
        System.out.println(financeiro);
        System.out.println("Bem-vindo à Tech Elite");
    }
}
