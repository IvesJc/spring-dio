package dio.springboot;

import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Ives");
        user.setUsername("IvesJc");
        user.setPassword("senha");

        userRepository.save(user);

        for(User u : userRepository.findAll()){
            System.out.println(u);
        }
    }
}
