
public class Car {
	
	private String modelCar;
	private int release;
	private int price;
	private String equipment;
	private String country;
	private String dataOfSale;
	private String FIObuyer;
	
	
	void setRelease(int release) {
		this.release = release;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	
	void setCountry(String country) {
		this.country = country;
	}
	
	void setDataOfSale(String dataOfSale) {
		this.dataOfSale = dataOfSale;
	}
	
	void setFIObuyer(String FIObuyer) {
		this.FIObuyer = FIObuyer;
	}
	
	Car(String modelCar){
		this.modelCar = modelCar;
	}
	
	public String toString() {
		return "�������� ������� ����������:\n" + "����� ���������� - " + this.modelCar + "\n��� ������� - " + this.release + "\n���� ���������� - " + this.price + "\n������������ - " + this.equipment + "\n������ ������������� - " + this.country + "\n���� ������� - " + this.dataOfSale + "\n��� ���������� - " + this.FIObuyer;     
	}

}
