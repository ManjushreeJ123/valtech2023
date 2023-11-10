package com.valtech.training.firstspringboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.valtech.training.firstspringboot.entity.Order;


@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{
	
	@Query( value ="SELECT o FROM Order o WHERE o.itemCount= ?1")
	
	List<Order> findAllByItemCount(int itemCount);
	
	List<Order> findAllByItemAndItemCount(String item,int  itemCount);
	
	int countByItem(String item); 
	
	
	
	
	
	

}
