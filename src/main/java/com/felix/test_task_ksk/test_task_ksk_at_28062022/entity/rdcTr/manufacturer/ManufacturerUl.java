package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.manufacturer;


import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Address;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Date;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Organ;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManufacturerUl {
    private String OrganForm;
    private String FullName;
    private com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Address Address;
    private String AddressActual;
    private String Phone;
    private String Fax;
    private String Email;
    private com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Organ Organ;
    private com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.applicantUl.Date Date;
    private double Ogrn;
    private int Inn;
}
