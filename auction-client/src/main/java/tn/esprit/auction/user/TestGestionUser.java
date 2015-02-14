package tn.esprit.auction.user;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;




import tn.esprit.auction.domain.User;
import tn.esprit.auction.services.gestion.user.UserServicesRemote;



public class TestGestionUser {
	static UserServicesRemote remote;
	public static void doAddUser(UserServicesRemote remote){

		User user=new User();
		user.setUserName("foulen");
		if(remote.addUser(user)){
			System.out.println("OK");
		}
		else
			System.out.println("Erreur ...add");

	}
	public static void doUpdateUser(UserServicesRemote remote){

		User user=remote.findUserById(1);
		user.setUserName("foulen1");
		if(remote.updateUser(user)){
			System.out.println("OK");
		}
		else
			System.out.println("Erreur ...");

	}
	public static void doDeleteUser(UserServicesRemote remote){

		User user=remote.findUserById(1);
		
		if(remote.deleteUser(user)){
			System.out.println("OK");
		}
		else
			System.out.println("Erreur ...");

	}
	public static void main(String[] args) {
		
		
		try {
			Context context=new InitialContext();
			remote=(UserServicesRemote) context.lookup("auction-ejb/UserServices!tn.esprit.auction.services.gestion.user.UserServicesRemote");
				} catch (NamingException e) {
		System.out.println("erreur jndi ... ");
			e.printStackTrace();
		}
doAddUser(remote);
		//doUpdateUser(remote);
		//doDeleteUser(remote);
	}
}
