package org.example;

public class Finishing extends Stage {
    double cost;

    Finishing(double cost) {
        super("Отделка");
        this.cost = cost;
    }

    @Override
    void start() {
        System.out.println("Начало  со стоимостью: " + cost + " рублей");
        this.status = StageStatus.IN_PROGRESS;
    }

    void finish() {
        System.out.println("Завершение отделки");
        this.status = StageStatus.COMPLETED;
    }
}
