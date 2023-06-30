package lu.uni.jakartaee.project3.graphqlapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryInfo {
    @JsonProperty("_id")
    private int id;
    private String iso2;
    private String iso3;
    private double lat;
    @JsonProperty("long")
    private double lng;
    private String flag;

    public int getId() {
        return id;
    }

    public String getIso2() {
        return iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getFlag() {
        return flag;
    }
}

