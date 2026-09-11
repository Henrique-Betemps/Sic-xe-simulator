package br.ufpel.sicxe.machine;

public final class Word24 {

    public static final int MASK = 0xFFFFFF;

    private Word24() {
    }

    public static int normalize(int value) {
        return value & MASK;
    }
}
