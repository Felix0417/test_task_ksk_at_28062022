package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity;

public class Applicant {
    private String applicantType;
    private String declarantType;

    public Applicant(String applicantType, String declarantType) {
        this.applicantType = applicantType;
        this.declarantType = declarantType;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public String getDeclarantType() {
        return declarantType;
    }
}
