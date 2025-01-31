package ex_06_Assignments;

import java.util.Scanner;

public class ATMWithdrawal
{
    public static void main(String[] args) {
        final int  fixed_amount = 10000;
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the withdrawal_amount");
        int withdrawal_amount = SC.nextInt();
        if (withdrawal_amount <= 0 ){
            System.out.println("Invalid amount");
            return;
        }
        if (withdrawal_amount>=fixed_amount){
            System.out.println("insufficient amount");
            return;
        }
        else {
            System.out.println("withdraw success");
        }
        int balance = fixed_amount-withdrawal_amount;
        System.out.println("Remaining balance:" +balance );
    }
}
