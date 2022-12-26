package test.view;

import test.Service.Service;
import test.Service.ServicePokupatel;
import test.domain.Pokupatel;
import test.repository.PokupatelRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class PokupatelMenu {
	Scanner scanner = new Scanner(System.in);

    private final Service<Pokupatel> pokupatelService = new ServicePokupatel(new PokupatelRepository());


    private Menu menu;

    public PokupatelMenu(Menu menu) {
        this.menu=menu;
    }


    public void drawPokupatel() throws SQLException {
        System.out.println("---����������----");
        System.out.println("1.��������");
        System.out.println("2.�������");
        System.out.println("3.�������������");
        System.out.println("0. �����");

        switch (scanner.nextInt()) {
            case 1 -> newPokupatel();
            case 2 -> deletePokupatel();
            case 3 -> changePokupatel();
            case 0 -> menu.draw();
        }
    }
    private void  newPokupatel() throws SQLException {
        System.out.println("������� ������ ����������: ");
        System.out.print("�������: ");
        Long telefon = scanner.nextLong();
        System.out.print("������ ����������: ");
        int skidka = scanner.nextInt();
        Pokupatel pokupatel= new Pokupatel(null, telefon, skidka);
        pokupatelService.save(pokupatel);
    }
    void drawListPokupatel() throws SQLException {
        System.out.println();
        System.out.println("---������ �����������---");
        pokupatelService.getAll().forEach(System.out::println);

    }
    private  void deletePokupatel() throws SQLException {
        drawListPokupatel();
        System.out.println("�������� ����������, �������� ���� �������");
        Long id= scanner.nextLong();
        Pokupatel pokupatel= pokupatelService.find(id);
        pokupatelService.delete(pokupatel);
    }
    private  void  changePokupatel() throws SQLException {
        drawListPokupatel();
        System.out.println("�������� ���������� ��� ���������");
        Long id = scanner.nextLong();

        Pokupatel pokupatel= pokupatelService.find(id);

        System.out.println("��� ��������?");
        System.out.println("1. �������");
        System.out.println("2. ������");
        System.out.println("9. ��������� � �����");
        System.out.println("0. �����");


        switch (scanner.nextInt()){
            case 1->{
                System.out.println("������� ����� ������� ");
                pokupatel.setTelefon(scanner.nextLong());
            }
            case 2->{
                System.out.println("������� ����� ������ ");
                pokupatel.setSkidka(scanner.nextInt());
            }
            case 9->{
                pokupatelService.update(pokupatel);
                drawPokupatel();
            }
            case  0 ->{
                drawPokupatel();
            }
        }
    }

}
