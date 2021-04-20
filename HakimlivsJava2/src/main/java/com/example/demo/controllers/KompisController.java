package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

// @RequestMapping(path = "/
@Controller
@CrossOrigin
public class KompisController {

    Category currentCategory=new Category();
    Orders currentOrder = new Orders();
    OrderInfo currentOrderInfo = new OrderInfo();
    Product currentProduct = new Product();

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private OrderInfoRepository orderInfoRepository;


    @GetMapping(path="/addproduct")
    public @ResponseBody String addNewProduct(@RequestParam String title, @RequestParam String description, @RequestParam int price,
                                              @RequestParam String image, @RequestParam Long category_id) {


        currentCategory.setId(category_id);

        Product p = new Product();
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        p.setImage(image);
        p.setCategory(currentCategory);

        productRepository.save(p);
        return "Ny produkt sparad";
    }

    @PostMapping(path="/order")
    public @ResponseBody String addNewOrder(@RequestParam Long id, @RequestParam int quantity) {

        //currentOrder.setId();
        //currentOrderInfo.setProduct();
        currentProduct.setId(id);

        OrderInfo oi = new OrderInfo();
        oi.setProduct(currentProduct);
        oi.setQuantity(quantity);

        Orders o = new Orders();
        //o.setCustomer();

        return "Order sparad";
    }

    @PostMapping(path="/all")
    public @ResponseBody Iterable<Product> getAllKompisar() {
        return productRepository.findAll();
    }


    @PostMapping(path="/getcustomers")
    public @ResponseBody Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    /*@GetMapping("/addproduct")
    public String ProductForm(Model model) {
        model.addAttribute("addproduct", new Product());
        return "product";
    }

    @PostMapping("/addproduct")
    public String ProductSubmit(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", product);
        return "result";
    }*/


}
