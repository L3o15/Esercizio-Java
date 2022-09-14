public class Telecomando {

    Ventilatore ventilatore;
    public void connect(Ventilatore v){
        ventilatore = v;
    }

    public void addLevel(){
        ventilatore.setLevel(ventilatore.getLevel() + 1);
    }

    public void subLevel(){
        ventilatore.setLevel(ventilatore.getLevel() - 1);
    }

    public void changeIsMoving(){
        ventilatore.setIsMoving();
    }
}
