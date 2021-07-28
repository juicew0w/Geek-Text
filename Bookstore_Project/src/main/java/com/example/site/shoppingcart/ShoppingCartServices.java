package com.example.site.shoppingcart;

import java.util.List;

import com.example.site.entity.ShoppingCart;
import com.example.site.shoppingcart.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ShoppingCartServices must be able to:
 * 1. Must be able to update the shopping cart with a book.
 * 2. Must be able to retrieve the list of book(s) in the shopping cart
 * 3. Must be able to delete a book from the shopping cart instance for that user
 * 4. Must be able to create a shopping cart instance for a user. Shopping care must belong to a user
 */

@Service
public class ShoppingCartServices
{
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    //private Book_Browsing productRepo;

    public List<ShoppingCart> listAll(Integer profile)
    {
        return cartRepo.showByProfile(profile);
    }

    public Integer addBook(Integer productId, Integer quantity, Integer profile)
    {
        Integer addQuantity = quantity;
        //Book product = productRepo.findById(productId).get();
        ShoppingCart shoppingCart = cartRepo.findByProfile(profile, productId);

        //Might not include quantity!
        if(shoppingCart != null)
        {
            addQuantity = shoppingCart.getQuantity() + quantity;
            shoppingCart.setQuantity(addQuantity);
        }
        else
        {
            shoppingCart = new ShoppingCart();
            shoppingCart.setQuantity(profile);
            shoppingCart.setUser_Id(profile);
            shoppingCart.setProduct_Id(productId);
        }
        cartRepo.save(shoppingCart);
        return addQuantity;
    }

    public void deleteBook(Integer user_Id, Integer product_Id)
    {
        //cartRepo.deleteBy(Profile.getUser_Id);
    }

    public void updateCart(Integer user_Id, Integer product_Id, Integer quantity)
    {
        //cartRepo.update(Profile.getUserId(), product_Id, quantity);
        //totalAmount = product.getPrice() * quantity;
        //return total Amount
    }

}
