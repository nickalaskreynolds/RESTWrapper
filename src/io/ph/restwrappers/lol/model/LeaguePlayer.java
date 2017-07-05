
package io.ph.restwrappers.lol.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeaguePlayer {

    @SerializedName("arthurmcdoogal")
    @Expose
    private Summoner summoner;

    public Summoner getSummoner() {
        return summoner;
    }

    public void setSummoner(Summoner summoner) {
        this.summoner = summoner;
    }

}
