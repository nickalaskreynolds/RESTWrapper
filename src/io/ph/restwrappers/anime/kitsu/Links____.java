
package io.ph.restwrappers.anime.kitsu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links____ {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("related")
    @Expose
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

}
