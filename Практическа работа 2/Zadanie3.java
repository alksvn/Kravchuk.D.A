//Определить матрицу(двумерный массив) и ее заполнить случайными значениями.
//Построить вектор В, который возвращает среднее геометрическое положительных элементов в каждом столбце матрицы.

import java.util.Vector;

public class Zadanie3 {
	public static void main(String[] args) {
		int n = 0, pr = 1;
		double x;
		Vector B = new Vector(); 
		int [][] array = new int [3][3];
		for (int i = 0; i < array.length; i++) {  
            for (int j = 0; j < array.length; j++) {
            	array[i][j] = ((int)(Math.random() * 21) - 10);
            	System.out.print(array[i][j] + " ");      		
            }
            System.out.println();
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] >= 1 ) {
					n = n + 1;
					pr = pr * array[i][j];
				}
			}
			x = Math.pow(pr, 1.0/n);
			B.add(x);
			n = 0;
			pr = 1;
		}
		System.out.println();
		System.out.print(B + " ");
	}
}
