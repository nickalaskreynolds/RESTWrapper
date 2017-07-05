
package io.ph.restwrappers.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AverageStats {

    @SerializedName("solo_kills_avg")
    @Expose
    private Double soloKillsAvg;
    @SerializedName("objective_kills_avg")
    @Expose
    private Double objectiveKillsAvg;
    @SerializedName("objective_time_avg")
    @Expose
    private Double objectiveTimeAvg;
    @SerializedName("time_spent_on_fire_avg")
    @Expose
    private Double timeSpentOnFireAvg;
    @SerializedName("final_blows_avg")
    @Expose
    private Double finalBlowsAvg;
    @SerializedName("eliminations_avg")
    @Expose
    private Double eliminationsAvg;
    @SerializedName("deaths_avg")
    @Expose
    private Double deathsAvg;
    @SerializedName("damage_done_avg")
    @Expose
    private Double damageDoneAvg;
    @SerializedName("melee_final_blows_avg")
    @Expose
    private Double meleeFinalBlowsAvg;
    @SerializedName("healing_done_avg")
    @Expose
    private Double healingDoneAvg;

    public Double getSoloKillsAvg() {
        return soloKillsAvg;
    }

    public void setSoloKillsAvg(Double soloKillsAvg) {
        this.soloKillsAvg = soloKillsAvg;
    }

    public Double getObjectiveKillsAvg() {
        return objectiveKillsAvg;
    }

    public void setObjectiveKillsAvg(Double objectiveKillsAvg) {
        this.objectiveKillsAvg = objectiveKillsAvg;
    }

    public Double getObjectiveTimeAvg() {
        return objectiveTimeAvg;
    }

    public void setObjectiveTimeAvg(Double objectiveTimeAvg) {
        this.objectiveTimeAvg = objectiveTimeAvg;
    }

    public Double getTimeSpentOnFireAvg() {
        return timeSpentOnFireAvg;
    }

    public void setTimeSpentOnFireAvg(Double timeSpentOnFireAvg) {
        this.timeSpentOnFireAvg = timeSpentOnFireAvg;
    }

    public Double getFinalBlowsAvg() {
        return finalBlowsAvg;
    }

    public void setFinalBlowsAvg(Double finalBlowsAvg) {
        this.finalBlowsAvg = finalBlowsAvg;
    }

    public Double getEliminationsAvg() {
        return eliminationsAvg;
    }

    public void setEliminationsAvg(Double eliminationsAvg) {
        this.eliminationsAvg = eliminationsAvg;
    }

    public Double getDeathsAvg() {
        return deathsAvg;
    }

    public void setDeathsAvg(Double deathsAvg) {
        this.deathsAvg = deathsAvg;
    }

    public Double getDamageDoneAvg() {
        return damageDoneAvg;
    }

    public void setDamageDoneAvg(Double damageDoneAvg) {
        this.damageDoneAvg = damageDoneAvg;
    }

    public Double getMeleeFinalBlowsAvg() {
        return meleeFinalBlowsAvg;
    }

    public void setMeleeFinalBlowsAvg(Double meleeFinalBlowsAvg) {
        this.meleeFinalBlowsAvg = meleeFinalBlowsAvg;
    }

    public Double getHealingDoneAvg() {
        return healingDoneAvg;
    }

    public void setHealingDoneAvg(Double healingDoneAvg) {
        this.healingDoneAvg = healingDoneAvg;
    }

}
