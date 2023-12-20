package org.example;

public class ConstructionStages implements StageInterface {

    CustomLinkedList stages;
    Node currentStageNode;

    ConstructionStages() {
        stages = new CustomLinkedList();
        currentStageNode = null;
    }

    void addStage(Stage stage) {
        stages.addStage(stage);
    }

    @Override
    public Stage next() {
        if (currentStageNode == null) {
            currentStageNode = stages.head;
        } else {
            currentStageNode = currentStageNode.next;
        }

        return (currentStageNode != null) ? currentStageNode.stage : null;
    }

    @Override
    public Stage prev() {
        if (currentStageNode != null) {
            currentStageNode = currentStageNode.prev;
        }

        return (currentStageNode != null) ? currentStageNode.stage : null;
    }
}
