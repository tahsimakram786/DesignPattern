package handson4;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable cars;
	
	public MovableAdapterImpl(Movable cars) {
		super();
		this.cars = cars;
	}

	@Override
	public double speed() {
		
		return convert(cars.speed());
	}
	
	public double convert(double mph)
	{
		return mph * 1.5;
	}

}
