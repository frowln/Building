package org.example;

abstract class Stage {
    String name;
    StageStatus status;

    Stage(String name) {
        this.name = name;
        this.status = StageStatus.PLANNED;
    }

    abstract void start();

    abstract void finish();
}

