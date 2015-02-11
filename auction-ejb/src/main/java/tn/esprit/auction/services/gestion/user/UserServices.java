package tn.esprit.auction.services.gestion.user;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.xml.registry.infomodel.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceUnit(name="auction-ejb")
	EntityManager em;
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addUser(User user) {
		try {
			em.persist(user);
		} catch (Exception e) {
		return false;
		}
		return true;
	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
