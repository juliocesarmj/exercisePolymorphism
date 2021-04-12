package entities;

public class OutSourcedEmployee extends Employee{
	
	private double aditionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, double aditionalCharge) {
		super(name, hours, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}
	public double getAditionalCharge() {
		return aditionalCharge;
	}
	public void setAditionalCharge(double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + aditionalCharge * 1.1;
	}
}
