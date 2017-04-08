package day13interface;
//凡是被打掉可以获得奖励的对象都实现这个接口
public interface Award {

	//奖励类型
	int DOUBLE_FIRE = 0; //双倍火力
	int LIFE = 1; //一条生命
	int BOMB = 2; //炸弹
	//返回打掉对象后的奖励类型：以上三选一
	int getAward();
}
