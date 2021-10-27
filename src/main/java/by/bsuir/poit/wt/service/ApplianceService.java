package by.bsuir.poit.wt.service;

import by.bsuir.poit.wt.entity.Appliance;
import by.bsuir.poit.wt.entity.criteria.Criteria;

/**
 * Interface that describe appliance Service layer
 */
public interface ApplianceService {
	/**
	 * Look for appliance that meet the criteria
	 *
	 * @param criteria container that contains request params
	 * @return requested appliance
	 * @see by.bsuir.poit.wt.service.impl.ApplianceServiceImpl
	 */
	Appliance find(Criteria criteria);
}
