package com.how2j.testmybatis.repository;

import com.how2j.testmybatis.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public void save(Customer customer);
    public void update(Customer customer);
    public void deleteById(Long id);
}
