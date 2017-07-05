
package io.ph.restwrappers.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Competitive {

    @SerializedName("average_stats")
    @Expose
    private AverageStats averageStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats overallStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats gameStats;

    public AverageStats getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats averageStats) {
        this.averageStats = averageStats;
    }

    public OverallStats getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats overallStats) {
        this.overallStats = overallStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats gameStats) {
        this.gameStats = gameStats;
    }

}
