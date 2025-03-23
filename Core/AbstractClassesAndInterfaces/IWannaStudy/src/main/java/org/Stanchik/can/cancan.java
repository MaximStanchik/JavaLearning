package org.Stanchik.can;

public interface cancan {
    private void aha() {
        System.out.println("aha");
    };
    default void doHa() { //public
        System.out.println("doHa");
    };
    static void goHa() { //public
        System.out.println("goHa");
    };
    abstract void gogo(); //public
};
