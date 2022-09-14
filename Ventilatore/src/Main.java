public class Main {
    public static void main(String[] args) {
        var ventilatore = new Ventilatore(99);
        var telecomando = new Telecomando();

        telecomando.connect(ventilatore);

        telecomando.addLevel();
        System.out.println("Level: " + ventilatore.getLevel());
        System.out.println("Power: " + ventilatore.getPower());

        telecomando.addLevel();
        System.out.println("Level: " + ventilatore.getLevel());
        System.out.println("Power: " + ventilatore.getPower());

        telecomando.subLevel();
        System.out.println("Level: " +ventilatore.getLevel());
        System.out.println("Power: " + ventilatore.getPower());

        telecomando.changeIsMoving();
        System.out.println("Is moving: " + ventilatore.getIsMoving());
        
        telecomando.changeIsMoving();
        System.out.println("Is moving: " + ventilatore.getIsMoving());
    }
}