package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.baseDeclaration;

import java.util.List;

public class BaseDeclaration {
    private String documents;
    private String schema;
    private List<Base> base;
    private List<Laboratory> laboratory;

    public BaseDeclaration(String documents, String schema, List<Base> base, List<Laboratory> laboratory) {
        this.documents = documents;
        this.schema = schema;
        this.base = base;
        this.laboratory = laboratory;
    }

    public String getDocuments() {
        return documents;
    }

    public String getSchema() {
        return schema;
    }

    public List<Base> getBase() {
        return base;
    }

    public List<Laboratory> getLaboratory() {
        return laboratory;
    }
}
