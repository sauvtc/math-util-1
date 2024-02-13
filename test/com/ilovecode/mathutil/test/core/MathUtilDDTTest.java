/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.ilovecode.mathutil.test.core;

import com.ilovecode.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sau
 */
//câu lệnh này của junit báo hiệu rằng sẽ cần loop qua tập data để 
// lấy cặp data input/expected nhồi vào hàm test
@RunWith (value = Parameterized.class)
public class MathUtilDDTTest {
    // Hàm initData ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected/input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng của mãng để lấy ra từng cặp data input/expected
    //tên hàm không quan trọng, quan trọng là @
    public static Object[][] initData(){
        return new Integer[][]{ {0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,420}};
        }
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột vào biến tương ứng input, expected để lát hồi feed cho hàm
    @Parameterized.Parameter(value=0)//lấy n map với cột 0
    public int n; //biến nạp với value của cột 0 của mảng
    @Parameterized.Parameter(value=1) //lấy expected map với cột 1
    public long expected; //kiểu long vì giá trị  trả về của hàm getF() là long
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
    Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
//Để quá trình đóng gói khi junit còn màu đỏ phải thực hiện thao tác sau
// vào tab file/nbproject/build-impl.xml đến dòng 1204 <target depends="init,compile,test,-pre-pre-jar,-pre-jar,