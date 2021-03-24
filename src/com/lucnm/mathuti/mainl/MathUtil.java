/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucnm.mathuti.mainl;

import com.lucnm.mathutil.MathUtility;

/**
 *
 * @author admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        long excepted = 120;
        long actual = MathUtility.getFactorial(n);
        System.err.println("5! execepted: " + excepted + "; actual: " + actual);
        
        n = 0;
        excepted = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("0! execepted: " + excepted + "; actual; " + actual);
    }
    
}
//VIET CODE XONG THI PHAI TEST CODE - NGUIYEN TAC PHAI THEO
//TEST NGAY TRONG HAM, TUNG CLASS TRUOC KHI PHAI RAP CHNG VOI CAC CLASS KHAC
//TEST NGAY KHI XONG HAM, XONG CLASS
//DUOC GOI LA TEST MUC DO 1;
//LAM SAO DE TEST . CO NHIEU CACH
//1. Cach 1: sout ham() de in ra ket qua xu li cua ham
//2. Cach 2: JoptionFane de popup len ket qua xu li cua ham (J Desktop)
//3. cach 3: Ghi ra LOG file, ra 1 trang web (JW)
//dung: tuc la ham chay ra 1 gia tri - ACTUAL VALUE
//                      va tha thay ACTUAL VALUE khop, bang voi cai gia
//tri nma ta mong doi, ta thinh truoc = tay, goi la EXCEPTED VALUE
//vi du 5! thi ta hy vong expected ham tra ve 120
//   nhung khon nan thay, ham tra ve dung 120 - actual
//ham chay dung cho 5!

//* sai: tui test 6!, expected = 720, khon nan thay; chay ra actual = 120
//ham xu li sai


//cach 4: may oi so sanh va ket luon giup tao luon di 
//con nguoi khong can nhin ket qua tra ve de luan dung sai
//may se lo cho
//neu tat ca tinh huong chay ham dung -> ham dung -> mau xanh
//hau het tat ca tinh huong chay dung; 1 cai xanh -> ham sai -> mau do


// do: chi can 1 thang sai
//xanh: tat ca phai dung

//muon lam dieu nay tat can thu vien phu tro giup cho java xanh do
//java: JUnit; testNG
//C#  : NUnit, xUnit, MSTest
//PHP: PHPUnit