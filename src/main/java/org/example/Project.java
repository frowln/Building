package org.example;

public class Project extends Stage {
    Project() {
        super("Проект");
    }

    @Override
    void start() {
        System.out.println("Начало проекта");
        this.status = StageStatus.IN_PROGRESS;
    }

    @Override
    void finish() {
        System.out.println("Проект завершился");
        this.status = StageStatus.COMPLETED;
    }
}
