package org.Stanchik.Inheritance;

class DepositAccount<T, S> extends Account<T>{

    private S _name;
    S getName(){return _name;}
    DepositAccount(T id, S name){
        super(id);
        this._name=name;
    }
}
