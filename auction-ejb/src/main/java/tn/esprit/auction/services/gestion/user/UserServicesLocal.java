package tn.esprit.auction.services.gestion.user;

import javax.ejb.Local;
import javax.xml.registry.infomodel.User;

@Local
public interface UserServicesLocal {
boolean addUser(User user);
boolean removeUser(User user);
}
