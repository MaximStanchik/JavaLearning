package org.Stanchik.service;


import org.Stanchik.entity.Cat;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CatServiceTest {

    @Autowired
    private CatService catService;

    @Test
    @Order(1)
    public void createSelectTest() {
        //given
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(5);

        //when
        catService.insert(cat);
        Cat actual = catService.findById(1);
        cat.setId(1);

        assertEquals(actual, cat);
    }

    @Test
    @Order(3)
    public void insertUpdateTest() {
        //when
        catService.delete(1);
        assertNull(catService.findById(1));

    }

    @Test
    @Order(3)
    public void updateTest() {
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(5);

        catService.insert(cat);
        cat.setId(2);
        cat.setName("Antony");
        catService.update(cat);

        Cat actual = catService.findById(2);

        assertEquals(actual.getAge(), 5);
        assertEquals(actual.getName(), "Antony");
    }
}
