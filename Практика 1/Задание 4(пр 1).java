import java.util.Scanner;

public class Parol {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = n.nextLine();
          
        Scanner p = new Scanner(System.in);
        System.out.print("Введите ароль: ");
        String parol = p.nextLine();
        
        if(name.equals(args[0])) {
        	if(parol.equals(args[1])) {
        		System.out.println("Вас узнали. Добро пожаловать.");
        	}
        	else {
            	System.out.println("Логин и пароль не распознаны. Доступ запрещен.");
            }
        }
        else {
        	System.out.println("Логин и пароль не распознаны. Доступ запрещен.");
        }
	}
}
