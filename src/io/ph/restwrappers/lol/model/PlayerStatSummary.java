
package io.ph.restwrappers.lol.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerStatSummary {

    @SerializedName("playerStatSummaryType")
    @Expose
    private String playerStatSummaryType;
    @SerializedName("aggregatedStats")
    @Expose
    private AggregatedStats aggregatedStats;
    @SerializedName("modifyDate")
    @Expose
    private Integer modifyDate;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("losses")
    @Expose
    private Integer losses;

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public void setPlayerStatSummaryType(String playerStatSummaryType) {
        this.playerStatSummaryType = playerStatSummaryType;
    }

    public AggregatedStats getAggregatedStats() {
        return aggregatedStats;
    }

    public void setAggregatedStats(AggregatedStats aggregatedStats) {
        this.aggregatedStats = aggregatedStats;
    }

    public Integer getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Integer modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

}
