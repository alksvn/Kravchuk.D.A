
public class Summ {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int sum = a + b; 
		System.out.println((args.length == 2? "Значения: " + args[0] + "; " + args[1] + ".\n" + args[0] + " + " + args[1] + " = " + sum : "Неверное количество параметров"));
	}
}
