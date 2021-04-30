/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_edgarmembreño;

/**
 *
 * @author edgarmembreno
 */
public class Datos {

    private String modelo;
    private int serie;
    private int capacidad;
    private int tama;
    private boolean teclado;
    private String procesador;
    private String graphic;
    private String so;
    private int tf;
    private int mah;
    private int duracion;

    public Datos() {

    }

    public Datos(String M, int S, int C, int T, boolean tec, String proc, String gra, String sis, int tiempo, int bat, int dura) {
        this.modelo = M;
        this.serie = S;
        this.capacidad = C;
        this.tama = T;
        this.teclado = tec;
        this.procesador = proc;
        this.graphic = gra;
        this.so = sis;
        this.tf = tiempo;
        this.mah = bat;
        this.duracion = dura;

    }

    public void setModelo(String M) {
        this.modelo = M;
    }

    public String getModelo() {

        return modelo;
    }

    public void setSerie(int S) {
        this.serie = S;

    }

    public int getSerie() {
        return serie;
    }

    public void setCapacidad(int C) {
        this.capacidad = C;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTama(int T) {
        this.tama = T;

    }

    public int getTama() {
        return tama;
    }

    public void setTeclado(boolean tec) {
        this.teclado = tec;
    }

    public boolean getTeclado() {
        return teclado;
    }

    public void setProcesador(String proc) {
        this.procesador = proc;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setTarjetaG(String gra) {
        this.graphic = gra;
    }

    public String getTarjetaG() {
        return graphic;
    }

    public void setSistemaO(String sis) {
        this.so = sis;
    }

    public String getSistemaO() {
        return so;
    }

    public void setTiempoFabri(int tiempo) {
        this.tf = tiempo;
    }

    public int getTiempoFabri() {
        return tf;
    }

    public void setBateria(int bat) {
        this.mah = bat;
    }

    public int getBateria() {
        return mah;

    }

    public void setDuracion(int dura) {
        this.duracion = dura;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " Serie: " + serie + " Capacidad : " + capacidad+ "GB" + "Pantalla: " + "Teclado : " + teclado + " Procesador: " + procesador + " Tarjeta Grafica: "
                + graphic + " Sistema Operativo : " + so + "Tiempo de fabricacion: " + tf + " Bateria: " + mah+ "Map"+ " Duracion de bateria : " + duracion+ "Hr";
    }

}
