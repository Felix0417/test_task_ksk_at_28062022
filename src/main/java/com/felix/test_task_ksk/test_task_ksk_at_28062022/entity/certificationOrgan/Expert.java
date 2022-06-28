package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.certificationOrgan;

public class Expert {
    private String surname;
    private String name;
    private String patronymic;

    public Expert(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
