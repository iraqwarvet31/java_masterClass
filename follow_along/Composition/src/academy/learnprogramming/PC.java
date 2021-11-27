package academy.learnprogramming;

public class PC {
    private Case theCase; // composition
    private Monitor monitor; // composition
    private Motherboard motherboard; // composition

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
