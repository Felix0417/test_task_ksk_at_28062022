package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    public String DeclareType;
    public String DcOriginType;
    public String Name;
    public String ProductInfo;
    public int Okp;
    public com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.OkpdText OkpdText;
    public com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.Standart Standart;
    public String SizeNumber;
    public com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.DetailsShippingDocumentation DetailsShippingDocumentation;
    public com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.ContractInfo ContractInfo;
    public String Info;
    public com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.PlaceMark PlaceMark;
    public transient com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.product.TechRegs TechRegs;
}
