/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ilovecode.mathutil.test.core;

import com.ilovecode.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Test;
import org.junit.Assert;




/**
 *
 * @author Sau
 */
public class MathUtilTest {
    
   
        /*unit test: Developer phải có trách nhiệm đảm bảo chất lượng của các hàm, các class do mình viết ra 
hàm nhận đầu vào, xử lý, ra kết quả AcTual khới với expected
Đảm bảo chất lượng,code= cách
- 1 kỹ thuật thủ công: main(), log file, pop-up, window form, web page, dùng mắt luận đúng sai trên nhiều case - tình huống sài hàm
- 2 kỹ thuật tự động: test automation/ viết code test để test code chính, xài dùng một framework/bộ thư viện viết đoạn code ngắn gọi hàm cần test,
viết code này cho các case xài hàm tình huống xài hàm
sau đó kết luận chug cho mọi case 1 các tự động
mắt lúc này chỉ nhìn 2 màu xanh đỏ cho tất cả các cases
        viết code để test code
*/
        
    //đây là class sẽ sử dụng các hàm của thư viện/framewwork JUnit
    // để kiểm thử/kiểm tra code chính - hàm tínhgiathua() bên class core.MathUtil
    //viết code để test code chính bên kia!!
    //@test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //phải có @test thì hàm phía dưới nó mới chạy
    //có nhiều @test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    //Có nhiều quy tắt đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử 
    //tình huống sài hàm theo kiểu thành công và thất bại!!
    // ta sẽ sài hàm kiểu well- đưa 5!, 6!, hok chơi -5!, 30!
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n=0;//test thử tình huống tử tế đầu vào
        long expected=1;// giá trị mong đợi )!=1
        //long actual=; // gọi hàm cần test bên core/app chinh/core chinh
        long actual=MathUtil.getFactorial(n);
        //so sánh hai giá trị nào đó có giống nhau ko, nếu giống thì màu xanh, nếu không giống thì trả về màu đỏ
        Assert.assertEquals(expected, actual);
        // gộp thêm vài case thành công/đưa dầu vào ngon!!!
        Assert.assertEquals(1,MathUtil.getFactorial(1));// mong muốn 1!=1
        Assert.assertEquals(2,MathUtil.getFactorial(2));// mong muốn 2!=2
        Assert.assertEquals(6,MathUtil.getFactorial(3));// mong muốn 3!=6
        Assert.assertEquals(120,MathUtil.getFactorial(5));// mong muốn 5!=120
        Assert.assertEquals(720,MathUtil.getFactorial(6));// mong muốn 6!=720
    }
    // hàm getF() ta thiết kế có 2 tình huống xử lí 
    // 1. Đưa data tử tế trong [0..20] --> tính đúng dược n! - done
    // 2. Đưa dât vào không đúng ví dụ như số âm, ngoài 20 -->thì thiết kế của hàm là ném ra ngoại lại
    // kỳ vọng ngoại lệ xuất hiện khi n<0 hoặc n>20
    // rất mong ngoại lệ xuất hiện
    // nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ra ngoại lệ
    // hàm chạy đúng như thiết kế --> xanh phải xuất hiện
    //nếu hàm nhận vào n<0 hoặc n>20 và hàm không ném ra ngoại lệ
    // hàm chạy xai thiết kế --> màu đỏ phải xuất hiện
    // Test case:
    // input: -5
    // expected: illegalArgumentExpection xuất hiện
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    // là những thứ không thể đo lường so sánh theo kiểu value
    // mà chỉ có thể đo lường - cách chúng có xuất hiện hay không
    //assertEqual() ko dùng để so sánh 2 ngoại lệ
    //assertEqual() là bằng nhau về giá trị hay không
    // Hàm có ném ngoại lệ nhưng ngoại lệ không như kỳ vọng nên ra màu đỏ
    //@Test (expected=NumberFormatException.class)//kỳ vọng khi chạy ra ngoai lệ có tên là numberFormat
    //public void testGetFactorialGivenWrongArgumentReturnsThrowException(){
          //MathUtil.getFactorial(-5);//hàm @test chạy, hay hàm getF() chạy
          // sẽ ném ra ngoại lệ NumberFormat..
   // }
    @Test (expected=IllegalArgumentException.class)//kỳ vọng khi chạy ra ngoai lệ có tên là numberFormat
    public void testGetFactorialGivenWrongArgumentReturnsThrowException(){
          MathUtil.getFactorial(-5);//hàm @test chạy, hay hàm getF() chạy
          // sẽ ném ra ngoại lệ NumberFormat..
    }
    //cách khác để bắt ngoại lệ xuất hiện
    // liên quan đến biểu thức lamda expresion
    //xai lamda để bắt ngoại lê tự nhiên hơn
    // Test case: hàm sẽ ném về ngoại lệ nếu đưa và 21
    @Test//kỳ vọng khi chạy ra ngoai lệ có tên là numberFormat
    public void testGetFactorialGivenWrongArgumentReturnsThrowExceptionLambdaVersion(){
          //Assert.assertThrows(expectedThrowable: loại ngoại lệ muốn so sánh, runnable: đoạn code chạy muốn văng ra ngoại lệ đó)
          Assert.assertThrows(IllegalArgumentException.class, ()-> MathUtil.getFactorial(21));
    }
    // Bắt ngoại lệ bình thường xem hàm có ném ra ngoại lệ hay không khi n ca chớn
    // có ném tức chạy đúng thiết kế, chủ động kiểm soát ngoai lệ
      @Test//kỳ vọng khi chạy ra ngoai lệ có tên là numberFormat
    public void testGetFactorialGivenWrongArgumentReturnsThrowExceptionTrycatch(){
          //Assert.assertThrows(expectedThrowable: loại ngoại lệ muốn so sánh, runnable: đoạn code chạy muốn văng ra ngoại lệ đó)
          // chủ động kiểm soát ngoại lệ, nhưng không chắc ngoại lệ của mình có ngoại lệ
          try {
              MathUtil.getFactorial(21);
          } catch (Exception e) {
              //Bắt try catch là Junit sẽ xanh vì do đã chủ động kiểm soát ngoại lệ
              // nhưng không chắc ngoại lệ mình cần có xuất hiện hay không??
              //có đoạn code kiểm soát ngoại lệ IllegalArgumentException xh
              Assert.assertEquals("invalid argment n between 0-20", e.getMessage());
          }
          
    }
}
