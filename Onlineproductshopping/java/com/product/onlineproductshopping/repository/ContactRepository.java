package com.product.onlineproductshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.onlineproductshopping.entity.ContactData;


public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
