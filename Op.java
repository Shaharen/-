import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Op {

	// user
	public void userLandBuy(User user, LandDTO land) {
		user.money -= land.getPrice();
	}

	public void userBuildingBuy(User user, LandDTO land) {
		user.money -= land.getBuilding();
	}

	public void userHotelBuy(User user, LandDTO land) {
		user.money -= land.getHotel();
	}

	public void userPass(User user, Pc pc, LandDTO land) {
		user.money -= land.getPass();
		pc.money += land.getPass();
	}

	public void userPassBuilding(User user, Pc pc, LandDTO land) {
		user.money -= land.getPassBuilding();
		pc.money += land.getPassBuilding();
	}

	public void userPassHotel(User user, Pc pc, LandDTO land) {
		user.money -= land.getPassHotel();
		pc.money += land.getPassHotel();
	}

	public void userInterceptPrice(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice();
		pc.money += land.getInterceptPrice();
	}

	public void userInterceptPrice2(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice2();
		pc.money += land.getInterceptPrice2();
	}

	public void userInterceptPrice3(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice3();
		pc.money += land.getInterceptPrice3();
	}

	// ��ȸ�������
	public void sw(User user, int sw) {
		if (sw % 2 == 0) {
			System.out.println("\t\t" + "�������� ��� ������ ������ �����Ͽ����ϴ�");
			user.money -= 100;
		} else {
			System.out.println("\t\t" + "�������� ��� ������ ȯ�޹޾ҽ��ϴ�");
			user.money += 100;
		}
	}

	// ���ʽ�
	public void bonus(User user, int bonus) {
		if (bonus == 1) {
			// 150
			System.out.println("\t\t" + "���� ���� ���� ����");
			System.out.println("\t\t" + "��� + 150��");
			user.money += 150;
		} else if (bonus == 2) {
			// ���Ƽ -400
			System.out.println("\t\t" + "���Ǿ�Pbk�� ���� ������ϴ�");
			System.out.println("\t\t" + "��� -400��");
			user.money -= 400;
		} else if (bonus == 3) {
			// 250
			System.out.println("\t\t" + "�Ӵ�Ḧ �޾ҽ��ϴ�");
			System.out.println("\t\t" + "��� +250��");
			user.money += 250;
		} else if (bonus == 4) {
			// 350
			System.out.println("\t\t" + "�̴�������Ʈ�� ������ �ȷȽ��ϴ�");
			System.out.println("\t\t" + "��� +350��");
			user.money += 350;
		} else if (bonus == 5) {
			// ���Ƽ -200
			System.out.println("\t\t" + "�ӽ�ũ�� ������ �߽��ϴ�");
			System.out.println("\t\t" + "��� -200��");
			user.money -= 200;
		} else {
			// 450
			System.out.println("\t\t" + "���� ���� �μ����� �������ϴ�");
			System.out.println("\t\t" + "���ڰ�!! 450�ﵵ ����!!");
			user.money += 450;
		}
	}

	// pc
	public void pcLandBuy(Pc pc, LandDTO land) {
		pc.money -= land.getPrice();
	}

	public void pcBuildingBuy(Pc pc, LandDTO land) {
		pc.money -= land.getBuilding();
	}

	public void pcHotelBuy(Pc pc, LandDTO land) {
		pc.money -= land.getHotel();
	}

	public void pcPass(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPass();
		user.money += land.getPass();
	}

	public void pcPassBuilding(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPassBuilding();
		user.money += land.getPassBuilding();
	}

	public void pcPassHotel(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPassHotel();
		user.money += land.getPassHotel();
	}

	public void pcInterceptPrice(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice();
		user.money += land.getInterceptPrice();
	}

	public void pcInterceptPrice2(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice2();
		user.money += land.getInterceptPrice2();
	}

	public void pcInterceptPrice3(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice3();
		user.money += land.getInterceptPrice3();
	}

	// ��ȸ������� ( ���� �ε� )
	public void sw(Pc pc, int sw) {
		if (sw % 2 == 0) {
			System.out.println("\t\t" + "��ȸ��������� �����Ͽ����ϴ�");
			pc.money -= 100;
		} else {
			System.out.println("\t\t" + "�������κ��� ��ȸ��������� �޾ҽ��ϴ�");
			pc.money += 100;
		}
	}

	// ���ʽ� ( ���� �ε� )
	public void bonus(Pc pc, int bonus) {
		if (bonus == 1) {
			// 150
			System.out.println("\t\t" + "PBK��� + 150��");
			pc.money += 150;
		} else if (bonus == 2) {
			// ���Ƽ -400
			System.out.println("\t\t" + "PBK��� -400��");
			pc.money -= 400;
		} else if (bonus == 3) {
			// 250
			System.out.println("\t\t" + "PBK��� +250��");
			pc.money += 250;
		} else if (bonus == 4) {
			// 350
			System.out.println("\t\t" + "PBK��� +350��");
			pc.money += 350;
		} else if (bonus == 5) {
			// ���Ƽ -200
			System.out.println("\t\t" + "PBK��� -200��");
			pc.money -= 200;
		} else {
			// 450
			System.out.println("\t\t" + "PBK��� +450��");
			pc.money += 450;
		}
	}

}