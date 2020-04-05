package com.amitoli.model;

public enum Gender {
    MALE("Male",1),
    FEMALE("Female",2),
    OTHERS("Others",3);

    String value;
    int priority;
    Gender(String value, int priority) {
        this.value = value;
        this.priority= priority;
    }

    public String getValue() {
        return value;
    }
}
