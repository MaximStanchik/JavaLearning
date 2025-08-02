package org.Stanchik.Polymorphism.StaticPolymorphism;

class  Bird  { //тут происходит перегрузка методов, потому что есть несколько методов с одним и тем же названием
    public  void  fly()  {
        System.out.println("The bird is flying.");
    }
    public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
    }
    public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
    }
}
