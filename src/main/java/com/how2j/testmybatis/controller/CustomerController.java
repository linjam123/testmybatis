package com.how2j.testmybatis.controller;

import com.how2j.testmybatis.entity.Customer;
import com.how2j.testmybatis.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//这是直接数据返回才用,如下
@RequestMapping("/Cus")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/findAll")//获得数据的用@getmapping,发射存入用@postmapping
    public List<Customer> findAll(){
        return customerRepository.findAll();

    }

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable("id") Long id){
        return customerRepository.findById(id);

    }
    @PostMapping("/save")//存入数据用@postmapping
    public void save(@RequestBody Customer customer){
        customerRepository.save(customer);

    }

    //而@ResponsebBody是把Java对象转为json对象返回给客户端
    @PutMapping("/update")//更新用@putmapping
    public void update(@RequestBody Customer customer){//@RequestBody:把请求里的Json对象转为java对象

        customerRepository.update(customer);
    }

    @DeleteMapping("/deleteById/{id}")//删除@deletemapping
    public void deleteById(@PathVariable("id") Long id){
        customerRepository.deleteById(id);

    }

}
