package AbstractFactory;

public class TeleComChannel {
	public Order getOrder(ProductType type){
		Order order;
		if(type==ProductType.ELECTRONICS){
			order=new ElectronicOrder(Channel.TELECOMAGENT);
		}
		else if(type==ProductType.FURNITURES){
			order=new FurnitureOrder(Channel.TELECOMAGENT);
		}
		else {
			order=new ToyOrder(Channel.TELECOMAGENT);
		}
		return order;
	}
}
