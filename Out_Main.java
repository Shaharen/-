
import java.util.ArrayList;
import java.util.Scanner;

public class Out_Main {
	public static void main(String[] args) {
		Out2 out = new Out2();
		User user = new User();
		Pc pc = new Pc();
		ArrayList<LandDTO> land = new ArrayList<LandDTO>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			String turn = sc.next();
			// user turn
			user.Dice1(); // ������ ù��° �ֻ���
			user.Dice2(); // ������ �ι�° �ֻ���

			user.DiceAdd(); // �ֻ��� �ΰ��� ��
			user.DiceSum(); // ���� ���ư��鼭 �������� �ֻ��� ���� ����

			user.DiceWhere();
//			out.outPrint(user.diceWhere,pc.diceWhere); // ���� �� PC�� ��ġ

			// pc turn
			pc.Dice1(); // PC�� ù��° �ֻ���
			pc.Dice2(); // PC�� �ι�° �ֻ���

			pc.DiceAdd(); // �ֻ��� �ΰ��� ��
			pc.DiceSum(); // ���� ���ư��鼭 �������� �ֻ��� ���� ����

			pc.DiceWhere();
//			out.outPrint(user.diceWhere, pc.diceWhere, land); // ���� �� PC�� ��ġ
			// land.get(user.DiceWhere()).getLandOwner()
		}

	}

}
