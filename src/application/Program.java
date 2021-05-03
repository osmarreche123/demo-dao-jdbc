package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

        Seller seller = new Seller(321, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();


    }
}
