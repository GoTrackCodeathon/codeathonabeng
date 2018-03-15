/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import Model.Adminduk;
import java.util.List;

/**
 *
 * @author teamnoncore
 */
public interface AdmindukMapper {

    List<Adminduk> getFuzzyMatchCrimeJoinFIUReport();

    List<Adminduk> getFuzzyMatchCrimeJoinIntelReport();

    List<Adminduk> getFuzzyMatchCrimeJoinPep();

    List<Adminduk> getFuzzyMatchAdmindukJoinCrime();
}
