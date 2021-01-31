package com.company;

//описывает части поведение, когда не знаем реализацию
abstract strictfp public class Example {
    String s;
    abstract public void getS();
}

abstract class Car{
    int speed;
    abstract void run(); //абстрактный метод
    void stop(){
        speed=0;
    }

}

final class ferrary extends Car implements  Bounce{ //его уже нельзя будет наследовать

    private int i=5;//видит только этот класс
    protected int j=10;// видят все в пакете и наследники
    int k=7;// только в пакете
    public int p=3;// видят все


    @Override //переопределили
    void run(){
        speed=25;
    }

    @Override
    public void bounce() {
        speed++;
    }
}
