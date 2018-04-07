package com.james.pojo.po;

public class SFRepairs {
    private Long id;

    private Long sfId;

    private String badSpot;

    private String causeDamage;

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

    public String getBadSpot() {
        return badSpot;
    }

    public void setBadSpot(String badSpot) {
        this.badSpot = badSpot == null ? null : badSpot.trim();
    }

    public String getCauseDamage() {
        return causeDamage;
    }

    public void setCauseDamage(String causeDamage) {
        this.causeDamage = causeDamage == null ? null : causeDamage.trim();
    }
}