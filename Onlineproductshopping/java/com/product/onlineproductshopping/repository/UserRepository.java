package com.product.onlineproductshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.onlineproductshopping.entity.CheckoutData;
import com.product.onlineproductshopping.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer>{

}
