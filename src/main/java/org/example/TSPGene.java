package org.example;

import java.util.Objects;

public class TSPGene {
    private final int x;
    private final int y;

    TSPGene(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(final TSPGene other) {
        return Math.sqrt(Math.pow(getX() - other.getX(), 2D) + Math.pow(getY() - other.getY(), 2D));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSPGene tspGene = (TSPGene) o;
        return x == tspGene.x && y == tspGene.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "TSPGene{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
