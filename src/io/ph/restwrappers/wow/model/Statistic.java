
package io.ph.restwrappers.wow.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistic {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private Integer id;
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
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("lastUpdated")
    @Expose
    private Integer lastUpdated;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("money")
    @Expose
    private Boolean money;

    /**
     * 
     * (Required)
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(Integer id) {
        this.id = id;
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
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getMoney() {
        return money;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMoney(Boolean money) {
        this.money = money;
    }

}
