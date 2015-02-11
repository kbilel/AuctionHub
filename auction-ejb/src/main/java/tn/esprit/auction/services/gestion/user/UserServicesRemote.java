package tn.esprit.auction.services.gestion.user;

import javax.ejb.Remote;
import javax.xml.registry.infomodel.User;

@Remote
public interface UserServicesRemote {
	boolean addUser(User user);
	boolean removeUser(User user);
}
