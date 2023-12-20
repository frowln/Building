package org.example;

public class Building implements Construction {
    ConstructionStages constructionStages;
    Building() {
        constructionStages = new ConstructionStages();
    }

    @Override
    public void startConstruction() {
        Project project = new Project();
        project.start();
        constructionStages.addStage(project);

        constructionStages.addStage(new Foundation(100.0));
        constructionStages.addStage(new Walls(5000));
        constructionStages.addStage(new Roof(200.0));
        constructionStages.addStage(new Finishing(150000.0));

        System.out.println("Стройка началась");
    }

    @Override
    public void finishConstruction() throws ConstructionException {
        try {
            Stage currentStage = constructionStages.stages.getLast();
            currentStage.finish();
            System.out.println("Стройка завершилась");
        } catch (Exception e) {
            throw new ConstructionException("Строительство провалилось", e);
        }
    }
}
