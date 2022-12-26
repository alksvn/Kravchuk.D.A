package test.view;

import test.Service.Service;
import test.Service.ServiceProdavec;
import test.domain.Prodavec;
import test.repository.ProdavecRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class ProdavecMenu {
	Scanner scanner= new Scanner(System.in);
    private final Service<Prodavec> prodavecService = new ServiceProdavec(new ProdavecRepository());
    private Menu menu;
    private OtdelMenu otdelMenu;

    public ProdavecMenu(Menu menu,OtdelMenu otdelMenu) {
        this.menu=menu;
        this.otdelMenu= otdelMenu;
    }

    public void drawProdavec() throws SQLException {
        System.out.println("---��������----");
        System.out.println("1.��������");
        System.out.println("2.�������");
        System.out.println("3.�������������");
        System.out.println("0. �����");

        switch (scanner.nextInt()) {
            case 1 -> newProdavec();
            case 2 -> deleteProdavec();
            case 3 -> changeProdavec();
            case 0 -> menu.draw();
        }
    }
    private void newProdavec() throws SQLException {
        System.out.println("������� ������ ��������");
        System.out.println("���");
        String name = scanner.next();
        System.out.println("���");
        String pol=scanner.next();
        System.out.println("�/�");
        int zp=scanner.nextInt();
        System.out.println("�������� �����");
        otdelMenu.drawListOtdel();
        Long id_otdel =scanner.nextLong();

        Prodavec prodavec= new Prodavec(null, name, pol,zp, id_otdel);
        prodavecService.save(prodavec);
    }
    void drawListProdavec() throws SQLException {
        System.out.println();
        System.out.println("---������ ���������---");
        prodavecService.getAll().forEach(System.out::println);
    }
    private void deleteProdavec() throws SQLException {
        drawListProdavec();
        System.out.println("�������� �������� ��� ��������");
        Long id = scanner.nextLong();
        Prodavec prodavec = prodavecService.find(id);
        prodavecService.delete(prodavec);
    }
    private  void changeProdavec() throws SQLException {
        deleteProdavec();
        System.out.println("�������� �������� ��� ���������");
        Long id= scanner.nextLong();
        Prodavec prodavec=prodavecService.find(id);

        System.out.println("��� ��������?");
        System.out.println("1.���");
        System.out.println("2. ���");
        System.out.println("3. �/�");
        System.out.println("4. �����");
        System.out.println("9. ��������� � �����");
        System.out.println("0. �����");

        switch (scanner.nextInt()){
            case 1->{
                System.out.println("������� ����� ���");
                prodavec.setName(scanner.next());
            }
            case 2->{
                System.out.println("������� ����� ���");
                prodavec.setPol(scanner.next());
            }
            case 3->{
                System.out.println("������� ����� �/�");
                prodavec.setZp(scanner.nextInt());
            }
            case 4->{
                System.out.println("�������� ����� �����");
                otdelMenu.drawListOtdel();
                prodavec.setId_otdel(scanner.nextLong());
            }
            case 9->{
                prodavecService.update(prodavec);
                drawProdavec();
            }
            case 0->{
                drawProdavec();
            }
        }
    }

}
