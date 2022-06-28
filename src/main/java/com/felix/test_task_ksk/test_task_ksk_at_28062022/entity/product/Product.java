package com.felix.test_task_ksk.test_task_ksk_at_28062022.entity.product;

import java.util.List;

public class Product {
    private String declareType;
    private String dcOriginType;
    private String name;
    private String productInfo;
    private int okp;
    private boolean kpdText;
    private boolean standart;
    private String sizeNumber;
    private boolean detailsShippingDocumentation;
    private boolean contractInfo;
    private String info;
    private Boolean placeMark;
    private List<TechReg> techRegs;

    public Product(String declareType, String dcOriginType, String name
            , String productInfo, int okp, boolean kpdText, boolean standart
            , String sizeNumber, boolean detailsShippingDocumentation
            , boolean contractInfo, String info, Boolean placeMark
            , List<TechReg> techRegs) {
        this.declareType = declareType;
        this.dcOriginType = dcOriginType;
        this.name = name;
        this.productInfo = productInfo;
        this.okp = okp;
        this.kpdText = kpdText;
        this.standart = standart;
        this.sizeNumber = sizeNumber;
        this.detailsShippingDocumentation = detailsShippingDocumentation;
        this.contractInfo = contractInfo;
        this.info = info;
        this.placeMark = placeMark;
        this.techRegs = techRegs;
    }

    public String getDeclareType() {
        return declareType;
    }

    public String getDcOriginType() {
        return dcOriginType;
    }

    public String getName() {
        return name;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public int getOkp() {
        return okp;
    }

    public boolean isKpdText() {
        return kpdText;
    }

    public boolean isStandart() {
        return standart;
    }

    public String getSizeNumber() {
        return sizeNumber;
    }

    public boolean isDetailsShippingDocumentation() {
        return detailsShippingDocumentation;
    }

    public boolean isContractInfo() {
        return contractInfo;
    }

    public String getInfo() {
        return info;
    }

    public Boolean getPlaceMark() {
        return placeMark;
    }

    public List<TechReg> getTechRegs() {
        return techRegs;
    }
}
