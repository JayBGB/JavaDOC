package com.jay.partes;


public class Monitor {

    // ATTRIBUTES

    private float pulgadas;


    // CONSTRUCTORS

    /**
     *
     * @param pulgadas
     */
    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Monitor (){}

    // SETTERS & GETTERS


    /**
     *
     * @param pulgadas
     */
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    /**
     *
     * @return pulgadas
     */
    public float getPulgadas() {
        return pulgadas;
    }

    //TOSTRING

    /**
     *
     * @return pulgadas del monitor
     */
    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }





}
