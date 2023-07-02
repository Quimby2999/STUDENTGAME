package studentgame;

public class Student {


    private static final int NEEDED_EXPERIENCE_LEVEL = 5;
    private static final int NEEDED_KNOWLEDGE_LEVEL = 5;

    public static final int DEFAULT_ENERGY_LEVEL = 10;
    public static final int DEFAULT_KNOWLEDGE_LEVEL = 0;
    public static final int DEFAULT_EXPERIENCE_LEVEL = 0;

    public static final int STUDY_GAIN = 1;
    public static final int PRACTICE_GAIN = 1;
    public static final int REST_GAIN = 1;

    public static final int STUDY_COST = 1;
    public static final int PRACTICE_COST = 2;

    private int knowledgeLevel = DEFAULT_KNOWLEDGE_LEVEL;
    private int experienceLevel = DEFAULT_EXPERIENCE_LEVEL;
    private int energyLevel = DEFAULT_ENERGY_LEVEL;
    private boolean hasJob = false;

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public boolean hasJob() {
        return hasJob;
    }

    public void study() {
        if (energyLevel > 0) {
            knowledgeLevel += STUDY_GAIN;
            energyLevel -= STUDY_COST;
        }
    }

    public void practice() {
        if (energyLevel >= PRACTICE_COST) {
            experienceLevel += PRACTICE_GAIN;
            energyLevel -= PRACTICE_COST;
        }
    }

    public void rest() {
        energyLevel += REST_GAIN;
    }

    public void quit() {
        System.exit(0);
    }

    public void applyForJob() {
        // if (knowledgeLevel >= 5 && experienceLevel >= 5) {
        //     hasJob = true;
        // } else {
        //     hasJob = false;
        // }
        hasJob = knowledgeLevel >= NEEDED_KNOWLEDGE_LEVEL && experienceLevel >= NEEDED_EXPERIENCE_LEVEL;
    }

}
