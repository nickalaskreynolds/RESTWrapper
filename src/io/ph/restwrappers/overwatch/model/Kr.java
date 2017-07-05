
package io.ph.restwrappers.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kr {

    @SerializedName("achievements")
    @Expose
    private Object achievements;
    @SerializedName("heroes")
    @Expose
    private Object heroes;
    @SerializedName("stats")
    @Expose
    private Stats stats;

    public Object getAchievements() {
        return achievements;
    }

    public void setAchievements(Object achievements) {
        this.achievements = achievements;
    }

    public Object getHeroes() {
        return heroes;
    }

    public void setHeroes(Object heroes) {
        this.heroes = heroes;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
