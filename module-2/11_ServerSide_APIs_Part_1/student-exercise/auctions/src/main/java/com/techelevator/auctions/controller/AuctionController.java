package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    // return list of all auctions
    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }
    
    //get auction by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }
    
    //create auction
    @RequestMapping(path= "",method = RequestMethod.POST)
    public  Auction addAuction(@RequestBody Auction auction) {
        return dao.create(auction);
    }
    
   
         
    @RequestMapping(path = "/filter", method = RequestMethod.GET)
    public List<Auction> filterByTitleAndPrice(@RequestParam String title, @RequestParam double currentBid) {

        List<Auction> filteredAuctions = new ArrayList<>();
        List<Auction> auctions= list(title, currentBid);

       
        for (Auction auction: auctions) {
          
            if (title != null) {
                if (auction.getTitle().toLowerCase().equals(title.toLowerCase())) {
                	filteredAuctions.add(auction);
                }
            } else if (currentBid > 0){
                if (auction.getCurrentBid() <=currentBid) {
                	filteredAuctions.add(auction);
                }

            }
        }

        return filteredAuctions;
    }

//    @RequestMapping( path = "", method = RequestMethod.GET)
//    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {
//
//        if( !title_like.equals("") ) {
//            return dao.searchByTitle(title_like);
//        }
//        if(currentBid_lte > 0) {
//            return dao.searchByPrice(currentBid_lte);
//        }
//
//        return dao.list();
//    }
    
    

}
