public class Hero {
	String name; 		//姓名
	int hp;				//生命值
	int mana;			//魔法值
	float armor; 		//护甲
	int moveSpeed; 		//移动速度
	int attackRange;	//攻击距离
	
	//如神杀戮
	void godLike() {
		System.out.println("如神杀戮!")
	}

	//获取护甲值
	float getArmor() {
		return armor;
	}

	//加速
	void addSpeed(int speed) {
		//在基础移动速度上增加
		moveSpeed = moveSpeed + speed;
	}

	//超神
	void holyShit() {
		//System.out.println("Holy Shit!")
	}

	//获取生命值
	int getHp() {
		return hp;
	}

	//回血状态
	void recovery(int blood) {

	}

	public static void main(String[] args) {
		Hero shadowfiend = new Hero();
		shadowfiend.name = "影魔";
		shadowfiend.hp = 2420;
		shadowfiend.armor = 23.58f;
		shadowfiend.moveSpeed = 305;
		shadowfiend.attackRange = 500;
		shadowfiend.addSpeed(150)

		Hero morphling = new Hero();
		morphling.name = "水人";
		morphling.hp = 2660;
		morphling.armor = 24.15f;
		morphling.moveSpeed = 280;
		morphling.attackRange = 350;
	}
}