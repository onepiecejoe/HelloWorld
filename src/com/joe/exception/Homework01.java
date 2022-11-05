package com.joe.exception;

public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("您输入的参数个数不是2！");
            }
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = cal(num1, num2);
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("您输入的不是整数！");
        } catch (ArithmeticException e) {
            System.out.println("除0异常");
        }
    }





    public static int cal(int num1, int num2) {
        return num1 / num2;
    }
}
