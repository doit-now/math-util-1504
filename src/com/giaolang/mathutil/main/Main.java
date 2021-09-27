/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author giao.lang
 */
public class Main {
    
    public static void main(String[] args) {
        //test = tay, manual testing nè
        //MathUtil.getFactorial(-5);
        System.out.println("0!: 1? " + MathUtil.getFactorial(0));
        System.out.println("1!: 1? " + MathUtil.getFactorial(1));
        System.out.println("2!: 2? " + MathUtil.getFactorial(2));
        System.out.println("5!: 120? " + MathUtil.getFactorial(5));
        //muốn thấy xh ngoại lệ hay ko thì cứ gọi để xem app bị giết
    }
}
