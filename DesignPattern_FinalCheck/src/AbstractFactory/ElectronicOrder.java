package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectronicOrder extends Order {

	private static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);
	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.ELECTRONICS);
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
