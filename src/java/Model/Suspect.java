/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author teamnoncore
 */
public class Suspect {

    private String name;
    private String nationality;
    private Date dob;
    private String pob;
    private String relation;
    private int similiarity;
    private String remarks;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the pob
     */
    public String getPob() {
        return pob;
    }

    /**
     * @param pob the pob to set
     */
    public void setPob(String pob) {
        this.pob = pob;
    }

    /**
     * @return the relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * @param relation the relation to set
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * @return the similiarity
     */
    public int getSimiliarity() {
        return similiarity;
    }

    /**
     * @param similiarity the similiarity to set
     */
    public void setSimiliarity(int similiarity) {
        this.similiarity = similiarity;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
