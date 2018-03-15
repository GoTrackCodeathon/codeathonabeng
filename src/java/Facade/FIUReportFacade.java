/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Config.MyBatisSqlSessionFactory;
import Mapper.FIUReportMapper;
import Model.FIUReport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author teamnoncore
 */
public class FIUReportFacade {

    public FIUReport getFIUReportByCategory(FIUReport fiuReport) throws SQLException {
        FIUReport objFIUReport = new FIUReport();
        SqlSession session = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            FIUReportMapper objFIUReportMapper = session.getMapper(FIUReportMapper.class);
            objFIUReport = objFIUReportMapper.getFIUReportByCategory(fiuReport);
            session.commit();
        } catch (Exception ex) {
            session.rollback();
        } finally {
            session.close();
        }
        return objFIUReport;
    }
}
