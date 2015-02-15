package tn.esprit.auction.gui.manager;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import tn.esprit.auction.delegate.GestionAuctionDelegate;
import tn.esprit.auction.domain.Auction;
import tn.esprit.auction.domain.EnglishAuction;
import tn.esprit.auction.services.gestion.auction.AuctionServicesRemote;

public class TableEnglishAuctionModel extends AbstractTableModel {


    List<EnglishAuction> auctions= new ArrayList();
    String[] header ={"ID","Starting Date","End Date","Starting Price"};
	
	public TableEnglishAuctionModel() {
		
		this.auctions = GestionAuctionDelegate.doFindAllEnglishAuctions();
	}
	@Override
    public String getColumnName(int column) {
        return header[column]; //To change body of generated methods, choose Tools | Templates.
    }
	@Override
	public int getRowCount() {
	
		return auctions.size();
	}

	@Override
	public int getColumnCount() {
		
		return header.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){

	    case 0 :return auctions.get(rowIndex).getId();
	    case 1: return auctions.get(rowIndex).getAuctionStartingDate();
	    case 2: return auctions.get(rowIndex).getAuctionEndDate();
	    case 3: return auctions.get(rowIndex).getAuctionStartingPrice();
	    
	    

	    default : return null ;
	}

}
	
}
