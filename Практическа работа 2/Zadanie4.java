
public class Zadanie4 {
	public static void main(String[] args) {
		int n = 5,  x = 0;
		double sr;
		double sum = 0;
		int [][] array = new int [n][n];
		for (int i = 0; i < array.length; i++) {  
            for (int j = 0; j < array.length; j++) {
            	array[i][j] = ((int)(Math.random() * 21) - 10);
            	System.out.print(array[i][j] + " ");
            	if (array[i][j] > 0 && i < j) {
            		x = x + 1;
            		sum = sum + array[i][j];
            	}
            }
            System.out.println();
		}
		sr = sum/x;
		System.out.print(sr);
	}
}	
