package mx.unam.sa.principios.A06.OpenClosed;

public class SpaceShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(2000, order.getTotalWeight() * 100);
	}

}
