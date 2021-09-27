/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtil {

    //ta viết hàm tính n! = 1.2...n
    //21! tràn kiểu long (18 số 0)
    //ko tính âm giai thừa
    //0! = 1! = 1 - quy ước
    //TDD - Test Driven Development - viết test trước khi viết code chính
    //Test First Development, viết, suy nghĩ về bộ test case/các tình huống
    //chạy hàm trước khi viết hàm
    public static long getFactorial(int n) {
        
        if (n < 0 || n >= 21)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;   //n đặc biệt dừng luôn 
        
        long product = 1;  //khởi đầu giai thừa là 1
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }    
}
