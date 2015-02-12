package tn.esprit.auction.services.gestion.auction;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.auction.domain.Auction;

@Local
public interface AuctionServicesLocal {
	Boolean addAuction(Auction auction );
	Boolean updateAuction(Auction auction);
	Boolean deleteAuction(Auction auction);
	Auction findAuctionById(Integer idAuction);
	List<Auction>findAllAuctions();
}