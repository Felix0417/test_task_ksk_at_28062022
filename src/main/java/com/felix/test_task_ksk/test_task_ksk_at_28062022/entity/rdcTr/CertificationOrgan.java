package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertificationOrgan {
    private String FullName;
    private String Number;
    private Date DateReg;
    private String Organ;
    private String Head;
    private String AddressLegal;
    private String Address;
    private String Phone;
    private String Fax;
    private String Email;
    private com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.certificationOrgan.Ogrn Ogrn;
    private com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.certificationOrgan.Experts Experts;
}
