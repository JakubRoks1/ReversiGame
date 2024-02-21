package org.example.entity;

public class DirectedMove {

    private Cell cell;

    private int[] direction;


    public DirectedMove(Cell cell, int[] direction) {
        this.cell = cell;
        this.direction = direction;
    }

    public Cell getCell() {
        return cell;
    }

    public int[] getDirection() {
        return direction;
    }
}

