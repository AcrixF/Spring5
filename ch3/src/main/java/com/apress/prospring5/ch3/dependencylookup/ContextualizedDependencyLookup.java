package com.apress.prospring5.ch3.dependencylookup;

import com.apress.prospring5.ch3.Dependency;

public class ContextualizedDependencyLookup implements ManagedComponent {

    private Dependency dependency;

    public void performLookup( Container container ) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString() {
        return  dependency.toString();
    }
}
