package com.dto.sberbank.responce;

import com.dto.sberbank.responce.tags.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Responce implements Serializable {

    @SerializedName("2")
    Data dataTwo;

    @SerializedName("3")
    Data dataThree;

    public Data getDataTwo() {
        return dataTwo;
    }

    public void setDataTwo(Data dataTwo) {
        this.dataTwo = dataTwo;
    }

    public Data getDataThree() {
        return dataThree;
    }

    public void setDataThree(Data dataThree) {
        this.dataThree = dataThree;
    }
}
