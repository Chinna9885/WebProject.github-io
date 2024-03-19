package com.tap.Boat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tap.Boat.Servicee.BoatService;
@Controller
public class BoatController {
	 
	@Autowired
	private BoatService boatService;
    
	public BoatController(BoatService boatService) {
    	this.boatService=boatService;
		
		System.out.println("object created suceffully......By Ioc conatainder//////");
	}
	
	@RequestMapping(value ="/pmm")
	public String Firstreq(@RequestParam String PName,@RequestParam String PLoc,@RequestParam int NoofStands,@RequestParam int  NoOfBoats,Model model) {
          System.out.println(PName);
          System.out.println(PLoc);
          System.out.println(NoofStands);
          System.out.println(NoOfBoats);
          
          boolean isvalid=boatService.ValidateBoat(PName, PLoc, NoofStands, NoOfBoats);
          if(isvalid)
          {
        	 model.addAttribute("Response","Data Is Valid And Saved To Database!!!ThankYou");
        	 return "/index.jsp" ;
          }
          else {
        	  model.addAttribute("Response","Data Is Invalid And Try Again");
      	      return "/index.jsp";
          }
	}
	@RequestMapping(value = "/hmm")
	public void req2() {
		System.out.println("approved");
		
	}
}
