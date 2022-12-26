package test.view;

import test.Service.Service;
import test.Service.ServiceOtdel;
import test.Service.ServiceSklad;
import test.Service.ServiceTovar;
import test.domain.Otdel;
import test.domain.Tovar;
import test.repository.OtdelRepository;
import test.repository.SkladRepository;
import test.repository.TovarRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class OtdelMenu {
	Scanner scanner = new Scanner(System.in);
    private final Service<Otdel> otdelService = new ServiceOtdel(new OtdelRepository());
    private final Service<Tovar> tovarService = new ServiceTovar(new TovarRepository());
    private final Service<Tovar> skladService = new ServiceSklad(new SkladRepository());
    private  Menu menu;

    public OtdelMenu(Menu menu) {
        this.menu=menu;
    }


    void drawOtdel() throws SQLException {
        System.out.println("---������----");
        System.out.println("1.��������");
        System.out.println("2.�������");
        System.out.println("3.�������������");
        System.out.println("0. �����");

        switch (scanner.nextInt()){
            case 1-> newOtdel();
            case 2-> deletOtdel();
            case 3-> changeOtdel();
            case 0 -> menu.draw();
        }

    }
    private void  newOtdel() throws SQLException {
        System.out.println(" ������� ������ ������: ");
        System.out.print("�������� : ");
        String name= scanner.next();
        System.out.println("������� ������ ������: ");
        int nch= scanner.nextInt();
        int nmin= scanner.nextInt();
        System.out.println("������� ����� ������");
        int kch= scanner.nextInt();
        int kmin = scanner.nextInt();

        Otdel otdel= new Otdel(null, name,nch, nmin, kch, kmin );
        otdelService.save(otdel);
    }
    private void deletOtdel() throws SQLException {
        drawListOtdel();
        System.out.println(" �������� �����, ������� ���� ������� ");
        Long id = scanner.nextLong();

        Otdel otdel= otdelService.find(id);
        List<Tovar> tovarList = tovarService.getListPoId(id);

        for (Tovar tovar : tovarList) {
            Tovar tovar1 = skladService.find( tovar.getId() );
            tovar1.setKolvo( tovar1.getKolvo() + tovar.getKolvo() );
            skladService.update(tovar1);
        }

        otdelService.delete(otdel);
    }
    void changeOtdel() throws SQLException {
        drawListOtdel();
        System.out.println("�������� �����, ������� ���� ��������");
        Long id =scanner.nextLong();

        Otdel otdel = otdelService.find(id);

        System.out.println("��� ������ ��������?");
        System.out.println("1. ��������");
        System.out.println("2. ������ ������");
        System.out.println("3. ����� ������");
        System.out.println("4. ����� � ������ ");
        System.out.println("5. �����");

        switch (scanner.nextInt()){
            case 1-> {
                System.out.println(" ������� ����� �������� :");
                otdel.setName(scanner.next());
            }
            case 2->{
                System.out.println(" ������� ����� ����� ������ ������");
                otdel.setNch(scanner.nextInt());
                System.out.print(" : ");
                otdel.setNmin(scanner.nextInt());
            }
            case 3 ->{
                System.out.println("������� ����� ����� ����� ������ ");
                otdel.setKch(scanner.nextInt());
                System.out.print(" : ");
                otdel.setKmin(scanner.nextInt());
            }
            case 4->{
                System.out.println("1. �������� � �����");
                System.out.println("2. ������� �� ������ ");
                System.out.println("0. �����");
                switch (scanner.nextInt()){
                    case 1->{
                        skladService.getListNoId().forEach(System.out::println);
                        System.out.println("�������� ����� ����� �������� � ���� �����: ");
                        Long id_tovar = scanner.nextLong();
                        Tovar tovar = skladService.find(id_tovar);
                        Tovar tovarOtdel = tovar;
                        int q=0;
                        while (q==0){
                            System.out.println("���������� ������ �� ������= " + tovar.getKolvo());
                            System.out.println("������� ���������� � ������: ");
                            int s = scanner.nextInt();

                            if (s>tovar.getKolvo()){
                                System.out.println("�� ������ ��� ������� ������!!!");
                            }else {
                                q=1;
                                tovar.setKolvo( tovar.getKolvo() - s );
                                tovar.setId_otdel(id);
                                tovarOtdel.setKolvo(s);
                                tovarOtdel.setId_otdel(id);

                                System.out.print("������� ���� �� �����: ");
                                tovarOtdel.setCena(  scanner.nextFloat() );
                            }
                        }
                        tovarService.save(tovarOtdel);
                        skladService.update(tovar);
                    }
                    case 2->{
                        skladService.getListPoId(id).forEach(System.out::println);
                        System.out.println("�������� ����� ������� ������ �������: ");
                        Long id_tovar = scanner.nextLong();

                        Tovar tovar = tovarService.find(id_tovar);
                        Tovar tovar1 = skladService.find( id_tovar );

                        tovar1.setKolvo( tovar1.getKolvo() + tovar.getKolvo() );
                        skladService.update(tovar1);
                        tovarService.delete(tovar);
                    }
                    case 0->{
                        drawOtdel();
                    }
                }
            }
        }

    }
    void drawListOtdel() throws SQLException {
        System.out.println();
        System.out.println("---������ �������---");
        otdelService.getAll().forEach(System.out::println);

    }

}
