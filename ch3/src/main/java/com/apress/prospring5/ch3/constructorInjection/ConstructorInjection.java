package com.apress.prospring5.ch3.constructorInjection;

import com.apress.prospring5.ch3.Dependency;

public class ConstructorInjection {

    private Dependency dependency;

    // An obvious consequence of using constructor injection is that an object cannot be created without its
    // dependencies; thus, they are mandatory

    public ConstructorInjection ( Dependency dependency ) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
