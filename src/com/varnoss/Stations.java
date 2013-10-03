package com.varnoss;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Stations {
	@XmlElement(name = "stations")
	private List<Station> stations = new ArrayList<Station>();

	public Stations() {	}

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}
	
	public void add(Station s){
		this.stations.add(s);
	}
}
