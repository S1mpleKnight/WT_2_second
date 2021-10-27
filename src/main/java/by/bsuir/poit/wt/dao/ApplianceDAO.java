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
     *
     * @param       criteria {@link Criteria} contains data to search appliance
     * @return      the appliance that meets required params
     */
    Appliance find(Criteria criteria);
}