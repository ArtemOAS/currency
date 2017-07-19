package com.dto.sberbank.responce.tags;



import com.google.gson.annotations.SerializedName;
import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Data implements Serializable{
    @SerializedName("meta")
    private Meta meta;
    @SerializedName("quotes")
    private Quotes quotes;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }
}
