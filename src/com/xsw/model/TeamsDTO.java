package com.xsw.model;

import java.math.BigDecimal;
import java.util.Date;

public class TeamsDTO {
    private Long id;

    private String teamno;

    private String teamid;

    private String productid;

    private String otherteamid;

    private String roadname;

    private String startdate;

    private String starttime;

    private String enddate;

    private String endtime;

    private String days;

    private Date createtime;

    private Integer noticeday;

    private String paydate;

    private Integer numbers;

    private Integer child;

    private String type;

    private String status;

    private String updatestatus;

    private String groupstatus;

    private String paymentstatus;

    private String isshopping;

    private Integer room;

    private String orderflag;

    private String srcflag;

    private String peerid;

    private String peername;

    private String currency;

    private BigDecimal amount;

    private BigDecimal costamount;

    private String rate;

    private BigDecimal rateprice;

    private String calc;

    private BigDecimal calcamount;

    private BigDecimal firstcalc;

    private BigDecimal firstamount;

    private BigDecimal endamount;

    private String callname;

    private String mobile;

    private String email;

    private String callname1;

    private String mobile1;

    private String email1;

    private String organid;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Date checktime;

    private String checkuser;

    private String checkstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamno() {
        return teamno;
    }

    public void setTeamno(String teamno) {
        this.teamno = teamno == null ? null : teamno.trim();
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid == null ? null : teamid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getOtherteamid() {
        return otherteamid;
    }

    public void setOtherteamid(String otherteamid) {
        this.otherteamid = otherteamid == null ? null : otherteamid.trim();
    }

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname == null ? null : roadname.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate == null ? null : startdate.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getNoticeday() {
        return noticeday;
    }

    public void setNoticeday(Integer noticeday) {
        this.noticeday = noticeday;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUpdatestatus() {
        return updatestatus;
    }

    public void setUpdatestatus(String updatestatus) {
        this.updatestatus = updatestatus == null ? null : updatestatus.trim();
    }

    public String getGroupstatus() {
        return groupstatus;
    }

    public void setGroupstatus(String groupstatus) {
        this.groupstatus = groupstatus == null ? null : groupstatus.trim();
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus == null ? null : paymentstatus.trim();
    }

    public String getIsshopping() {
        return isshopping;
    }

    public void setIsshopping(String isshopping) {
        this.isshopping = isshopping == null ? null : isshopping.trim();
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(String orderflag) {
        this.orderflag = orderflag == null ? null : orderflag.trim();
    }

    public String getSrcflag() {
        return srcflag;
    }

    public void setSrcflag(String srcflag) {
        this.srcflag = srcflag == null ? null : srcflag.trim();
    }

    public String getPeerid() {
        return peerid;
    }

    public void setPeerid(String peerid) {
        this.peerid = peerid == null ? null : peerid.trim();
    }

    public String getPeername() {
        return peername;
    }

    public void setPeername(String peername) {
        this.peername = peername == null ? null : peername.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCostamount() {
        return costamount;
    }

    public void setCostamount(BigDecimal costamount) {
        this.costamount = costamount;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public BigDecimal getRateprice() {
        return rateprice;
    }

    public void setRateprice(BigDecimal rateprice) {
        this.rateprice = rateprice;
    }

    public String getCalc() {
        return calc;
    }

    public void setCalc(String calc) {
        this.calc = calc == null ? null : calc.trim();
    }

    public BigDecimal getCalcamount() {
        return calcamount;
    }

    public void setCalcamount(BigDecimal calcamount) {
        this.calcamount = calcamount;
    }

    public BigDecimal getFirstcalc() {
        return firstcalc;
    }

    public void setFirstcalc(BigDecimal firstcalc) {
        this.firstcalc = firstcalc;
    }

    public BigDecimal getFirstamount() {
        return firstamount;
    }

    public void setFirstamount(BigDecimal firstamount) {
        this.firstamount = firstamount;
    }

    public BigDecimal getEndamount() {
        return endamount;
    }

    public void setEndamount(BigDecimal endamount) {
        this.endamount = endamount;
    }

    public String getCallname() {
        return callname;
    }

    public void setCallname(String callname) {
        this.callname = callname == null ? null : callname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCallname1() {
        return callname1;
    }

    public void setCallname1(String callname1) {
        this.callname1 = callname1 == null ? null : callname1.trim();
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1 == null ? null : mobile1.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getOrganid() {
        return organid;
    }

    public void setOrganid(String organid) {
        this.organid = organid == null ? null : organid.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCheckuser() {
        return checkuser;
    }

    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }
}