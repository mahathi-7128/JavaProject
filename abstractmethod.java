package xyz;

abstract class main {
    abstract void Atm();
     public void Atm2() {
        System.out.println("without abstract atm");
    }
}

class B extends main {
    void Atm() {
        System.out.println("with abstract atm");
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        main b = new B(); 
        b.Atm(); 
        b.Atm2(); 
    }
}