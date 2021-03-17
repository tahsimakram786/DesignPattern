package handson1_2;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
