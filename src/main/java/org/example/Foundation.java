package org.example;

public class Foundation extends Stage {
    double soilVolume;

    Foundation(double soilVolume) {
        super("Фундамент");
        this.soilVolume = soilVolume;
    }

    @Override
    void start() {
        System.out.println("Начало фундамента с объем цемента: " + soilVolume + " кубических метров");
        this.status = StageStatus.IN_PROGRESS;
    }

    void finish() {
        System.out.println("Завершение фундамента");
        this.status = StageStatus.COMPLETED;
    }
}
