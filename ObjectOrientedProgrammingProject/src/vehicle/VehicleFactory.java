package vehicle;

import interfaces.Hook;
import interfaces.Person;
import interfaces.Servicable;
import interfaces.Vehicle;
import vehicle.vehicleIdentities.Engine;
import vehicle.vehicleIdentities.Technic;
 

public  class VehicleFactory{

	public static Vehicle getVehicle(Engine engine, Technic technicalInformation, Person owner,int type) {
		if(type==0) {
			
			return new Car(engine,technicalInformation,owner);
		}
		else{
			return new Motorcycle(engine,technicalInformation,owner);
		}
		
	}
//    DynamicStack features;
//    Engine engine;
//    Technic technicalInformation;
//    Person owner;
//    public VehicleFactory() {
//    }
//
//    public VehicleFactory(Engine engine, Technic technicalInformation,Person owner) {
//        this.features = new DynamicStack();
//        this.engine = engine;
//        this.technicalInformation = technicalInformation;
//        this.owner=owner;
//    }

//    public void addFeatures(Feature feature){features.push(feature);}
//    public Person getOwner(){return owner;}
//    public Engine getEngine(){return engine;}
//    public void addTechnicalInformation(Technic technic){}
//    public void addEngine(Engine engine){}
//    public Technic getTechnicalInformation(){return technicalInformation;}
//    public void setFeatures(DynamicStack features){this.features=features;}
}
