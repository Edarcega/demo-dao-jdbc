package application;

import java.util.List;
import java.util.Scanner;

import medel.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
			
		System.out.println("-- Teste Busca departamento --");
		System.out.println("Entre com o ID do departamento: ");
		Department dep = departmentDao.findById(sc.nextInt());
		sc.nextLine();
		System.out.println(dep);
		System.out.println();
		
		System.out.println("-- Teste Inserir Departamento --");
		System.out.println("Nome do departamento: ");
		dep.setId(null);
		dep.setName(sc.nextLine());
		departmentDao.insert(dep);
		System.out.println(dep);
		System.out.println();
		
		System.out.println("-- Teste deletar Departamento --");
		departmentDao.deleteById(dep.getId());
		System.out.println("Deleted completed");
		System.out.println();
		
		System.out.println(" -- Teste Busca todos -- ");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		System.out.println();
		
		System.out.println(" -- Teste UPdate -- ");
		System.out.println("Digite o ID do departamento: ");
		dep.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Novo nome: ");
		dep.setName(sc.nextLine());
		departmentDao.update(dep);
		dep = departmentDao.findById(dep.getId());
		System.out.println(dep);
		
		System.out.println(" -- Teste Busca todos -- ");
		list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		System.out.println();
		
		sc.close();
	}

}
