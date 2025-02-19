package com.inditex.poc;

import com.inditex.poc.model.Order;
import com.inditex.poc.repository.OrderRepository;
import com.inditex.poc.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    /*
    private final OrderRepository orderRepository = mock(OrderRepository.class);
    private final OrderService orderService = new OrderService(orderRepository);

    @Test
    void testSaveOrder() {
        Order order = new Order();
        order.setProductName("Producto A");
        order.setQuantity(10);

        when(orderRepository.save(Mockito.any(Order.class))).thenReturn(order);

        Order savedOrder = orderService.saveOrder(order);

        assertNotNull(savedOrder);
        verify(orderRepository, times(1)).save(order);
    }

     */
}

