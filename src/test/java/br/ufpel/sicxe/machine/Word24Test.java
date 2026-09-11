package br.ufpel.sicxe.machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Word24Test {

    @Test
    void shouldKeepValueThatFitsIn24Bits() {
        assertEquals(0x123456, Word24.normalize(0x123456));
    }

    @Test
    void shouldTruncateValueLargerThan24Bits() {
        assertEquals(0x345678, Word24.normalize(0x12345678));
    }

    @Test
    void shouldKeepMaximum24BitValue() {
        assertEquals(0xFFFFFF, Word24.normalize(0xFFFFFF));
    }

    @Test
    void shouldKeepZero() {
        assertEquals(0, Word24.normalize(0));
    }
}
