package AbstractFactory;

public abstract class Order {
protected Channel channel;
protected ProductType type;
public Order(Channel channel, ProductType type) {
	super();
	this.channel = channel;
	this.type = type;
}
public abstract void ProcessOrder();
}
