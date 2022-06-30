package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr;

import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.manufacturer.ManufacturerAl;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.manufacturer.ManufacturerFl;
import com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.rdcTr.manufacturer.ManufacturerUl;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Manufacturer {
    private String Type;
    private ManufacturerUl ManufacturerUl;
    private ManufacturerAl ManufacturerAl;
    private ManufacturerFl ManufacturerFl;
}
