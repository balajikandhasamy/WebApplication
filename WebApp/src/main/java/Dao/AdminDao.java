package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Customer1;
//import Dto.Customer;
import Dto.Operator;

public class AdminDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void sign(Operator o){
	
	entityTransaction.begin();
	entityManager.persist(o);
	entityTransaction.commit();
	
}
public Operator  login(String Operator_UserName){
	Operator op=entityManager.find(Operator.class, Operator_UserName );
	return op;
}
public void create(Customer1 c) {
	
	entityTransaction.begin();
	entityManager.persist(c);
	entityTransaction.commit();
	

}
public Customer1 edit(int customer_id,String created_time){
	Customer1 customer=entityManager.find(Customer1.class,customer_id );
	customer.setCreated_time(created_time);
	entityTransaction.begin();
	entityManager.merge(customer);
	entityTransaction.commit();
	return customer;
}

public Customer1 fetch(int customer_id){
	Customer1 d=entityManager.find(Customer1.class,  customer_id); 
	return d;
}
public  Customer1 findbyId(int customer_id) {
	// TODO Auto-generated method stub
	Customer1 customer=entityManager.find(Customer1.class,customer_id ); 
	return customer;
	
}
public void delete(Customer1 d){
	
	entityTransaction.begin();
	entityManager.remove(d);
	entityTransaction.commit();
}
public List<Customer1> fetchall(){
	Query query=entityManager.createQuery("select data from Customer1 data");
	List<Customer1> customer1=query.getResultList();
	return customer1;
}
public void deleteall(){
	Query q = entityManager.createQuery("delete from Customer1 ");
	entityTransaction.begin();
	q.executeUpdate();
	entityTransaction.commit();
}
}
