/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucnm.mathutil.test;

import static com.lucnm.mathutil.MathUtility.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jun
 */
public class MainUtillTest {
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5;
       long excepted = 120;
       long actual = getFactorial(n);
       
       assertEquals(excepted, actual);
       
       assertEquals(720, getFactorial(6));
       assertEquals(24, getFactorial(4));
       assertEquals(24, getFactorial(4));
       assertEquals(6, getFactorial(3));
       assertEquals(1, getFactorial(1));
       assertEquals(1, getFactorial(0));
   }
    @Test(expected = IllegalArgumentException.class)
    
    public void testFactorialWrongArgumentThrowsException(){ 
        //minh test tinh huon ham phai nem ra ngoai le neu tham so ca chon
        //ngoai le la khonng phai la value de so sanh
        //ta phai dung chiu khac, KUnit 4 khac JUnit, ko dung assertEquals()
        //kì 5 đi dư thính môn SWT301 của thầy hoàng, DI, Lambds Expression liên quan
        //
        
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }
}

//minh test tiep cac truong hop khac dung dau vao, dung dau ra
//khoi can bien trung, choi luon trong lenh
 

//dieu gi xay ta neu ta dua vao tham so ca cho, am, hoac >20
//theo thiet ket cua ham, dua vao ca chon se ne, ra ngoaile
//va ta CAN TEST XEM, NGOAI LE CO DC NEM RA KO NEU TA CA CHON
//TU LA THAY XUA HIEN NGOAI LE NEU CO CA CHON DUA VAO -> HAM DUNG
//THAY NGOAI LE KHI CO CA CHON MINH LAI MUNG VI HAM DA CHAY DUNG
