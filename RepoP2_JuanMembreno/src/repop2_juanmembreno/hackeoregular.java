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
public class hackeoregular implements Serializable {

    private int hackeosexitoso;
    private int nivelderiesgo;
    private String codigo;
    private static final long SerialVersionUID = 668L;

    public hackeoregular() {
    }

    public hackeoregular(int hackeosexitoso, int nivelderiesgo, String codigo) {
        this.hackeosexitoso = hackeosexitoso;
        this.nivelderiesgo = nivelderiesgo;
        this.codigo = codigo;
    }

    public int getHackeosexitoso() {
        return hackeosexitoso;
    }

    public void setHackeosexitoso(int hackeosexitoso) {
        this.hackeosexitoso = hackeosexitoso;
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
        return "hackeoregular{" + "hackeosexitoso=" + hackeosexitoso + ", nivelderiesgo=" + nivelderiesgo + ", codigo=" + codigo + '}';
    }

}
