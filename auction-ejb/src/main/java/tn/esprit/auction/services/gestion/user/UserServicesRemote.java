package tn.esprit.auction.services.gestion.user;

import java.util.List;

import javax.ejb.Remote;



import tn.esprit.auction.domain.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user );
	Boolean updateUser(User user);
	Boolean deleteUser(User user);
	User findUserById(Integer idUser);
	List<User>findAllUsers();
	User authentificate(String login,String pwd);
	
}
