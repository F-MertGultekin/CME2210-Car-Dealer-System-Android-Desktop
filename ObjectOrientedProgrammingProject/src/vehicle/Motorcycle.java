/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import Stack.DynamicStack;
import interfaces.Hook;
import interfaces.Person;
import interfaces.Servicable;
import interfaces.Vehicle;
import vehicle.vehicleIdentities.Engine;
import vehicle.vehicleIdentities.Feature;
import vehicle.vehicleIdentities.Technic;

public class Motorcycle extends Servicable implements Hook,Vehicle { 

	DynamicStack features;
	Engine engine;
	Technic technicalInformation;
	Person owner;
	public Motorcycle() {
	}
	private String mileage;
	public Motorcycle(Engine engine, Technic technicalInformation, Person owner) {
//		super(engine, technicalInformation,owner);
		this.engine=engine;
		this.technicalInformation=technicalInformation;
		this.owner=owner;
	}

	@Override
	public String toString() {
		return "Motorcycle{" + this.getTechnicalInformation().toString()+this.getEngine().toString()+'}';
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	@Override
	public void addFeatures(Feature feature){features.push(feature);}
	@Override
	public Person getOwner(){return owner;}
	@Override
	public Engine getEngine(){return engine;}
	@Override
	public void addTechnicalInformation(Technic technic){}
	@Override
	public void addEngine(Engine engine){}
	@Override
	public Technic getTechnicalInformation(){return technicalInformation;}
	@Override
	public void setFeatures(DynamicStack features){this.features=features;}

	@Override
	public void didMount() {

	}

	@Override
	public void willMount() {

	}

	@Override
	public void useEffect() {

	}
}
