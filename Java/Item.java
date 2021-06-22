public class Item {
	String name;	//物品名称
	int price;		//价格

	public static void main(String[] args) {
		Item bottle = new Item();
		bottle.name = "魔瓶";
		bottle.price = 675;

		Item bootsOfSpeed = new Item();
		bootsOfSpeed.name = "速度之靴";
		bootsOfSpeed.price = 500;

		Item claymore = new Item();
		claymore.name = "大剑";
		claymore.price = 1350;
	}
}