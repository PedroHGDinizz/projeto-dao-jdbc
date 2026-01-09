package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner pd = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("TEST findByDepartments: ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartments(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TEST findAll: ");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TEST insert: ");
		Seller newseller = new Seller(null,"Greg","greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newseller);
		System.out.println("Inserted! New id = "+ newseller.getId());
		
		System.out.println("TEST Update: ");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("TEST Delete: ");
		System.out.println("Enter id for delete test: ");
		int id = pd.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		pd.close();

	}

}
