/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilovecode.mathutil.main;

import com.ilovecode.mathutil.core.MathUtil;

/**
 *
 * @author Sau
 */
public class Main {
    //dùng để chạy
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa của mình tính có ổn hay không
        //ta phải đưa ra các tình huống sử dụng trong thực tế
        //ví dụ đưa vào -5, 1, 20, 21 tính ra bao nhiêu
        //test case tình huống hàm hay/class giả lập tình huống người dùng sử dụng
        //input: data đầu vào cụ thể nào đó
        //output: đầu ra ứng với xử lí của hàm/chức năng của app, 
        // vào để xử lí
        // kỳ vọng: mong hàm sẽ trả về vùng nào đó ứng với input ở trên
        //so sánh để xem kết quả có như kỳ vọng hay không
        long expected=120;//tạo kỳ vọng trả về 120 nếu tính 5!
        int n=5;//input
        long actual=MathUtil.getFactorial(n);
        System.out.println("5! =" +expected + " expected");
        System.out.println("5! =" + actual+" actual");
    }
    
}
