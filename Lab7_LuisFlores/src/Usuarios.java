/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class  Usuarios extends Persona{
    float nota;
    Compilador c;

    public Usuarios() {
        super();
    }

    public Usuarios(float nota, Compilador c, String nombre, String apellido, String usuario, String contra) {
        super(nombre, apellido, usuario, contra);
        this.nota = nota;
        this.c = c;
    }

    public Usuarios(String nombre, String apellido, String usuario, String contra) {
        super(nombre, apellido, usuario, contra);
    }

    public Usuarios(Compilador c, String nombre, String apellido, String usuario, String contra) {
        super(nombre, apellido, usuario, contra);
        this.c = c;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Compilador getC() {
        return c;
    }

    public void setC(Compilador c) {
        this.c = c;
    }

    public Usuarios(Compilador c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString()+nota;
               
    }
    
}
