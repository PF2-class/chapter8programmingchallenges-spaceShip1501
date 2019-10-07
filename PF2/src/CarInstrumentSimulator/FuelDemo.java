package CarInstrumentSimulator;

public class FuelDemo {
public static void main(String[] args) {
	FuelGause fuel= new FuelGause (0);
	System.out.println("Gallon in gause:" +fuel.getFuelGause());
	
	for (int i=0; i<=15;i++) {
		fuel.increment();
	}
	Odometer odo= new Odometer (999888, fuel);

	
	System.out.println(odo.getFuelGause());
	while (odo.getOdo()!=0)
	{
		odo.increOdo();

//		System.out.println(odo.getOdo()+" "+odo.getFuelGause());
		
		
	}
	
	
}
}
