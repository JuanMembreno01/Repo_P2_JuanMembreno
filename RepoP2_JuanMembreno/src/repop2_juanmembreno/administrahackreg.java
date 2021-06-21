/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repop2_juanmembreno;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class administrahackreg {
         private ArrayList<hackeoregular> listahackeoregular = new ArrayList();
    private File archivo = null;

    public administrahackreg(String path) {
        archivo = new File(path);
    }

    public ArrayList<hackeoregular> gethackeoregular() {
        return listahackeoregular;
    }

    public void sethackeoregular(ArrayList<hackeoregular> listahackeoregular) {
        this.listahackeoregular = listahackeoregular;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listahackeoregular=" + listahackeoregular;
    }

    //extra mutador
    public void setPersona(hackeoregular p) {
        this.listahackeoregular.add(p);
    }

    public void cargarArchivo() {
        try {            
            listahackeoregular = new ArrayList();
            hackeoregular temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (hackeoregular) objeto.readObject()) != null) {
                        listahackeoregular.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (hackeoregular t : listahackeoregular) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
