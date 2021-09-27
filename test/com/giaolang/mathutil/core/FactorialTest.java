/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {
    
    @Test(expected = IllegalArgumentException.class) 
    //biến hàm này thành public static void main() {...}
    //đây là cú pháp/quy tắc của bộ thư viện JUnit    
    public void checkFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(22);
        MathUtil.getFactorial(23);
        
    }
    //âm ko tính giai thừa
    //>= 21 bị tràn long, hok tính luôn
    //2 tình huống này ko có value trả về, hok so sánh đc
    //ko assertEquals() so sánh coi có bằng ko
    
    
    @Test  //viết code dùng để test code chính MathUtil
    //       tên hàm phải nói lên mục đích của việc test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        //tui kì vọng khi gọi hàm tính 5! thì máy trả về 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        
        //đừng quên còn nhiều tình huống/test case xài hàm
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));        
    }
    
   
    
}
//XANH ĐỎ QUY ƯỚC
//HÀM ĐÁNH GIÁ LÀ XANH, NẾU TẤT CẢ CÁC TÌNH HUỐNG TEST PHẢI XANH
//TEST GÌ THÌ XANH NẤY, TỨC LÀ TEST GÌ, THÌ EXPECTED == ACTUAL
//ÁM CHỈ HÀM XỬ LÍ ĐÚNG

//CHỈ CẦN 1 CÁI ĐỎ, CẶP EXPECTED != ACTUAL, CÓ NGHĨA HÀM XỬ LÍ KO ĐÚNG
//HOẶC BẠN KÌ VỌNG SAI

//TA CẦN XEM LẠI CODE/TEST ĐỂ ĐẢM BẢO XANH HẾT, KẾT LUẬN HÀM ỔN
//CHO CÁC TÌNH HUỐNG ĐÃ TEST

//NUnit Nuget
//MSTest xUnit