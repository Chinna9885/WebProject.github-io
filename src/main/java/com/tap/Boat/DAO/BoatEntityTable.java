package com.tap.Boat.DAO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="boat")
@Entity
public class BoatEntityTable implements Serializable{
	@Column(name="PName")
	private String PName;
	@Column(name="PLoc")
	private String PLoc ;
	@Column(name="NoofStands")
	@Id
	private int NoofStands; 
	@Column(name="NoOfBoats")
	private int NoOfBoats;
	
	
	public BoatEntityTable(String pName, String pLoc, int noofStands, int noOfBoats) {
		this.PName = pName;
		this.PLoc = pLoc;
		this.NoofStands = noofStands;
		this.NoOfBoats = noOfBoats;
	}

	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPLoc() {
		return PLoc;
	}
	public void setPLoc(String pLoc) {
		PLoc = pLoc;
	}
	public int getNoofStands() {
		return NoofStands;
	}
	public void setNoofStands(int noofStands) {
		NoofStands = noofStands;
	}
	public int getNoOfBoats() {
		return NoOfBoats;
	}
	public void setNoOfBoats(int noOfBoats) {
		NoOfBoats = noOfBoats;
	} 
		
	
}
