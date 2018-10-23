package com.salome.hello;

import org.junit.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Created by Sai Anudeep Machavarapu on 10/23/18.
 */
public class GreeterTest {

    private Greeter greeter = new Greeter();


    @Before
    public  void setup(){
        //do all the initializations

    }

    @Test
    public void greeterSaysHello(){
        assertThat(greeter.sayHello(), containsString("Hello"));
    }


    @After
    public void teardown(){

    }
}
