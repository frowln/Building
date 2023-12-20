package org.example;

public class Walls extends Stage {
    int brickCount;

    Walls(int brickCount) {
        super("Стены");
        this.brickCount = brickCount;
    }

    @Override
    void start() {
        System.out.println("Начало стен с количеством кирпичей: " + brickCount);
        this.status = StageStatus.IN_PROGRESS;
    }

    void finish() {
        System.out.println("Завершение стен");
        this.status = StageStatus.COMPLETED;
    }
}
