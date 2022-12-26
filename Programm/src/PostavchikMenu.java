package test.view;

import test.Service.Service;
import test.Service.ServicePostavchik;
import test.Service.ServiceSklad;
import test.domain.Postavchik;
import test.domain.Tovar;
import test.repository.PostavchikRepository;
import test.repository.SkladRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class PostavchikMenu {
	Scanner scanner = new Scanner(System.in);

    private  Menu menu ;


    private  final Service<Postavchik> postavchikService = new ServicePostavchik(
            new PostavchikRepository());
    private final Service<Tovar> skladService = new ServiceSklad(new SkladRepository());

    public PostavchikMenu(Menu menu) {
        this.menu=menu;
    }

    public void drawPostavchik() throws SQLException {
        System.out.println("---����������----");
        System.out.println("1.��������");
        System.out.println("2.�������");
        System.out.println("3.�������������");
        System.out.println("0. �����");
        int s=scanner.nextInt();
        switch (s) {
            case 1 -> newPostavchik();
            case 2 -> {
                System.out.println("not");
                deletePostavchik();
            }
            case 3->{
                System.out.println("!!!!");
                change();
            }
            case 0 -> menu.draw();
        }
    }
    private void  newPostavchik() throws SQLException {
        System.out.println("������� ������ ����������");
        System.out.print("��������: ");
        String name = scanner.next();
        System.out.print(" ����� ��������");
        Long telefon = scanner.nextLong();
        Postavchik postavchik = new Postavchik(null, name, telefon);
        postavchikService.save(postavchik);
    }
    void  drawListPostavchik() throws SQLException {
        System.out.println();
        System.out.println("---������ �����������---");
        postavchikService.getAll().forEach(System.out::println);
    }
    private void deletePostavchik() throws SQLException {
        drawListPostavchik();
        System.out.println("�������� ����������, ��� ��������");
        Long id= scanner.nextLong();
        Postavchik postavchik= postavchikService.find(id);
        postavchikService.delete(postavchik);
    }
    private void change() throws SQLException {
        drawListPostavchik();
        System.out.println("�������� ���������� ��� ���������");
        Long id = scanner.nextLong();

        Postavchik postavchik = postavchikService.find(id);

        System.out.println("�������� ��� ��������");
        System.out.println("1.��������");
        System.out.println("2.����� ��������");
        System.out.println("3.�������� ������");
        System.out.println("9.��������� � �����");
        System.out.println("0.�����");

        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("������� ����� ��������");
                postavchik.setName(scanner.next());

            }
            case 2 -> {
                System.out.println("������� ����� ����� ��������");
                postavchik.setTelefon(scanner.nextLong());
            }
            case 3 -> {
                skladService.getListPoIdPostav(postavchik.getId()).forEach(System.out::println);
                System.out.println("�������� ����� ����� ������ ������� � ��� ����������: ");
                Long id_tovar = scanner.nextLong();
                Tovar tovar = skladService.find(id_tovar);
                tovar.setId_postav(0L);
                skladService.update(tovar);
                System.out.println("�������!!!");
            }
            case 9->{
                postavchikService.update(postavchik);
                drawPostavchik();
            }
            case 0->{
                drawPostavchik();
            }
        }
    }

}
