/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Facade.AdmindukFacade;
import Facade.FIUReportFacade;
import Model.Adminduk;
import Model.FIUReport;
import Model.Suspect;
import com.google.gson.Gson;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jxe001
 */
@ManagedBean(name = "homeBean")
@RequestScoped
public class HomeBean {

    private String suspectedName;
    private String dataSource;

    // void main(String[] args)
    //@PostConstruct
    public void onload() {
        String json = "";
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            if (dataSource.equals("adminduk")) {
                List<Suspect> listResults = getFuzzymatchCrimeJoinFIUReport(suspectedName);
                if (listResults != null) {
                    json = new Gson().toJson(listResults);
                    //String results=(JSONArray)JSONSerializer.toJSON(listResults);
                }
            }
//            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
//            session.setAttribute("paramJSON", json);
//            context.getExternalContext().redirect("resultsJSON.xhtml");

            HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
            response.setContentType("application/json");
            response.getWriter().write(json.toString());
        } catch (Exception ex) {
        }
        // return json;
    }

    public List<Suspect> getFuzzymatchCrimeJoinFIUReport(String filter) {
        Levenshtein objLevensthein = new Levenshtein();
        List<Suspect> result = new ArrayList<Suspect>();
        try {
            AdmindukFacade objAdmindukFacade = new AdmindukFacade();
            List<Adminduk> listAdminduk = objAdmindukFacade.getAllFuzzyMatchCrimeJoinFIUReport();
            if (listAdminduk != null) {
                for (int i = 0; i < listAdminduk.size(); i++) {
                    int min = 70;
                    int ratio = objLevensthein.pecentageOfTextMatch(filter, listAdminduk.get(i).getNama());
                    if (ratio < min) {
                    } else {
                        Suspect objSuspect = new Suspect();
                        FIUReport paramFiuReport = new FIUReport();
                        paramFiuReport.setName(listAdminduk.get(i).getNama());
                        paramFiuReport.setDob(listAdminduk.get(i).getDob());

//                        FIUReport objFIUReport=new FIUReportFacade().getFIUReportByCategory(paramFiuReport);
//                        if(objFIUReport!=null)
//                        {
//                            objSuspect.setRelation(objFIUReport.getDestinationAcc());
//                        }
                        objSuspect.setName(listAdminduk.get(i).getNama());
                        objSuspect.setSimiliarity(ratio);
                        objSuspect.setNationality(listAdminduk.get(i).getNationality());
                        objSuspect.setDob(listAdminduk.get(i).getDob());
                        result.add(objSuspect);
                    }
                }
            }
        } catch (Exception ex) {
        }
        return result;
    }
    public List<Suspect> getFuzzymatchCrimeJoinIntel(String filter) {
        Levenshtein objLevensthein = new Levenshtein();
        List<Suspect> result = new ArrayList<Suspect>();
        try {
            AdmindukFacade objAdmindukFacade = new AdmindukFacade();
            List<Adminduk> listAdminduk = objAdmindukFacade.getFuzzyMatchCrimeJoinIntelReport();
            if (listAdminduk != null) {
                for (int i = 0; i < listAdminduk.size(); i++) {
                    int min = 70;
                    int ratio = objLevensthein.pecentageOfTextMatch(filter, listAdminduk.get(i).getNama());
                    if (ratio < min) {
                    } else {
                        Suspect objSuspect = new Suspect();
                        FIUReport paramFiuReport = new FIUReport();
                        paramFiuReport.setName(listAdminduk.get(i).getNama());
                        paramFiuReport.setDob(listAdminduk.get(i).getDob());

//                        FIUReport objFIUReport=new FIUReportFacade().getFIUReportByCategory(paramFiuReport);
//                        if(objFIUReport!=null)
//                        {
//                            objSuspect.setRelation(objFIUReport.getDestinationAcc());
//                        }
                        objSuspect.setName(listAdminduk.get(i).getNama());
                        objSuspect.setSimiliarity(ratio);
                        objSuspect.setNationality(listAdminduk.get(i).getNationality());
                        objSuspect.setDob(listAdminduk.get(i).getDob());
                        result.add(objSuspect);
                    }
                }
            }
        } catch (Exception ex) {
        }
        return result;
    }

    /**
     * @return the suspectedName
     */
    public String getSuspectedName() {
        return suspectedName;
    }

    /**
     * @param suspectedName the suspectedName to set
     */
    public void setSuspectedName(String suspectedName) {
        this.suspectedName = suspectedName;
    }

    /**
     * @return the dataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
}
