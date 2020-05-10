package AbstractFactory;

public class ProductFactory {
	public Order getOrder(Channel channel,ProductType type){
		Order order;
		if(channel==Channel.ECOMSITE){
			order=new EComChannel().getOrder(type);
		}
		else {
			order=new TeleComChannel().getOrder(type);
		}
		
		return order;
	}
}
