package org.Stanchik.L;

public class DepositAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return bigDecimal;
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        throw new UnsupportedOperationException("Operation not supported");
    }
}

// данный класс нарушает принцип подстановки Барбары Лисков. то есть класс этот наследует методы от родительского класса,
// но один из методов не реализует,
// из-за чего приподстановке данного класса вместо родительского программа будет рабоать плохо,
// так как в лучшем случае не будет выполнять весь необходимый функционал