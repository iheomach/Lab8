package com.example.lab8;


import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount(); list.addCity(new City("Estevan", "SK")); assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City newcity = new City("Estevan", "SK");
        list.addCity(newcity);
        assertTrue(list.hascity(newcity));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newcity = new City("Estevan", "SK");
        list.addCity(newcity);
        assertEquals(list.getCount(),listSize + 1);
        list.deleteCity(newcity);
        assertEquals(list.getCount(),listSize);
    }

    @Test
    public void CountCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newcity = new City("Estevan", "SK");
        list.addCity(newcity);
        assertEquals(list.countcities(),listSize + 1);
    }



}
