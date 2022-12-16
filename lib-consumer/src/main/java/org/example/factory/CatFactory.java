package org.example.factory;

import org.example.Cat;

public class CatFactory {
    public static Cat createCat() {
        return new Cat("Richard");
    }
}
