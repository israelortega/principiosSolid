package mx.unam.sa.principios.A06.OpenClosed;

public class SeaShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(15, order.getTotalWeight() * 2);
	}

}
