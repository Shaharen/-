import java.util.Random;

public class Pc extends Player {

	// �ʱ��ڱ�
	int money = 1000;
	// �ֻ��� �������
	int dice;
	int dice1;
	int dice2;
	int diceAdd;
	// ��������� ���� �ֻ��� ����
	int diceSum;
	// Player ��ġ���
	int diceWhere;
	// �����
	int pass = 0;
	int diceB = 0;

	public void Money() {
		System.out.println("\t\t" + "PBK�� ���� �ڻ� : " + money + "��");
	}

	public int getPcMoney() {
		return money;
	}

	public void Dice() {
		Random rd = new Random();
		for (int i = 1; i <= 2; i++) {
			int dice = rd.nextInt(6) + 1;
			diceAdd += dice;
			System.out.println("\t\t" + "�ֻ��� �� : " + dice);
		}
		System.out.println("\t\t" + diceAdd + "��ŭ �̵��մϴ�");

	}

	public void DiceB() {
		this.diceB = diceB;
		Random rd = new Random();
		diceB = rd.nextInt(6) + 1;
		System.out.println(diceB);

	}

	public void Dice1() {
		this.dice1 = dice1;
		Random rd = new Random();
		dice1 = rd.nextInt(6) + 1;
		System.out.println(dice1);
	}

	public void Dice2() {
		this.dice2 = dice2;
		Random rd = new Random();
		dice2 = rd.nextInt(6) + 1;
		System.out.println(dice2);
	}

	public void DiceAdd() {
		diceAdd = dice1 + dice2;
		System.out.println(diceAdd);
	}

	public void DiceSum() {
		diceSum += diceAdd;
		this.diceAdd = 0;
		// ���̽� ���� : diceSum -> ������� ( �� ĭ�� 32 )
		if (diceSum >= 32) {
			diceSum -= 32;
			money += 200;
		}
	}

	public int DiceWhere() {
		return diceWhere = diceSum % 32;
	}

	public void space(int space) {
		diceSum += space;
		DiceSum();
	}
}
