package com.james.pojo.po;

public class Community {
    private Long id;

    private String plot;

    private Long building;

    private Long element;

    private Long roomnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot == null ? null : plot.trim();
    }

    public Long getBuilding() {
        return building;
    }

    public void setBuilding(Long building) {
        this.building = building;
    }

    public Long getElement() {
        return element;
    }

    public void setElement(Long element) {
        this.element = element;
    }

    public Long getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Long roomnum) {
        this.roomnum = roomnum;
    }
}