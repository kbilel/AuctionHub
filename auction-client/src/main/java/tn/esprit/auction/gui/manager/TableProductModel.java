package tn.esprit.auction.gui.manager;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import tn.esprit.auction.delegate.GestionProductDelegate;
import tn.esprit.auction.domain.Product;

public class TableProductModel extends AbstractTableModel {
	 List<Product> products= new ArrayList();
	    String[] header ={"ID","Category","Image","Description","Name","Price","Quantity"};
public TableProductModel() {
	this.products=GestionProductDelegate.doFindAllProducts();
}
@Override
public String getColumnName(int column) {
    return header[column]; //To change body of generated methods, choose Tools | Templates.
}
	@Override
	public int getRowCount() {
		
		return products.size();
	}

	@Override
	public int getColumnCount() {
		
		return header.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){

	    case 0 :return products.get(rowIndex).getId();
	    case 1: return products.get(rowIndex).getCategory();
	    case 2: return products.get(rowIndex).getImageByte();
	    case 3: return products.get(rowIndex).getDescription();
	    case 4: return products.get(rowIndex).getName();
	    case 5: return products.get(rowIndex).getPrice();
	    case 6: return products.get(rowIndex).getQuantity();
	
	    default : return null ;
	}
	}

}
