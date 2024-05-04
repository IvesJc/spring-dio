package dio.springboot;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

//    Prototype scope = A new object is created each time it is injected/looked up. It will use new SomeClass() each time.

//    Singleton scope = (Default) The same object is returned each time it is injected/looked up. Here it will instantiate one instance of SomeClass and then return it each time.

    @Bean
    @Scope("prototype")
    // @Scope : define o tipo de scope
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation");
        return remetente;
    }
}
