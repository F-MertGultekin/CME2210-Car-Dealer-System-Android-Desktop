package vehicle;

import interfaces.Hook;
import interfaces.Person;
import interfaces.Servicable;
import interfaces.Vehicle;
import vehicle.vehicleIdentities.Engine;
import vehicle.vehicleIdentities.Feature;
import vehicle.vehicleIdentities.Technic;

import java.util.Random;

import Stack.DynamicStack;

public class Car extends Servicable implements Hook,Vehicle{
	DynamicStack features;
	Engine engine;
	Technic technicalInformation;
	Person owner;
	public Car() {
		
	}

	public Car(Engine engine, Technic technicalInformation, Person owner) {
//		super(engine, technicalInformation,owner);
		this.engine=engine;
		this.technicalInformation=technicalInformation;
		this.owner=owner;
	}

	@Override
	public String toString() {
		return "Car: "+"\n"+this.getTechnicalInformation().toString()+"\n---------\n"+this.getEngine().toString()+"\n---------\n"+testToString();
	}

	public boolean equals(int gearType, double volumeOfEngine, int maxPrice, int minPrice, int year,String model) {
		return (this.getEngine().getVolume() >= volumeOfEngine && this.getTechnicalInformation().equals(year, gearType, minPrice, maxPrice, model));

	}
	public String testToString(){
		int [] arr=test();
		String str=""; 
		str+="Engine Performance :"+arr[0];
		str+="\nBrake Performance :"+arr[1];
		str+="\nSoftware Test :"+arr[2];
		return str;

	}
	public int[] test(){
		int[] test={new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100)};
		return test;
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
