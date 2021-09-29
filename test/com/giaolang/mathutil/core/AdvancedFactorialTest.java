/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author giao.lang
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //tách toàn bộ data cần test gồm đầu vào/input và expected/output
    //ra 1 chỗ cho dễ quản lí/dễ theo dõi/dễ thống kê đủ các tình huống
    //cần test hay chưa
    
    //ta có thể đặt bộ data này ở file txt, csv, excel, database
    @Parameters
    public static Object[][] initData() { //tên hàm tự do               
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 7720}, 
                                {0, 1}
                               };        
    } 
    
    //chuẩn bị 2 biến hứng data từ mảng, sau đó thảy vào hàm test
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
            
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {      
        
        assertEquals(expected, getFactorial(input)); 
    }    
}
