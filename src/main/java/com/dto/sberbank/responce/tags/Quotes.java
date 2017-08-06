package com.dto.sberbank.responce.tags;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quotes implements Serializable
{
    @SerializedName("date")
    private DateName dateName;

    public DateName getDateName() {
        return dateName;
    }

    public void setDateName(DateName dateName) {
        this.dateName = dateName;
    }
}
