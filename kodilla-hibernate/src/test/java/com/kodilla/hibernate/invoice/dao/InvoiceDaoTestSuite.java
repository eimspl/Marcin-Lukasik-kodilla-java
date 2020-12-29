package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Invoice invoice = new Invoice("21");

        Product firstProduct = new Product("onion");
        Product secondProduct = new Product("lemon");
        Product thirdProduct = new Product("orange");

        Item firstItem = new Item(new BigDecimal(5.2), 3);
        Item secondItem = new Item(new BigDecimal(2.0), 4);
        Item thirdItem = new Item(new BigDecimal(1.7), 7);

        firstItem .setInvoice(invoice);
        secondItem.setInvoice(invoice);
        thirdItem.setInvoice(invoice);

        firstItem .setProduct(firstProduct);
        secondItem.setProduct(secondProduct);
        thirdItem.setProduct(thirdProduct);

        invoice.getItems().add(firstItem);
        invoice.getItems().add(secondItem);
        invoice.getItems().add(thirdItem);

        //when
        invoiceDao.save(invoice);
        int firstProductId = firstItem.getId();
        String actualNameOFirstProduct = firstProduct.getName();
        int numberOfItems = invoice.getItems().size();
        int id = invoice.getId();
        Invoice invoiceInDB = invoiceDao.findById(id);

        //then
        Assert.assertEquals(id, invoiceInDB.getId());
        Assert.assertEquals("onion", actualNameOFirstProduct);
        Assert.assertNotEquals(0, firstProductId);
        Assert.assertEquals(3, numberOfItems);

        //clear up
        invoiceDao.deleteById(id);
    }
}