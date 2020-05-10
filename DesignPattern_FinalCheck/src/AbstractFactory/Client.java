package AbstractFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=null;
		ProductFactory factory=new ProductFactory();
		Scanner sc=new Scanner(System.in);
		
		while(order==null){
			System.out.println("Enter your channel type (ECommerceSite/TeleComAgent)");
			String ch=sc.nextLine();
			ch=ch.toUpperCase();
			System.out.println("Enter your product type(Electronics/Furniture/Toys)");
			String type=sc.nextLine();
			type=type.toUpperCase();
			switch(ch){
			case "ECOMMERCESITE":switch(type){
			                     case "ELECTRONICS":order=factory.getOrder(Channel.ECOMSITE, ProductType.ELECTRONICS);
			                                        break;
			
			                     case "FURNITURE":order=factory.getOrder(Channel.ECOMSITE, ProductType.FURNITURES);
			                                      break;
			                     case "TOYS":order=factory.getOrder(Channel.ECOMSITE, ProductType.TOYS);
			                                 break;
			                     default: System.out.println("Wrong Input of Product");
			                              break;
			                      }
			                      break;
			case "TELECOMAGENT":switch(type){
                                 case "ELECTRONICS":order=factory.getOrder(Channel.TELECOMAGENT, ProductType.ELECTRONICS);
                                                    break;

                                 case "FURNITURE":order=factory.getOrder(Channel.TELECOMAGENT, ProductType.FURNITURES);
                                                  break;
                                 case "TOYS":order=factory.getOrder(Channel.TELECOMAGENT, ProductType.TOYS);
                                             break;
                                  default: System.out.println("Wrong Input of Product");
                                           break;
                                  }
			                      break;
			default:System.out.println("Wrong Input of channel. Enter again.");
			        order=null;
			        break;
			}
			
		}
      order.ProcessOrder();
	}

}
