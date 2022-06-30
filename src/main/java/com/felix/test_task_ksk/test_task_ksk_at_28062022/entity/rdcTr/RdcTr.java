package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.requisites.Requisites;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RdcTr {
    private String Type;
    private Requisites Requisites;
    private Applicant Applicant;
    private ApplicantUl ApplicantUl;
    private ApplicantFl ApplicantFl;
    private ApplicantAl ApplicantAl;
    private ApplicantAu ApplicantAu;
    private Manufacturer Manufacturer;
    private Product Product;
    private DeclareAddInfo DeclareAddInfo;
    private CertificationOrgan CertificationOrgan;
}
