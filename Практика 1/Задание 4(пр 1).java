import java.util.Scanner;

public class Parol {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
        System.out.print("������� ���: ");
        String name = n.nextLine();
          
        Scanner p = new Scanner(System.in);
        System.out.print("������� �����: ");
        String parol = p.nextLine();
        
        if(name.equals(args[0])) {
        	if(parol.equals(args[1])) {
        		System.out.println("��� ������. ����� ����������.");
        	}
        	else {
            	System.out.println("����� � ������ �� ����������. ������ ��������.");
            }
        }
        else {
        	System.out.println("����� � ������ �� ����������. ������ ��������.");
        }
	}
}
