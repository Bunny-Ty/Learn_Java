package org.example.session3;

public class BreakLabel {

    public static void main (String[] args){

        // Khai bao bien boolean
        boolean t = true;

        // Nhan firstLabel
        first: {

            // Nhan secondLabel
            second: {

                // Nhan thirdLabel
                third:{
                    // In ra thong bao truoc khi break
                    System.out.println("Before the break statement.");
                }

                // Neu t la true
                if (t){
                    break second; // Thoat khoi khoi code nhan second - Tat ca code phia trong second se khong chay
                }

                // Dong nay se khong bao gio chay
                System.out.println("not run");
            }

            // Dong nay cung khong chay vi da break second
            System.out.println("not run");
        }
        // Dong nay chay vi no nam ngoai block second
        System.out.println("This is after second block.");
    }
}
