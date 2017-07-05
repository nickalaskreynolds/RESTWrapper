
package io.ph.restwrappers.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OverallStats {

    @SerializedName("win_rate")
    @Expose
    private Double winRate;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("prestige")
    @Expose
    private Integer prestige;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("rank_image")
    @Expose
    private String rankImage;
    @SerializedName("ties")
    @Expose
    private Integer ties;
    @SerializedName("games")
    @Expose
    private Integer games;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("comprank")
    @Expose
    private Integer comprank;

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getPrestige() {
        return prestige;
    }

    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public String getRankImage() {
        return rankImage;
    }

    public void setRankImage(String rankImage) {
        this.rankImage = rankImage;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getComprank() {
        return comprank;
    }

    public void setComprank(Integer comprank) {
        this.comprank = comprank;
    }

}
