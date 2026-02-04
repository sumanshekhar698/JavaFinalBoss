package dev.codecounty.oops.abstraction.interfaces;

public interface InterfaceFirst {

    void call();
}

interface InterfaceSecond {
    void hang();
}

interface InterfaceFusion extends InterfaceFirst, InterfaceSecond {

    void ring();
}


class ClassA implements InterfaceFusion {


    @Override
    public void ring() {

    }

    @Override
    public void call() {

    }

    @Override
    public void hang() {

    }
}

abstract class ClassB implements InterfaceFusion {

    void text(){

    }

}

class ClassC extends ClassB{

    @Override
    public void ring() {

    }

    @Override
    public void call() {

    }

    @Override
    public void hang() {

    }
}