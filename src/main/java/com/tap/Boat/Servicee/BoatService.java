package com.tap.Boat.Servicee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.Boat.DAO.BoatEntityImpl;
import com.tap.Boat.DAO.BoatEntityTable;

@Component
public class BoatService {
    @Autowired
	private BoatEntityImpl boatEntityImpl;

	public BoatService(BoatEntityImpl boatEntityImpl) {
	    this.boatEntityImpl=boatEntityImpl;
		System.out.println("Boat service object crested suceffully");
	}
	public boolean ValidateBoat( String PName, String PLoc, int NoofStands, int NoOfBoats) {
		boolean flag=false;
		if(PName !=null && !PName.isEmpty()) {
			System.out.println("PName is valid");
			flag=true;
		}
		else {
			System.out.println("PName is Invalid");
			flag=false;
		}
		if(PLoc !=null && !PLoc.isEmpty()) {
			System.out.println("PLoc is valid");
			flag=true;
		}
		else {
			System.out.println("PLoc is Invalid");
			flag=false;
		}
		if(NoofStands>0) {
			flag=true;
			System.out.println("NoofStands is valid");
		}
		else {
			System.out.println("NoofStands is Invalid");
			flag=false;
		}
		if(NoOfBoats>0) {
			flag=true;
			System.out.println("Noofboats is valid");
		}
		else {
			System.out.println("Noofboats is Invalid");
			flag=false;
		}
		
		if(flag) {
			BoatEntityTable	boattable = new BoatEntityTable(PName, PLoc, NoofStands, NoOfBoats);
			boolean result =boatEntityImpl.SaveBoatEntityData(boattable);
			 System.err.println("Data is Saved to database");
			 return result;
			
		}
		return flag;
		
	}
   
	
}
