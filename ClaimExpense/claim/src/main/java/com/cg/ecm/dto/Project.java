package com.cg.ecm.dto;

import java.sql.Date;

/**
 * Represents an Project
 * 
 * @author Durgesh Singh
 * @author Hari Galla
 * @author Soham Kasar
 * @author Lalit Kumar
 * @author Amanjot Singh
 * @author Adarsh Gupta
 * @author Vivek Kumar
 * @author Amit Yadav
 * @version 1.0
 */
public class Project {

    private long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String businessUnit;

    /**
     * Gets the Project's Id.
     * 
     * @return A Integer representing the Project's Id.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the Project's Id.
     * 
     * @param id A Integer containing the Project's Id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the Project's Name.
     * 
     * @return A String representing the Project's Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Project's Name.
     * 
     * @param name A String containing the Project's Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the Project's Description.
     * 
     * @return A String representing the Project's Description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the Project's Description.
     * 
     * @param description A String containing the Project's Description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the Project's Start Date.
     * 
     * @return A Date representing the Project's Start Date.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the Project's Start Date.
     * 
     * @param startDate A Date containing the Project's Start Date.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the Project's End Date.
     * 
     * @return A Date representing the Project's End Date.
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the Project's End Date.
     * 
     * @param endDate A Date containing the Project's End Date.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the Project's Business Unit.
     * 
     * @return A String representing the Project's Business Unit.
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the Project's Business Unit.
     * 
     * @param businessUnit A String containing the Project's Business Unit.
     */
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    /**
     * Create a Project without any Details
     * 
     */
    public Project() {
        super();
    }

    /**
     * Creates an Project with the specified Id.
     * 
     * @param id           The Project's Code.
     * @param name         the Project's Name.
     * @param description  The Project's Description.
     * @param startDate    The Project's Start Date.
     * @param endDate      The Project's end Date.
     * @param businessUnit The Project's Business Unit.
     */
    public Project(long id, String name, String description, Date startDate, Date endDate, String businessUnit) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.businessUnit = businessUnit;
    }

    /**
     * Creates an Project with the specified Id.
     * 
     * @param name         the Project's Name.
     * @param description  The Project's Description.
     * @param startDate    The Project's Start Date.
     * @param endDate      The Project's end Date.
     * @param businessUnit The Project's Business Unit.
     */
    public Project(String name, String description, Date startDate, Date endDate, String businessUnit) {
        super();
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.businessUnit = businessUnit;
    }

    /**
     * Returns The Project Details
     * 
     * @return a string representing the details about Project
     */
    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
                + ", endDate=" + endDate + ", businessUnit=" + businessUnit + "]";
    }
}