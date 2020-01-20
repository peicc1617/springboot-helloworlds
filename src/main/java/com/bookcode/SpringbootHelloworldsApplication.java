package com.bookcode;

import com.bookcode.model.User;
import com.bookcode.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootHelloworldsApplication  {

    private static final Logger log= LoggerFactory.getLogger(SpringbootHelloworldsApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldsApplication.class, args);
    }
    /*@Bean
    public CommandLineRunner demo(UserRepository userRepository){
        return (args)->{
            log.info("开始执行");
//            userRepository.save(new User("zhangsan","111@qq.com"));
            log.info("Users found with findAll()");
            log.info("-------------------------");
            for (User user:userRepository.findAll()) {
                log.info(user.toString());
            }
        };
    }*/
}
