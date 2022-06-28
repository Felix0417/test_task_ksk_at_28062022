package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.certificationOrgan;

import java.util.Date;
import java.util.List;

public class CertificationOrgan {
    private String fullName;
    private String number;
    private Date dateReg;
    private String organ;
    private String head;
    private String addressLegal;
    private String address;
    private String phone;
    private String fax;
    private String email;
    private boolean ogrn;
    private List<Expert> experts;

    public CertificationOrgan(String fullName, String number, Date dateReg
            , String organ, String head, String addressLegal, String address
            , String phone, String fax, String email, boolean ogrn
            , List<Expert> experts) {
        this.fullName = fullName;
        this.number = number;
        this.dateReg = dateReg;
        this.organ = organ;
        this.head = head;
        this.addressLegal = addressLegal;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.ogrn = ogrn;
        this.experts = experts;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumber() {
        return number;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public String getOrgan() {
        return organ;
    }

    public String getHead() {
        return head;
    }

    public String getAddressLegal() {
        return addressLegal;
    }

    public String getAddress() {
        return address;
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

    public boolean isOgrn() {
        return ogrn;
    }

    public List<Expert> getExperts() {
        return experts;
    }
}
