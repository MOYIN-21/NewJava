package S.O.L.I.D.PRINCIPLES.L.iskovPrinciple;

public class ElectricCar implements Car{
    public void turnOnEngine(){
        throw new AssertionError("I dont have an engine");
    }

    @Override
    public void accelerate() {
    }
}
