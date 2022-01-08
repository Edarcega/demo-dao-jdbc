package model.Dao;

import java.util.List;

import medel.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();

}