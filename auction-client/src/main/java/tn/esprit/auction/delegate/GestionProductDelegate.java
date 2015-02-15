package tn.esprit.auction.delegate;

import java.util.List;

import tn.esprit.auction.domain.Product;
import tn.esprit.auction.locator.ServiceLocator;
import tn.esprit.auction.services.gestion.product.ProductServicesRemote;

public class GestionProductDelegate {


	static ProductServicesRemote remote;
	private static final String jndi="auction-ejb/ProductServices!tn.esprit.auction.services.gestion.product.ProductServicesRemote"; 

	private static ProductServicesRemote getProxy(){
		return (ProductServicesRemote) ServiceLocator.getInstance().getProxy(jndi);
	}
	
	public  static Boolean doAddProduct(Product product){
	return getProxy().addProduct(product);
	
}
	public static List<Product> doFindAllProducts(){
		return getProxy().findAllProducts();
	}	
}