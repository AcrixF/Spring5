package com.apress.prospring5.ch3.setterInjection;

import com.apress.prospring5.ch3.Dependency;

public class SetterInjection {

    // An obvious consequence of using setter injection is that an object can be created without its
    // dependencies, and they can be provided later by calling the setter
    private Dependency dependency;

    public void setDependency( Dependency dependency ) {
        this.dependency = dependency;
    }

    @Override
    public String toString(){
        return dependency.toString();
    }
}
