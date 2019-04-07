package model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Meassurements {
	
	@Id 
	public ObjectId _id;
	
	public String warmWater;
	public String coldWater;
	public String date;
	
	
	public Meassurements(ObjectId _id, String warmWater, String coldWater, String date){
		this._id = _id;
		this.warmWater = warmWater;
		this.coldWater = coldWater;
		this.date = date;
	}
	
	public String get_id() {
		return _id.toHexString();
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getWarmWater() {
		return warmWater;
	}

	public void setWarmWater(String warmWater) {
		this.warmWater = warmWater;
	}

	public String getColdWater() {
		return coldWater;
	}

	public void setColdWater(String coldWater) {
		this.coldWater = coldWater;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
