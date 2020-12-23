package vehicle.vehicleIdentities;

import java.util.Objects;

public class Technic {

	private String nameOfCar;
	private String brand;
	private int modelYear;
	private double price;
	private int gear;
	private String drivenWheels;
	private String sizeOfVehicle;
	private String typeOfVehicle;
	
	private Technic(Build build) {
		this.nameOfCar = build.nameOfCar;
		this.brand = build.brand;
		this.modelYear = build.modelYear;
		this.price = build.price;
		this.gear = build.gear;
		this.drivenWheels = build.drivenWheels;
		this.sizeOfVehicle = build.sizeOfVehicle;
		this.typeOfVehicle = build.typeOfVehicle;
	}
	
	public static class Build{
		private  String nameOfCar;
		private  String brand;
		private  int modelYear;
		private  double price;
		private  int gear;
		private String drivenWheels="";
		private String sizeOfVehicle="";
		private String typeOfVehicle="";
		
		public Build(String nameOfCar, String brand, int modelYear, double price, int gear) {
			this.nameOfCar = nameOfCar;
			this.brand = brand;
			this.modelYear = modelYear;
			this.price = price;
			this.gear = gear;
		}
		public Build buildWheels(String drivenWheels) {
			 this.drivenWheels = drivenWheels;
		      return this;
		    }
		public Build buildSizeOfVehicle(String sizeOfVehicle) {
			 this.sizeOfVehicle = sizeOfVehicle;
		      return this;
		    }
		public Build buildTypeOfVehicle(String typeOfVehicle) {
			 this.typeOfVehicle = typeOfVehicle;
		      return this;
		    }

		public Technic buildTechnic() {
			return new Technic(this);
			
		}
	}
	
	
	
	public String getGear() {
		if(gear==1)
			return "automatic";
		else
			return "manuel";
	}

	public String getDrivenWheels() {
		return drivenWheels;
	}

	public void setDrivenWheels(String drivenWheels) {
		this.drivenWheels = drivenWheels;
	}

	public String getSizeOfVehicle() {
		return sizeOfVehicle;
	}

	public void setSizeOfVehicle(String sizeOfVehicle) {
		this.sizeOfVehicle = sizeOfVehicle;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public boolean equals(int modelYear, int gear, int minPrice, int maxPrice,String model) {
		return modelYear <= this.modelYear &&
				this.price<maxPrice&&this.price>minPrice&&
				gear == this.gear&&this.getBrand().toLowerCase().equals(model.toLowerCase());
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameOfCar, brand, modelYear, price, gear);
	}

	@Override
	public String toString() {
		return "Technic{" +
				"nameOfCar='" + nameOfCar +"\n"+
				"brand='" + brand +"\n"+
				"modelYear=" + modelYear +"\n"+
				"price=" + price +"\n"+
				"gear=" + gear +"\n"+
				"drivenWheels='" + drivenWheels +"\n"+
				"sizeOfVehicle='" + sizeOfVehicle +"\n"+
				"typeOfVehicle='" + typeOfVehicle +"\n";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

