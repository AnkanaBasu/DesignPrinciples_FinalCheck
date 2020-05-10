package AbstractFactory;

public class EComChannel {
public Order getOrder(ProductType type){
	Order order;
	if(type==ProductType.ELECTRONICS){
		order=new ElectronicOrder(Channel.ECOMSITE);
	}
	else if(type==ProductType.FURNITURES){
		order=new FurnitureOrder(Channel.ECOMSITE);
	}
	else {
		order=new ToyOrder(Channel.ECOMSITE);
	}
	return order;
}
}
