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
    
    //Đệ quy, recursion, gọi lại chính mình với quy mô khác
    //Búp bê người Nga
    //5! = 1.2.3.4.5
    //5! = 5 * 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //1! = 1; //dừng
    //n! = n * (n - 1)! công thức lặp lại chính mình
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //điểm dừng đệ quy
        
        return n * getFactorial(n - 1); //xong
    }
    
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n >= 21)
//            throw new IllegalArgumentException("n must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;   //n đặc biệt dừng luôn 
//        
//        long product = 1;  //khởi đầu giai thừa là 1
//        
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }    
}
