
public class Practica4 {
	public static void main(String[] args) {
		CarLists carLists = new CarLists();
		carLists.Add(new Sport("BMW", 2020 , 7900000 , "M4 Competition","Germany", "18.06.2021", "������ ���� ��������", "3.9-4.2 c.", "3.0 �.", "480 �.�"));
		carLists.Add(new Special("�����", 2020, 7100000, "�����-54901", "������", "08.05.2020", "������ ���� ��������", "��������", "19 700 ��","����� 6250 ��, ������ 3030 ��, ������ 1300��"));
		carLists.Add(new UsedCar("Mazda", 2021, 3060000, "Mazda 6 Supreme Plus", "������", "28.08.2021", "������� ������� ����������", "��������", "�������� ������ ����������", 131000));
		
		System.out.println(carLists);
	}

}
