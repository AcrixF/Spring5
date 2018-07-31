package com.apress.prospring5.ch3.dependencylookup;

import com.apress.prospring5.ch3.Dependency;

public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection( Dependency dependency ) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
