package fr.eni.connexion.dal;

import java.util.List;


public interface DAO<T> {
	
	public List<T> selectAll() throws DALException;
	
	public T selectById(int no) throws DALException;
	
	public void update(T t)throws DALException;
	
	public void delete(int no) throws DALException;
	
	public void insert(T t) throws DALException;


}
