package javaForQA.lesson13_Func.Task1;

public enum Gender {

    MALE("Мужской"),
    FEMALE("Женский");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
