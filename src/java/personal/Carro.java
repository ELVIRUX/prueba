package personal;

public class Carro {
    
    private String color;
    private int llantas;
    private String motor;

    public Carro() {
    }


    public Carro(String color, int llantas, String motor) {
        this.color = color;
        this.llantas = llantas;
        this.motor = motor;
    }
   
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}
