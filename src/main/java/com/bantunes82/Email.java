package com.bantunes82;

import java.util.Objects;

//Value Object
public class Email {

    private final String value;

    private Email(String value) {
        this.value = value;
    }

    /**
     * Cria uma instancia de email valida
     * @param email um texto a ser validado
     * @return um instancia de email
     * @throws NullPointerException quando o parametro é nulo
     * @throws IllegalArgumentException quando a string nao é válida
     */
    public static Email of(String email){
        Objects.requireNonNull(email, "email is required");

        //faz validacao
        return new Email(email);
    }
}
