package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.requisites;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Requisites {
    private String Status;
    private String Section;
    private String Number;
    private Date DateReg;
    private Date DateExpiry;
    private NoExpiry NoExpiry;
    private BaseDeclaration BaseDeclaration;
    private Discontinued Discontinued;
}
