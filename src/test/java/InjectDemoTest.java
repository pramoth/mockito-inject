/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import th.co.geniustree.internship.mockito.inject.Car;
import th.co.geniustree.internship.mockito.inject.Steering;

/**
 *
 * @author pramoth
 */
public class InjectDemoTest {
    //This create mock and auto inject mock dependencies
    @InjectMocks
    private Car car;
    //This  create mock and inject it to Car 
    @Mock
    private Steering steering;
    
    public InjectDemoTest() {
    }
    
    @Before
    public void setUp() {
        //Make it happen.
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void test(){
        assertNotNull(car.getWheel());
    }
    
}
