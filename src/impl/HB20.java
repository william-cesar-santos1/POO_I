package impl;

import inherits.Motor;

public class HB20 {

    public static long versionUID = 2L;

    // Atributos são as características do objeto
    private String cor;
    private String model;
    private int portAmount;
    private Motor motor;
    private float velocidadeAtual;

    public HB20(
            String model,
            int portAmount,
            Motor motor
    ) {
        this.model = model;
        this.portAmount = portAmount;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    public HB20(String cor, String model, int portAmount, Motor motor) {
        this.cor = cor;
        this.model = model;
        this.portAmount = portAmount;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPortAmount() {
        return portAmount;
    }

    public void setPortAmount(int portAmount) {
        this.portAmount = portAmount;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligar() {
        this.motor.setStart(true);
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += this.motor.produzirForca(1);
    }

    @Override
    public String toString() {
        return "impl.HB20{" +
                "cor='" + cor + '\'' +
                ", model='" + model + '\'' +
                ", portAmount=" + portAmount +
                ", motor=" + motor +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
