package tn.esprit.auction.services.gestion.user;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.auction.domain.User;


@Local
public interface UserServicesLocal {
	Boolean addUser(User user );
	Boolean updateUser(User user);
	Boolean deleteUser(User user);
	User findUserById(Integer idUser);
	List<User>findAllUsers();
	User authentificate(String login,String pwd);
}
