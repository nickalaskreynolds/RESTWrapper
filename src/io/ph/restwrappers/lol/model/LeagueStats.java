
package io.ph.restwrappers.lol.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueStats {

    @SerializedName("playerStatSummaries")
    @Expose
    private List<PlayerStatSummary> playerStatSummaries = null;
    @SerializedName("summonerId")
    @Expose
    private Integer summonerId;

    public List<PlayerStatSummary> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public void setPlayerStatSummaries(List<PlayerStatSummary> playerStatSummaries) {
        this.playerStatSummaries = playerStatSummaries;
    }

    public Integer getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Integer summonerId) {
        this.summonerId = summonerId;
    }

}
