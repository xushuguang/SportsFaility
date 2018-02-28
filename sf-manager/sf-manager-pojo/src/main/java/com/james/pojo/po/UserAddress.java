package com.james.pojo.po;

public class UserAddress {
    private Long aid;

    private Long uid;

    private String plot;

    private Long buildnum;

    private Long unitnum;

    private Long roomnum;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot == null ? null : plot.trim();
    }

    public Long getBuildnum() {
        return buildnum;
    }

    public void setBuildnum(Long buildnum) {
        this.buildnum = buildnum;
    }

    public Long getUnitnum() {
        return unitnum;
    }

    public void setUnitnum(Long unitnum) {
        this.unitnum = unitnum;
    }

    public Long getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Long roomnum) {
        this.roomnum = roomnum;
    }
}