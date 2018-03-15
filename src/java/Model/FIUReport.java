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
public class FIUReport {

    private String accNumber;
    private String name;
    private Date dob;
    private String destinationAcc;
    private String crimeIndication;

    /**
     * @return the accNumber
     */
    public String getAccNumber() {
        return accNumber;
    }

    /**
     * @param accNumber the accNumber to set
     */
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

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
     * @return the destinationAcc
     */
    public String getDestinationAcc() {
        return destinationAcc;
    }

    /**
     * @param destinationAcc the destinationAcc to set
     */
    public void setDestinationAcc(String destinationAcc) {
        this.destinationAcc = destinationAcc;
    }

    /**
     * @return the crimeIndication
     */
    public String getCrimeIndication() {
        return crimeIndication;
    }

    /**
     * @param crimeIndication the crimeIndication to set
     */
    public void setCrimeIndication(String crimeIndication) {
        this.crimeIndication = crimeIndication;
    }
}
