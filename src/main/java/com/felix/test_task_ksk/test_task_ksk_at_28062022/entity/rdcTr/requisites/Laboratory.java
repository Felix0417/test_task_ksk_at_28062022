package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.requisites;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laboratory {
    private String NumberReg;
    private String Name;
    private Date DateReg;
    private Date DateExpiry;
    private Document Document;
    private Info Info;
}
