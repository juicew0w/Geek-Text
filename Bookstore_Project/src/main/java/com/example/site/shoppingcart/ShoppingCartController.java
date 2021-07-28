package com.example.site.shoppingcart;

import java.util.List;

import com.example.site.entity.ShoppingCart;
import com.example.site.shoppingcart.ShoppingCartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ShoppingCartController
{
    /**
     * The @Autowire handles are dependency injections. Automatically insert an instance of the
     * ShoppingCartServices class into the controller
     */
    @Autowired
    private ShoppingCartServices cartServices;
    @Autowired
    private Integer profileServices;

    //Spring framework to show the shopping cart.
    @GetMapping(value = "/cart")
    public String showCart(Model model)
    {
        //Profile profile = profileServices.getCurrentlyLoggedInCustomer(authentication);
        //List<ShoppingCart> cartItems = cartServices.listAll(profile);

        //model.addAllAttributes("Shopping Cart", cartItems)
        return"shopping_cart";
    }

    //@PostMapping("/cart")
    //public void add(@RequestBody ShoppingCart product_id)
    //{
      //  services.save(product_id);
    //}

    //@GetMapping("/cart/{user_id}")
    //public ResponseEntity<ShoppingCart> get(@PathVariable Integer user_id)
    //{
        //ShoppingCart cart = services.get(user_id);  //get method in SCServices
    //}

}
