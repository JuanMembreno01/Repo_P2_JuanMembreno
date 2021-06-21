/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repop2_juanmembreno;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class superhackeo implements  Serializable {
    private int hackeosfallidos;
    private int nivelderiesgo;
    private String codigo;
  private static final long SerialVersionUID = 669L;
   
    public superhackeo(int hackeosfallidos, int nivelderiesgo, String codigo) {
        this.hackeosfallidos = hackeosfallidos;
        this.nivelderiesgo = nivelderiesgo;
        this.codigo = codigo;
    }

    public int getHackeosfallidos() {
        return hackeosfallidos;
    }

    public void setHackeosfallidos(int hackeosfallidos) {
        this.hackeosfallidos = hackeosfallidos;
    }

    public int getNivelderiesgo() {
        return nivelderiesgo;
    }

    public void setNivelderiesgo(int nivelderiesgo) {
        this.nivelderiesgo = nivelderiesgo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "superhackeo{" + "hackeosfallidos=" + hackeosfallidos + ", nivelderiesgo=" + nivelderiesgo + ", codigo=" + codigo + '}';
    }
    
    }
