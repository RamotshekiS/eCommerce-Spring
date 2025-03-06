package com.selloramotsheki.eCommerce.service.cart;

import com.selloramotsheki.eCommerce.exeptions.ResourceNotFoundException;
import com.selloramotsheki.eCommerce.model.Cart;
import com.selloramotsheki.eCommerce.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService{
    private final CartRepository cartRepository;

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
        BigDecimal totalAmount = cart.getTotalAmount();
        cart.setTotalAmount(totalAmount);
        return cartRepository.save(cart);
    }

    @Override
    public void clearCart(Long id) {

    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        return null;
    }
}
