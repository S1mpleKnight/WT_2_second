package by.bsuir.poit.wt.dao;

import by.bsuir.poit.wt.entity.Appliance;
import by.bsuir.poit.wt.entity.criteria.Criteria;

/**
 * Interface that describe Appliance DAO
 *
 * @version     1.0
 * @author      Zelezinski Ivan
 */
public interface ApplianceDAO {
    /**
     * Look for appliance that meets the criteria
     *
     * @param       criteria {@link Criteria} contains data to search appliance
     * @return      the appliance that meets required params
     * @see by.bsuir.poit.wt.dao.impl.ApplianceDAOImpl
     */
    Appliance find(Criteria criteria);
}