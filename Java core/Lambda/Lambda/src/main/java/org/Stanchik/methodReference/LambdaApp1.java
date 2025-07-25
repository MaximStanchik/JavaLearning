package org.Stanchik.methodReference;

interface Expression1{
    boolean isEqual(int n);
}

class ExpressionHelper1{

    boolean isEven(int n){

        return n%2 == 0;
    }
}

public class LambdaApp1 {
    public static void main(String[] args) {

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ExpressionHelper1 exprHelper = new ExpressionHelper1();
        System.out.println(sum(nums, exprHelper::isEven)); // 0
    }

    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}
