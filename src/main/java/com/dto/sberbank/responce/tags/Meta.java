package com.dto.sberbank.responce.tags;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;

public class Meta implements Serializable {
    @SerializedName("TTL")
    private String ttl;
    @SerializedName("TITLE")
    private String title;
    @SerializedName("TITLE_ENG")
    private String titleEnglish;
    @SerializedName("SCALE")
    private String scale;
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("id")
    private String id;
    @SerializedName("period")
    private String period;
    @SerializedName("startTS")
    private String startTS;
    @SerializedName("endTS")
    private String endTS;

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStartTS() {
        return startTS;
    }

    public void setStartTS(String startTS) {
        this.startTS = startTS;
    }

    public String getEndTS() {
        return endTS;
    }

    public void setEndTS(String endTS) {
        this.endTS = endTS;
    }
}
