public abstract class Player {

	// �ʱ��ڱ�
	int money = 550;
	// �ֻ��� �������
	int dice;
	int diceAdd;
	// ��������� ���� �ֻ��� ����
	int diceSum;
	// Player ��ġ���
	int diceWhere;

	int diceB;

	public abstract void Money();

	public abstract void Dice();

	public abstract void DiceB();

	public abstract void DiceSum();

	public abstract int DiceWhere();

}
