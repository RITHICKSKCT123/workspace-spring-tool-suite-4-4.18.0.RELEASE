package com.snapchat.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>
{

}
