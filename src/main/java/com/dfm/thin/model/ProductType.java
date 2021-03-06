package com.dfm.thin.model;

import java.io.Serializable;

/**
 * ProductType definition.
 * 
 * This file was generated by Ignite Web Console (04/27/2019, 18:13)
 **/
public class ProductType implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for description. */
    private String description;

    /** Value for name. */
    private String name;

    /** Value for id. */
    private long id;

    /** Empty constructor. **/
    public ProductType() {
        // No-op.
    }

    /** Full constructor. **/
    public ProductType(String description,
        String name,
        long id) {
        this.description = description;
        this.name = name;
        this.id = id;
    }

    /**
     * Gets description
     * 
     * @return Value for description.
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Sets description
     * 
     * @param description New value for description.
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets name
     * 
     * @return Value for name.
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * 
     * @param name New value for name.
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets id
     * 
     * @return Value for id.
     **/
    public long getId() {
        return id;
    }

    /**
     * Sets id
     * 
     * @param id New value for id.
     **/
    public void setId(long id) {
        this.id = id;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof ProductType))
            return false;
        
        ProductType that = (ProductType)o;

        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        

        if (id != that.id)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = description != null ? description.hashCode() : 0;

        res = 31 * res + (name != null ? name.hashCode() : 0);

        res = 31 * res + (int)(id ^ (id >>> 32));

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "ProductType [" + 
            "description=" + description + ", " + 
            "name=" + name + ", " + 
            "id=" + id +
        "]";
    }
}