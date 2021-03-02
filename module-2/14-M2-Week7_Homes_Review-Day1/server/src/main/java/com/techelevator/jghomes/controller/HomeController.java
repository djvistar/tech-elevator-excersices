package com.techelevator.jghomes.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.homes.exception.homesException;

import com.techelevator.jghomes.dao.HomeDAO;
import com.techelevator.jghomes.model.Home;




/*   
     DAO methods for reference:
 
    	List<Home> retrieveHomesForSale();
    	void addHome(Home home);
    	Home retrieveHomeByMLSId(String mlsId);
    	boolean deleteHome(String mlsId);

 */

@PreAuthorize("isAuthenticated()")
@RestController

public class HomeController {
	
	private HomeDAO dao;
	
	  public  HomeController(HomeDAO dao) {
	        this.dao = dao;
	    }
	  @PreAuthorize("permitAll")
	    @RequestMapping(path = "/homes", method = RequestMethod.GET)
	    public List<Home> list() {
	    	return dao.retrieveHomesForSale();
	    }

	       
    /**
     * Return all homes
     *
     *

     * @return List<Home>  -  a list of all homes in the system
     */
	//TODO:  Class exercise #1 - Implement a controller method to return all homes for sale
	//       You are done when you are able to successfully test using postman	
	
	
	 
    /**
     * Return a specific home
     *
     * @return Home - a specific home by MLS Id, or 404 Not Found
     * @throws HomeNotFoundException 
     */
	//TODO:  Class exercise #2 - Implement a controller method to return a specific home by id
	//       You are done when you are able to successfully test using postman	
	   // @ResponseStatus(HttpStatus.NOT_FOUND)
	    
	    @PreAuthorize("permitAll")
	    @RequestMapping(path = "/homes/{mlsNumber}", method = RequestMethod.GET)
	    public Home get(@PathVariable String mlsNumber) throws homesException  {
	    	Home home = dao.retrieveHomeByMLSId(mlsNumber);
	    			if (home ==null) {
	    				throw new homesException ();
	    			}
	    			
	        return dao.retrieveHomeByMLSId(mlsNumber);
	    }
	    
    /**
     * Add a new home
     *
     * @return 201 Created if successful
     */	
	//TODO:  Class exercise #3 - Implement a controller method to add a specific home
	//       You are done when you are able to successfully test using postman		
	
	    //@PreAuthorize("hasRole('ADMIN')")
	    @ResponseStatus(HttpStatus.CREATED)
	    @RequestMapping(path = "/homes", method = RequestMethod.POST)
	    public void createNewHome(@RequestBody Home home, Principal principal){
	    	System.out.println(principal.getName());
	        dao.addHome(home);
	    }  
	    
	    
    /**
     * Delete a home
     *
     * @return 204 - No Content if successful, 404 if not found
     */		
	//TODO:  Class exercise #4 - Implement a controller method to delete a specific home
	//       You are done when you are able to successfully test using postman
	   
	    //@PreAuthorize("hasRole('ADMIN')")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    @RequestMapping(path = "/homes/mlsNumber", method = RequestMethod.DELETE)
	    public void delete(@PathVariable String mlsNumber, Principal principal) throws homesException  {
	    	Home home = dao.retrieveHomeByMLSId(mlsNumber);
			if (home ==null) {
				throw  new homesException ();
			}
			System.out.println(principal.getName());
	        dao.deleteHome(mlsNumber);
	    }   
	
	
	
	//TODO:  Class exercise #5 - Add the following permissions
	//   1.  Give public access to retrieving homes
	//   2.  Delete Home and Add Home requires login.  (Use the following:
	//  {
	//        "username": "jghomes",
	//        "password": "jghomes"
	//   }	
	//   3.   System.out.println the logged in user who made the change...

	
	
}
