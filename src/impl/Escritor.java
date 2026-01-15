package impl;

import inherits.UtensilioDeEscrita;

public class Escritor extends UtensilioDeEscrita {

    @Override
    public void write(String text) {
        System.out.println(text);
    }

}
