public class Ventilatore {
    private int level = 0;
    private boolean isMoving = false;
    private final float power;

    public Ventilatore(float power) {
        this.power = power;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int newLevel) {
        if (newLevel <= 3 && newLevel >= 0){
            level = newLevel;
        }
    }
    public boolean getIsMoving() {
        return isMoving;
    }
    public void setIsMoving() {
        if(isMoving){
            isMoving = false;
        }else {
            isMoving = true;
        }
    }
    public float getPower() {
        return power * level / 3;
    }
}
