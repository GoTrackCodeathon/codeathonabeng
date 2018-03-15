/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author teamnoncore
 */
@ManagedBean(name = "resultBean")
@RequestScoped
public class ResultBean {

    public void verifyAccessIn() {
        try {
            String json = (String) FacesContext.getCurrentInstance().getApplication().createValueBinding("#{paramJSON}").getValue(FacesContext.getCurrentInstance());
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            HttpServletResponse response = (HttpServletResponse) context.getResponse();
            response.setContentType("application/json");
            response.getWriter().write(json.toString());
        } catch (Exception ex) {
        }
    }
}
