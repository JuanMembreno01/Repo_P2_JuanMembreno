/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repop2_juanmembreno;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author usuario
 */
public class hilo extends Thread {

    private JProgressBar barra;
    private superhackeo p;
    private hackeoregular a;
    int bandera;
    int riesgo;
    private boolean avanzar;
    private boolean vive;
    private int tiempo;

    public hilo(JProgressBar barra, superhackeo p, hackeoregular a) {
        this.barra = barra;
        this.a = a;
        this.p = p;
        avanzar = true;
        vive = true;
    }

    public hilo(JProgressBar barra, int bandera, int tiempo, int riesgo, superhackeo p, hackeoregular a) {
        this.barra = barra;
        this.bandera = bandera;
        this.tiempo = tiempo;
        this.riesgo = riesgo;
        this.a = a;
        this.p = p;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public superhackeo getP() {
        return p;
    }

    public void setP(superhackeo p) {
        this.p = p;
    }

    public hackeoregular getA() {
        return a;
    }

    public void setA(hackeoregular a) {
        this.a = a;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                if (bandera == 1) {
                    int r = (int) (Math.random() * 10 + 1);
                    if (r == riesgo) {
                        JOptionPane.showMessageDialog(null, "Mismo nivel de riesgo error de hackeo");
                        break;
                    } else if (bandera != 1) {
                        int r1 = (int) (Math.random() * 6 + 10);
                        if (r == riesgo) {
                            JOptionPane.showMessageDialog(null, "Mismo nivel de riesgo error de hackeo");
                            p.setHackeosfallidos(p.getHackeosfallidos() + 1);

                            break;
                        } else {
                            barra.setValue(barra.getValue() + 1);
                            if (barra.getValue() == tiempo * 10000) {
                                vive = false;
                            }
                        }
                    } //FIN IF

                    try {
                        Thread.sleep(tiempo * 1000);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }
    }
}
