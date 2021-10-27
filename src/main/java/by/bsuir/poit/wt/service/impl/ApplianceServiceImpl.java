package by.bsuir.poit.wt.service.impl;

import by.bsuir.poit.wt.dao.ApplianceDAO;
import by.bsuir.poit.wt.dao.DAOFactory;
import by.bsuir.poit.wt.entity.Appliance;
import by.bsuir.poit.wt.entity.criteria.Criteria;
import by.bsuir.poit.wt.service.ApplianceService;
import by.bsuir.poit.wt.service.validation.Validator;

/**
 *  Implementation of the {@link ApplianceService} interface, that represent Service layer
 */
public class ApplianceServiceImpl implements ApplianceService {

	/**
	 * Look for appliances with consumed criteria
	 *
	 * @param criteria  representation of the request params
	 * @return 			appliance, that meets criteria
	 */
	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		return applianceDAO.find(criteria);
	}
}