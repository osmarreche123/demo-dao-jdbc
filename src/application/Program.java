package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("===TEST 1: seller findById ======== ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("\n===TEST 2: List<SELLERS> findByDepartment ====");
        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);

        list.forEach(System.out :: println);

        System.out.println("\n===TEST 3: List<SELLERS> findAll ====");

        list = sellerDao.findAll();

        list.forEach(System.out :: println);

        System.out.println("\n===TEST 4: Seller insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted new id = " + newSeller.getId());


    }
}
