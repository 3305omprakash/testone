package com.example.demo.controller;



import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
 
 @RequestMapping("/demo1")
 public int demo1() {
     return 42;
 }

 @RequestMapping("/demo2")
 public double demo2() {
     return 3.14159;
 }

 @GetMapping("/demo3")
 public String demo3() {
     return "<h1>Welcome to the Demo Application</h1>";
 }

 @GetMapping("/demo4")
 public String demo4() {
     String university = "KLEF";
     return "I Study at " + university;
 }

 @GetMapping("/demo5/{id}")
 public String demo5(@PathVariable int id) {
     return "ID: " + id;
 }

 @GetMapping("/demo6/{a}/{b}")
 public String demo6(@PathVariable int a, @PathVariable int b) {
     int sum = a + b;
     return "Sum: " + sum;
 }

 @GetMapping("/demo7")
 public String demo7(@RequestParam int id) {
     return "Request Parameter ID: " + id;
 }

 @GetMapping("/demo8/{name}")
 public String demo8(@PathVariable String name) {
     return "Name: " + name;
 }
 private List<Customer> customerList = new ArrayList<>();

 // POST mapping to add a new customer
 @PostMapping("/addcustomer")
 public String addCustomer(@RequestBody Customer customer) {
     customerList.add(customer);
     return "Customer Added Successfully";
 }

 // GET mapping to retrieve the list of all customers
 @GetMapping("/viewcustomers")
 public List<Customer> viewCustomers() {
     return customerList;
 }
}
