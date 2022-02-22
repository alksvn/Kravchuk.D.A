//Ввести в качестве параметров имя пользователя и пароль. Проверить в методе main() соответствие введенных значений заранее определенным значениям. В случае полного соответсвия вывести сообщение "Вас узнали. Добро пожаловать", в противном случае вывести сообщение "логин и пароль не распознаны. Доступ запрещен".
import java.util.Scanner;

public class Parol {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String name = n.nextLine();
          
        Scanner p = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String parol = p.nextLine();
        
        if(name.equals(args[0])) {
        	if(parol.equals(args[1])) {
        		System.out.println("Вас узнали. Добро пожаловать.");
        	}
        	else {
            	System.out.println("Логин и пароль не распознаны. Доступ запрещён.");
            }
        }
        else {
        	System.out.println("Логин и пароль не распознаны. Доступ запрещён.");
        }
	}
}
