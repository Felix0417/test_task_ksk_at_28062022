package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.Manufacturer.Manufacturer;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.applicantUI.ApplicantUI;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.certificationOrgan.CertificationOrgan;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.product.Product;

import java.util.List;

public class RdcTr {
    private String type;
    private List<Requisites> requisites;
    private List<Applicant> applicant;
    private List<ApplicantUI> applicantUI;
    private boolean applicantFl;
    private boolean applicantAl;
    private boolean applicantAu;
    private List<Manufacturer> manufacturer;
    private List<Product> product;
    private boolean declareAddInfo;
    private List<CertificationOrgan> certificationOrgan;

    public RdcTr(String type, List<Requisites> requisites
            , List<Applicant> applicant, List<ApplicantUI> applicantUI
            , boolean applicantFl, boolean applicantAl, boolean applicantAu
            , List<Manufacturer> manufacturer, List<Product> product
            , boolean declareAddInfo, List<CertificationOrgan> certificationOrgan) {
        this.type = type;
        this.requisites = requisites;
        this.applicant = applicant;
        this.applicantUI = applicantUI;
        this.applicantFl = applicantFl;
        this.applicantAl = applicantAl;
        this.applicantAu = applicantAu;
        this.manufacturer = manufacturer;
        this.product = product;
        this.declareAddInfo = declareAddInfo;
        this.certificationOrgan = certificationOrgan;
    }

    public String getType() {
        return type;
    }

    public List<Requisites> getRequisites() {
        return requisites;
    }

    public List<Applicant> getApplicant() {
        return applicant;
    }

    public List<ApplicantUI> getApplicantUI() {
        return applicantUI;
    }

    public boolean isApplicantFl() {
        return applicantFl;
    }

    public boolean isApplicantAl() {
        return applicantAl;
    }

    public boolean isApplicantAu() {
        return applicantAu;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public boolean isDeclareAddInfo() {
        return declareAddInfo;
    }

    public List<CertificationOrgan> getCertificationOrgan() {
        return certificationOrgan;
    }
}
