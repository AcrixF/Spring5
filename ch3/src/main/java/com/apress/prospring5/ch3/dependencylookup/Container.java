package com.apress.prospring5.ch3.dependencylookup;

public interface Container {
    Object getDependency( String key );
}
