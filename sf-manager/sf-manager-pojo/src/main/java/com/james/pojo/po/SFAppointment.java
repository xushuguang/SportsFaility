package com.james.pojo.po;

import java.util.Date;

public class SFAppointment {
    private Long id;

    private Long sfId;

    private Date timeQuantum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSfId() {
        return sfId;
    }

    public void setSfId(Long sfId) {
        this.sfId = sfId;
    }

    public Date getTimeQuantum() {
        return timeQuantum;
    }

    public void setTimeQuantum(Date timeQuantum) {
        this.timeQuantum = timeQuantum;
    }
}