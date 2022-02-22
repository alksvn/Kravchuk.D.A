//Передавать в качестве параметров два целочисленных числа. Вывести на экран как сами значения? так и их сумму. Если количество параметров не равно 2, вывести сообщение "Неверное количество параметров".
public class Summ {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int sum = a + b; 
		System.out.println((args.length == 2? "Значения: " + args[0] + "; " + args[1] + ".\n" + args[0] + " + " + args[1] + " = " + sum : "Неверное количество параметров"));
	}
}
