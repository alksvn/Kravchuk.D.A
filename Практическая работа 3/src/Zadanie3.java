
public class Zadanie3 {
	public static void main(String[] args) {
		Car car = new Car("BMW");
		car.setRelease(2017);
		car.setPrice(7000000);
		car.setEquipment("M4 Competition");
		car.setCountry("Германия");
		car.setDataOfSale("8.05.2018");
		car.setFIObuyer("Иванов Иван Иванович");
		
		System.out.println(car.toString());
	}

}
