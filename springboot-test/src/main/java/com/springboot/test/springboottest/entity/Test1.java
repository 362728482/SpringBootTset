package com.springboot.test.springboottest.entity;

import java.util.List;

public class Test1 {

    /**
     * EBusinessID : 1109259
     * Traces : []
     * OrderCode :
     * ShipperCode : SF
     * LogisticCode : 118461988807
     * Success : false
     * Reason : null
     */

    private String EBusinessID;
    private String OrderCode;
    private String ShipperCode;
    private String LogisticCode;
    private boolean Success;
    private Object Reason;
    private List<?> Traces;

    public String getEBusinessID() {
        return EBusinessID;
    }

    public void setEBusinessID(String EBusinessID) {
        this.EBusinessID = EBusinessID;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String OrderCode) {
        this.OrderCode = OrderCode;
    }

    public String getShipperCode() {
        return ShipperCode;
    }

    public void setShipperCode(String ShipperCode) {
        this.ShipperCode = ShipperCode;
    }

    public String getLogisticCode() {
        return LogisticCode;
    }

    public void setLogisticCode(String LogisticCode) {
        this.LogisticCode = LogisticCode;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public Object getReason() {
        return Reason;
    }

    public void setReason(Object Reason) {
        this.Reason = Reason;
    }

    public List<?> getTraces() {
        return Traces;
    }

    public void setTraces(List<?> Traces) {
        this.Traces = Traces;
    }
}
