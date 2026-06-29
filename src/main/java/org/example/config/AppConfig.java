package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
//    @Bean(name = "computer2")
//@Bean(name = {"computer2", "desktop", "Beast"})
    public Desktop desktop() {
        return new Desktop();
    }
}
