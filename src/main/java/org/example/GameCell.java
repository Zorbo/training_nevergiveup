package org.example;

public enum GameCell {

    X(1),
    O(-1),
    E(0);

    public final int value;

    GameCell(int value) {
        this.value = value;
    }
}
