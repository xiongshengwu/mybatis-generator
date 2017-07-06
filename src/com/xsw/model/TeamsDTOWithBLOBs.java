package com.xsw.model;

public class TeamsDTOWithBLOBs extends TeamsDTO {
    private String features;

    private String include;

    private String notinclude;

    private String guideid;

    private String carid;

    private String hotel;

    private String food;

    private String planticket;

    private String ticket;

    private String home;

    private String checkremark;

    private String paycoment;

    private String remark;

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include == null ? null : include.trim();
    }

    public String getNotinclude() {
        return notinclude;
    }

    public void setNotinclude(String notinclude) {
        this.notinclude = notinclude == null ? null : notinclude.trim();
    }

    public String getGuideid() {
        return guideid;
    }

    public void setGuideid(String guideid) {
        this.guideid = guideid == null ? null : guideid.trim();
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel == null ? null : hotel.trim();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    public String getPlanticket() {
        return planticket;
    }

    public void setPlanticket(String planticket) {
        this.planticket = planticket == null ? null : planticket.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getCheckremark() {
        return checkremark;
    }

    public void setCheckremark(String checkremark) {
        this.checkremark = checkremark == null ? null : checkremark.trim();
    }

    public String getPaycoment() {
        return paycoment;
    }

    public void setPaycoment(String paycoment) {
        this.paycoment = paycoment == null ? null : paycoment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}