package app;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findBydId(2);
		System.out.println(department);
		
		System.out.println("=== TEST 3: seller findAll ==="); 
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		/*
	    System.out.println("=======test 4 insert============");
	    Department newDepartment = new Department(7, "Programming");
	    departmentDao.insert(newDepartment);
	    System.out.println("Inserido com succeso! Novo id = " + newDepartment.getId());
	    */
		/*
	    System.out.println("======= TESTE 5 UPDATE ============");
	    System.out.println("Digite um id: ");
	    int id1 = sc.nextInt();
	    department = departmentDao.findBydId(id1);
	    department.setName("Eletronics");
	    departmentDao.update(department);
	    System.out.println("Update completed");
	    */
	    System.out.println("-------- TESTE 6 DELETE ----------");
	    System.out.println("Digite um id: ");
	    int id2 = sc.nextInt();
	    departmentDao.deletebyId(id2);
	    System.out.println("Delete completed");
	    
	    sc.close();
	}

}
