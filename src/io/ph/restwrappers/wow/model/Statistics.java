
package io.ph.restwrappers.wow.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {

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
    @SerializedName("subCategories")
    @Expose
    private List<SubCategory> subCategories = null;

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
    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}
