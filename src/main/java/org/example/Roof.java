package org.example;

public class Roof extends Stage {
    double area;

    Roof(double area) {
        super("Крыша");
        this.area = area;
    }

    @Override
    void start() {
        System.out.println("Начало крыши с площадью: " + area + " квадратных метров");
        this.status = StageStatus.IN_PROGRESS;
    }

    void finish() {
        System.out.println("Завершение крыши");
        this.status = StageStatus.COMPLETED;
    }
}
