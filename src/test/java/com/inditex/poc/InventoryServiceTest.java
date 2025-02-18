package com.inditex.poc;

import com.inditex.poc.model.Inventory;
import com.inditex.poc.repository.InventoryRepository;
import com.inditex.poc.service.InventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class InventoryServiceTest {

    @Mock
    private InventoryRepository inventoryRepository;

    @InjectMocks
    private InventoryService inventoryService;

    private Inventory inventory;

    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
        inventory.setId(1L);
        inventory.setProductName("Producto 1");
        inventory.setStockQuantity(100);
    }

    @Test
    public void testCreateInventory() {
        when(inventoryRepository.save(inventory)).thenReturn(inventory);

        Inventory createdInventory = inventoryService.createInventory(inventory);

        assertNotNull(createdInventory);
        assertEquals("Producto 1", createdInventory.getProductName());

        verify(inventoryRepository, times(1)).save(inventory);
    }
}
