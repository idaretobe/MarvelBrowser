
package it.alessioricco.marvelbrowser.models.comics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Variant implements Serializable
{

    /**
     * 
     */
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    /**
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = -7470023579626439830L;

    /**
     * 
     * @return
     *     The resourceURI
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     * 
     * @param resourceURI
     *     The resourceURI
     */
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }


}
