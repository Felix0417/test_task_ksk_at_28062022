package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.baseDeclaration;

import java.util.Date;

public class Laboratory {
    private String numberReg;
    private String name;
    private Date dateReg;
    private Date dateExpiry;
    private boolean document;
    private boolean info;

    public Laboratory(String numberReg, String name, Date dateReg, Date dateExpiry, boolean document, boolean info) {
        this.numberReg = numberReg;
        this.name = name;
        this.dateReg = dateReg;
        this.dateExpiry = dateExpiry;
        this.document = document;
        this.info = info;
    }

    public String getNumberReg() {
        return numberReg;
    }

    public String getName() {
        return name;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public Date getDateExpiry() {
        return dateExpiry;
    }

    public boolean isDocument() {
        return document;
    }

    public boolean isInfo() {
        return info;
    }
}
