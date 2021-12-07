package com.product.onlineproductshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.product.onlineproductshopping.entity.CheckoutData;

public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
