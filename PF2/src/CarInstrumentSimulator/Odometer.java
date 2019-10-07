package CarInstrumentSimulator;

public class Odometer {
private double odo;
private FuelGause fuelGause;

public Odometer(int odo, FuelGause fuel) {
	this.odo = odo;
	this.fuelGause = new FuelGause(fuel);
}

public void increOdo (){
	if (odo==999999) {
		this.odo=0;
	System.out.println("this odo is reseted");}
	
	else  {
		this.odo++;
	System.out.println("current odo: " + odo+ "\tCurrent fuel: "+ fuelGause.getFuelGause());
	}
		
	if (this.odo%24==0) {
		fuelGause.decrement();
	}
	
}


public double  getFuelGause() {
	double fuel= fuelGause.getFuelGause();
	return fuel;
	
}
public double getOdo() {
	return odo;
}


@Override
public String toString() {
	return "Odometer [odo=" + odo + ", fuelGause=" + fuelGause + "]";
}



}
