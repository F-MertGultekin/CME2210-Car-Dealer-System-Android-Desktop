package interfaces;

import Stack.DynamicStack;
import vehicle.vehicleIdentities.Engine;
import vehicle.vehicleIdentities.Feature;
import vehicle.vehicleIdentities.Technic;
 

public interface Vehicle {


    public void addFeatures(Feature feature);
    public Person getOwner();
    public Engine getEngine();
    public void addTechnicalInformation(Technic technic);
    public void addEngine(Engine engine);
    public Technic getTechnicalInformation();
    public void setFeatures(DynamicStack features);
}
