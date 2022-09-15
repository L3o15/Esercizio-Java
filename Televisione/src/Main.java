public class Main {
    public static void main(String[] args) {
        var televisore = new Televisore(70,"nero");
        System.out.println("Pollici: " + televisore.getPollici());
        System.out.println("Colore: " + televisore.getColore());
        televisore.accendi();
        System.out.println("Acceso: " + televisore.isAcceso());
        televisore.accendi();
        System.out.println("Acceso: " + televisore.isAcceso());
        televisore.addCanale();
        System.out.println("Canale: " + televisore.getCanale());
        televisore.subCanale();
        System.out.println("Canale: " + televisore.getCanale());
        televisore.subLuminosita();
        System.out.println("Luminosità: " + televisore.getLuminosita());
        televisore.addLuminosita();
        System.out.println("Luminosità: " + televisore.getLuminosita());
        televisore.subVolume();
        System.out.println("Volume: " + televisore.getVolume());
        televisore.addVolume();
        System.out.println("Volume: " + televisore.getVolume());
    }
}