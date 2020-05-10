package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToyOrder extends Order {

	private static final Logger LOGGER = LoggerFactory.getLogger(ToyOrder.class);
	public ToyOrder(Channel channel) {
		super(channel, ProductType.TOYS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ProcessOrder() {
		// TODO Auto-generated method stub
		LOGGER.info("Processing Order::");
		LOGGER.info("Product Type: "+type);
		LOGGER.info("Channel: "+channel);

	}

}
