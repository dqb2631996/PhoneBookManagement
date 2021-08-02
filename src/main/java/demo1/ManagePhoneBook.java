/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class ManagePhoneBook {
PhoneBook pb = new PhoneBook();
    public void menu() {
        System.out.println("1.Insert Phone");
        System.out.println("2.Remove Phone");
        System.out.println("3.Update Phone");
        System.out.println("4.Search Phone");
        System.out.println("5.Sort");
        System.out.println("6. Exit");
    }

    public void use() {
        while (true) {
            menu();

            System.out.println("Nhap Thao Tac");
            
            Scanner sc = new Scanner(System.in);
            int nhap = sc.nextInt();
            if (nhap == 1) {
                System.out.println("Nhap Ten + SDT");
                sc.nextLine();
                pb.insertPhone(sc.nextLine(), sc.nextLine());
                
                
            } else if (nhap == 2) {
                System.out.println("Nhap Ten Can Xoa");
                pb.removePhone(sc.nextLine());
            } else if (nhap == 3) {
                System.out.println("Chap Nhat SDT");
                pb.updatePhone(sc.nextLine(), sc.nextLine());
            } else if (nhap == 4) {
                System.out.println("Tim Danh Ba");
                pb.searchPhone(sc.nextLine());
            } else if (nhap == 5) {
                pb.sort();

            } else if (nhap == 6) {
                System.out.println("===");
                pb.show();

            }else{
                System.out.println("Nhap sai thao tac");
            }
            System.out.println("Nhap 1 de dung lai");
            System.out.println("Nhap phim bat ky de tiep tuc");
            int tt = sc.nextInt();
            if(tt == 1 ){
                break;
            }else{
                continue;
            }
        }
    }
    public void run (){
        
        use();  
   
    }  
}
