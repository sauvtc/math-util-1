/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilovecode.mathutil.core;

/**
 *
 * @author Sau
 */
public class MathUtil {
    //trong class này cung cấp cho nhiều hàm xử lý toán học
    //hàm thu viện sài chung cho ai đó thì phải thiết kế hàm static
    //hàm tính giai thừa
    //n!= 1*2*3*..*n
    // không có giai thừa âm
    // 0!=1!=1
    // đồ thị dốc tăng rất nhanh
    // 20 giai thừa vừa kiểu long
    // 21 giai thừa tràn kiểu long
    //quy ước tính giai thừa từ 1-20
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("invalid argment n between 0-20");
        if (n==0 ||n==1)
            return 1;// nhân đầu vào đặc biệt
        long product=1; //
        for (int i = 2; i <=n; i++) 
            product*=i;
        return product;
    }
    
}
