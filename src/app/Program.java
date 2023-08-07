package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findBydId(3);
		
		System.out.println(seller);

		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		    for (Seller obj : list) {
		        System.out.println(obj);
		    }

		 //tentar ordenar pelo id
		System.out.println("=== TEST 3: seller findAll ==="); 
		list = sellerDao.findAll();
		
		    for (Seller obj : list) {
		        System.out.println(obj);
		    }
		    System.out.println("=======test 4 insert============");
		    Seller newSeller = new Seller(null, "enock", "enock@gmail.com", new Date(), 4000.0, department);
		    sellerDao.insert(newSeller);
		    System.out.println("Inserted! new id = " + newSeller.getId());
		    
		    System.out.println("======= TESTE 5 UPDATE ============");
		    seller = sellerDao.findBydId(1);
		    seller.setBaseSalary(4000.0);
		    sellerDao.update(seller);
		    System.out.println("Update completed");
		    
		    System.out.println("======= TESTE 6 DELLETE ============");
		    System.out.println("digita um id");
		    int id = sc.nextInt();
		    sellerDao.deletebyId(id);
		    System.out.println("Delete completed");
		    sc.close();
		}
}