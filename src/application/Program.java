package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
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

	}

}
