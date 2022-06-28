package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.applicantUI;

import java.util.List;

public class ApplicantUI {
    private String organForm;
    private String fullName;
    private boolean shortName;
    private String head;
    private String headPost;
    private String headText;
    private String address;
    private String addressActual;
    private String phone;
    private String fax;
    private String email;
    private boolean organ;
    private boolean date;
    private int ogrn;
    private int inn;
    private boolean regInfo;
    private boolean contract;

    public ApplicantUI(String organForm, String fullName, boolean shortName
            , String head, String headPost, String headText, String address
            , String addressActual, String phone, String fax, String email
            , boolean organ, boolean date, int ogrn, int inn
            , boolean regInfo, boolean contract) {
        this.organForm = organForm;
        this.fullName = fullName;
        this.shortName = shortName;
        this.head = head;
        this.headPost = headPost;
        this.headText = headText;
        this.address = address;
        this.addressActual = addressActual;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.organ = organ;
        this.date = date;
        this.ogrn = ogrn;
        this.inn = inn;
        this.regInfo = regInfo;
        this.contract = contract;
    }

    public String getOrganForm() {
        return organForm;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isShortName() {
        return shortName;
    }

    public String getHead() {
        return head;
    }

    public String getHeadPost() {
        return headPost;
    }

    public String getHeadText() {
        return headText;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressActual() {
        return addressActual;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public boolean isOrgan() {
        return organ;
    }

    public boolean isDate() {
        return date;
    }

    public int getOgrn() {
        return ogrn;
    }

    public int getInn() {
        return inn;
    }

    public boolean isRegInfo() {
        return regInfo;
    }

    public boolean isContract() {
        return contract;
    }
}
