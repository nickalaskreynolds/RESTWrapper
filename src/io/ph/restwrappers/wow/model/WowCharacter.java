
package io.ph.restwrappers.wow.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WowCharacter {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("lastModified")
    @Expose
    private Integer lastModified;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("realm")
    @Expose
    private String realm;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("battlegroup")
    @Expose
    private String battlegroup;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("class")
    @Expose
    private Integer _class;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("race")
    @Expose
    private Integer race;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("gender")
    @Expose
    private Integer gender;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("level")
    @Expose
    private Integer level;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("achievementPoints")
    @Expose
    private Integer achievementPoints;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("calcClass")
    @Expose
    private String calcClass;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("faction")
    @Expose
    private Integer faction;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("totalHonorableKills")
    @Expose
    private Integer totalHonorableKills;

    /**
     * 
     * (Required)
     * 
     */
    public Integer getLastModified() {
        return lastModified;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLastModified(Integer lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getRealm() {
        return realm;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getBattlegroup() {
        return battlegroup;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getClass_() {
        return _class;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setClass_(Integer _class) {
        this._class = _class;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getRace() {
        return race;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRace(Integer race) {
        this.race = race;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getAchievementPoints() {
        return achievementPoints;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setAchievementPoints(Integer achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getCalcClass() {
        return calcClass;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCalcClass(String calcClass) {
        this.calcClass = calcClass;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getFaction() {
        return faction;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setFaction(Integer faction) {
        this.faction = faction;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Statistics getStatistics() {
        return statistics;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getTotalHonorableKills() {
        return totalHonorableKills;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTotalHonorableKills(Integer totalHonorableKills) {
        this.totalHonorableKills = totalHonorableKills;
    }

}
