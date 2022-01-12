package application;

import medel.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: seller findByID ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
