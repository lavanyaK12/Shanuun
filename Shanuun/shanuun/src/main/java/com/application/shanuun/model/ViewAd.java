package com.application.shanuun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViewAd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long adid;
	private String carimage;
	private String userid;
	private String carname;
	private String description;
	private String km;
	private String price;
	private String fueltype;
	private String bodycondition;
	private String mechanicalcondition;
	private String color;
	private String year;
	private String warranty;
	private String door;
	private String noofcylinders;
	private String bodytype;
	private String horsepower;
	private String steeeringside;
	private String latitude;
	private String longitude;
	public ViewAd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ViewAd(Long adid, String carimage, String userid, String carname, String description, String km,
			String price, String fueltype, String bodycondition, String mechanicalcondition, String color, String year,
			String warranty, String door, String noofcylinders, String bodytype, String horsepower,
			String steeeringside, String latitude, String longitude) {
		super();
		this.adid = adid;
		this.carimage = carimage;
		this.userid = userid;
		this.carname = carname;
		this.description = description;
		this.km = km;
		this.price = price;
		this.fueltype = fueltype;
		this.bodycondition = bodycondition;
		this.mechanicalcondition = mechanicalcondition;
		this.color = color;
		this.year = year;
		this.warranty = warranty;
		this.door = door;
		this.noofcylinders = noofcylinders;
		this.bodytype = bodytype;
		this.horsepower = horsepower;
		this.steeeringside = steeeringside;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Long getAdid() {
		return adid;
	}
	public void setAdid(Long adid) {
		this.adid = adid;
	}
	public String getCarimage() {
		return carimage;
	}
	public void setCarimage(String carimage) {
		this.carimage = carimage;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getBodycondition() {
		return bodycondition;
	}
	public void setBodycondition(String bodycondition) {
		this.bodycondition = bodycondition;
	}
	public String getMechanicalcondition() {
		return mechanicalcondition;
	}
	public void setMechanicalcondition(String mechanicalcondition) {
		this.mechanicalcondition = mechanicalcondition;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getNoofcylinders() {
		return noofcylinders;
	}
	public void setNoofcylinders(String noofcylinders) {
		this.noofcylinders = noofcylinders;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public String getSteeeringside() {
		return steeeringside;
	}
	public void setSteeeringside(String steeeringside) {
		this.steeeringside = steeeringside;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
