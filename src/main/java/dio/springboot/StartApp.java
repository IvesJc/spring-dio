package dio.springboot;

import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.filtrarPorNome("Zé");
        for(User u : users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("Zé");
        user.setUsername("Zezinho");
        user.setPassword("senha");

        userRepository.save(user);

        for(User u : userRepository.findAll()){
            System.out.println(u);
        }
    }
}
