package S.O.L.I.D.PRINCIPLES.D.ependencyInversionPrinciple;

public class Window98Machine {
    private StandardKeyboard keyboard;
    private Monitor monitor;

    public void Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

    public Window98Machine(StandardKeyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
