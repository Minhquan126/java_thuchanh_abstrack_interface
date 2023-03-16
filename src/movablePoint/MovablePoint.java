package movablePoint;

public class MovablePoint extends Point {
    private float speedX;
    private float speedY;
    public MovablePoint(){}
    public MovablePoint(float x, float y, float speedX, float speedY) {
        super(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }
    public void setSpeed(float speedX,float speedY) {
this.speedX = speedX;
this.speedY = speedY;
    }
    public float[] getSpeed() {
        return new float[]{speedX,speedY};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "speedX=" + speedX +
                ", speedY=" + speedY +
                super.toString() +
                '}';
    }

    public MovablePoint move() {
        x += speedX;
        y += speedY;
        return this;
    }
}
