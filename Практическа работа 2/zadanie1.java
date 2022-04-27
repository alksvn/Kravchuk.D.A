public class zadanie1 {
	public static void main(String[] args) {
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
		    array[i] = ((int)(Math.random() * 21) - 10);
		    System.out.print(array[i]+" ");
		}
        int length = array.length;
        int a = 0;
        for (int i = 1; i < length; i++)
            if ((array[i] < 0 && array[i - 1] > 0) || (array[i] > 0 && array[i - 1] < 0)) {
                a++;
            }
        System.out.println("\nЗнак меняется: "  + a + " раза/раз.");
	}
}
