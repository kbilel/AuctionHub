package tn.esprit.auction.services.gestion.auction;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.auction.domain.Auction;

@Remote
public interface AuctionServicesRemote {
	Boolean addAuction(Auction auction );
	Boolean updateAuction(Auction auction);
	Boolean deleteAuction(Auction auction);
	Auction findAuctionById(Integer idAuction);
	List<Auction>findAllAuctions();
}
