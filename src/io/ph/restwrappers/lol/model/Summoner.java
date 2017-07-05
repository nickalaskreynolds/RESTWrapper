
package io.ph.restwrappers.lol.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summoner {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profileIconId")
    @Expose
    private Integer profileIconId;
    @SerializedName("revisionDate")
    @Expose
    private Integer revisionDate;
    @SerializedName("summonerLevel")
    @Expose
    private Integer summonerLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public Integer getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Integer revisionDate) {
        this.revisionDate = revisionDate;
    }

    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

}
