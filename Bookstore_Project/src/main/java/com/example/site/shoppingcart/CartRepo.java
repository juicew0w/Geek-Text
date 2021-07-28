package com.example.site.shoppingcart;

import com.example.site.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <<interface>> ShoppingCartRepository
 * This is a Shopping Cart Repository Interface so based on this specific JPA this generates implementation code
 * so that we don't have to write SQL Queries.
 */

@Repository
public interface CartRepo extends JpaRepository<ShoppingCart, Integer>
{
    public List<ShoppingCart> showByProfile(Integer profile);

    public ShoppingCart findByProfile(Integer profile, Integer product_Id);

    @Query()
    @Modifying
    public void deleteBy(Integer user_Id, Integer productId);
    /**
     * Updates shopping cart in regards to a certain book and certain profile.
     * @param userId
     * @param product_Id
     * @param quantity
     */
    @Query()
    @Modifying
    public void update(Integer userId, Integer product_Id, Integer quantity);

}
