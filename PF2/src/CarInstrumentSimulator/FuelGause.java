package CarInstrumentSimulator;

public class FuelGause {
	private double fuelGause;

	public double getFuelGause() {
		return fuelGause;
	}

	public FuelGause(double fuelGause) {
		this.fuelGause = fuelGause;
	}

	public FuelGause(FuelGause object2) {
		fuelGause = object2.fuelGause;

	}

	public void increment() {
		if (this.fuelGause < 15) {
			this.fuelGause++;
			System.out.println(this.fuelGause);
		} else
			System.out.println("The tank is full");

	}

	public void decrement() {
		if (this.fuelGause > 0)
			this.fuelGause--;
		else
			System.out.println("The tank is empty");

	}

}
