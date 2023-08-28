package com.bantunes82;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void shouldReturnNPEWhenParameterIsNull(){
        assertThrows(NullPointerException.class, () -> Email.of(null));
    }

}