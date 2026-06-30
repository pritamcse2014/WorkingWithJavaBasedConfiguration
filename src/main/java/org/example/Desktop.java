package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("computer2")
@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop");
    }

    @Override
    public void compile() {
        System.out.println("Compile Method Called Desktop");
    }
}
