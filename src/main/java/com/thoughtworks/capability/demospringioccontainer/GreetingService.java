package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class GreetingService {
    public GreetingService() {
        System.out.println("create greeting service!");
    }

    private final Foo foo;
    private final Bar bar;

    public GreetingService(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    String sayHi() {
        foo.hi();
        bar.hi();
        return "hello world";
    }
}