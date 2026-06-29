package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
//    @Bean(name = "computer2")
//@Bean(name = {"computer2", "desktop", "Beast"})
    public Desktop desktop() {
        return new Desktop();
    }
}
