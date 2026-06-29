package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean
//    public Alien alien() {
//        return new Alien();
//    }

//    @Bean
//    public Alien alien() {
//        Alien alien = new Alien();
//        alien.setAge(25);
//        alien.setComputer(desktop());
//        return alien;
//    }

    @Bean
//    public Alien alien(@Qualifier("desktop") Computer computer) {
        public Alien alien(Computer computer) {
        Alien alien = new Alien();
        alien.setAge(25);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
//    @Scope("prototype")
//    @Bean(name = "computer2")
//@Bean(name = {"computer2", "desktop", "Beast"})
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }
}
