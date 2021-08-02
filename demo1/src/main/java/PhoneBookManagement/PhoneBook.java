/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBookManagement;

/**
 *
 * @author mac
 */
public class PhoneBook extends Phone {

    PhoneBook[] phoneList = {};

    String name;
    String phone;

    @Override
    void insertPhone(String name, String phone) {
        boolean isNameExists = false;
        boolean isPhoneExists = false;
        int viTri = 0;
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i].name == name) {
                isNameExists = true;
                viTri = i;
            }
            if (phoneList[i].phone == phone) {
                isPhoneExists = true;
                viTri = i;
            }

        }
        // tao mang moi
//        PhoneBook newphoneList[] = new PhoneBook[phoneList.length + 1];

        if (isNameExists) {
//            System.out.println("Trung Ten");
            if (isPhoneExists) {
                System.out.println("Trung Ten va SDT");

            } else {
                System.out.println("Trung Ten va != SDT");
                phoneList[viTri].phone = phoneList[viTri].phone + " : " + phone;
            }

        } else {
//            System.out.println("Ten + SDT khac nhau");

            PhoneBook pb = new PhoneBook();
            pb.name = name;
            pb.phone = phone;
            // tao mang
            PhoneBook newphoneList[] = new PhoneBook[phoneList.length + 1];
            // cap nhat 
            // Cap nhat gia tri cu cho mang moi
            for (int i = 0; i < phoneList.length; i++) {
                newphoneList[i] = phoneList[i];
            }
            newphoneList[phoneList.length] = pb;
            phoneList = newphoneList;

        }
        System.out.println("==="+ name + phone);

    }

    @Override
    public String toString() {
        return "Ten : " + name + "SDT : " + phone;
    }

    @Override
    void removePhone(String name) {
        int viTri = 0;
        boolean isNameExists = false;
        for (int i = 0; i < phoneList.length; i++) {
            if (name == phoneList[i].name) {
                viTri = i; // lấy ra vị trí cần xoá
                isNameExists = true;
            }
        }
        if (isNameExists) {
            PhoneBook newphoneList[] = new PhoneBook[phoneList.length - 1]; // tao mang moi chua length - 1 phan tu
            for (int i = 0; i < phoneList.length; i++) {
                if (viTri == i) {
                } else {
                    if (i > viTri) {
                        newphoneList[i - 1] = phoneList[i];
                    } else {
                        newphoneList[i] = phoneList[i];
                    }
                }
            }
            phoneList = newphoneList;
            System.out.println("Da Xoa Thanh Cong");
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        int viTri = 0;
        boolean isPhoneExists = false;
        for (int i = 0; i < phoneList.length; i++) {
            if (name == phoneList[i].name) {
                viTri = i; // lấy ra vị trí cần xoá
                isPhoneExists = true;
            }

        }
        if (isPhoneExists){
          phoneList[viTri].phone = newphone;  
        }
    }

   
    @Override
    void searchPhone(String name) {
        int viTri = 0;
        boolean isNameExists = false;
        for (int i = 0; i < phoneList.length; i++) {
            if (name == phoneList[i].name) {
                viTri = i; // lấy ra vị trí cần xoá
                isNameExists = true;
            }

    }
        if(isNameExists){
            System.out.println(phoneList[viTri].name +" : "+ phoneList[viTri].phone);
        }
    }

    @Override
    void sort() {
        String temp;
        
        for (int i = 0; i < phoneList.length; i++) {
            for (int j = i+1; j < phoneList.length; j++) {
                if(phoneList[i].name.compareTo(phoneList[j].name)>0){
                    temp = phoneList[i].name;
                    phoneList[i].name = phoneList[j].name;
                    phoneList[j].name =temp;
                    
                }
            }
        }
        
    }

    public void show() {
        System.out.println("alo");
        for (int i = 0; i < phoneList.length; i++) {
            System.out.println("==" + phoneList[i]);
        }

    }
}
