/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Config.MyBatisSqlSessionFactory;
import Mapper.AdmindukMapper;
import Model.Adminduk;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author teamnoncore
 */
public class AdmindukFacade {

    public List<Adminduk> getAllFuzzyMatchCrimeJoinFIUReport() throws SQLException {
        List<Adminduk> admindukList = new ArrayList<Adminduk>();
        SqlSession session = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            AdmindukMapper objAdmindukMapper = session.getMapper(AdmindukMapper.class);
            admindukList = objAdmindukMapper.getFuzzyMatchCrimeJoinFIUReport();
            session.commit();
        } catch (Exception ex) {
            session.rollback();
        } finally {
            session.close();
        }
        return admindukList;
    }
    
    public List<Adminduk> getFuzzyMatchCrimeJoinIntelReport() throws SQLException {
        List<Adminduk> admindukList = new ArrayList<Adminduk>();
        SqlSession session = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            AdmindukMapper objAdmindukMapper = session.getMapper(AdmindukMapper.class);
            admindukList = objAdmindukMapper.getFuzzyMatchCrimeJoinIntelReport();
            session.commit();
        } catch (Exception ex) {
            session.rollback();
        } finally {
            session.close();
        }
        return admindukList;
    }
    
     public List<Adminduk> getFuzzyMatchCrimeJoinPep() throws SQLException {
        List<Adminduk> admindukList = new ArrayList<Adminduk>();
        SqlSession session = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            AdmindukMapper objAdmindukMapper = session.getMapper(AdmindukMapper.class);
            admindukList = objAdmindukMapper.getFuzzyMatchCrimeJoinPep();
            session.commit();
        } catch (Exception ex) {
            session.rollback();
        } finally {
            session.close();
        }
        return admindukList;
    }
     
      public List<Adminduk> getFuzzyMatchAdmindukJoinCrime() throws SQLException {
        List<Adminduk> admindukList = new ArrayList<Adminduk>();
        SqlSession session = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            AdmindukMapper objAdmindukMapper = session.getMapper(AdmindukMapper.class);
            admindukList = objAdmindukMapper.getFuzzyMatchAdmindukJoinCrime();
            session.commit();
        } catch (Exception ex) {
            session.rollback();
        } finally {
            session.close();
        }
        return admindukList;
    }
}
