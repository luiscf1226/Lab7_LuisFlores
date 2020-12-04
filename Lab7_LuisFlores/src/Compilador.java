
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class Compilador implements Serializable {
    private static final long SerialVersionUID=777L;
    private String nombre;
    private String creador;
    private float lineas;
    private float lexico,sintatico,semantico,intermedio,optimizador,generador;
    
    private DefaultTableModel simbolos,error;

    public DefaultTableModel getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(DefaultTableModel simbolos) {
        this.simbolos = simbolos;
    }

    public DefaultTableModel getError() {
        return error;
    }

    public void setError(DefaultTableModel error) {
        this.error = error;
    }

    public Compilador(String nombre, String creador, float lineas, float lexico, float sintatico, float semantico, float intermedio, float optimizador, float generador, DefaultTableModel simbolos, DefaultTableModel error) {
        this.nombre = nombre;
        this.creador = creador;
        this.lineas = lineas;
        this.lexico = lexico;
        this.sintatico = sintatico;
        this.semantico = semantico;
        this.intermedio = intermedio;
        this.optimizador = optimizador;
        this.generador = generador;
        this.simbolos = simbolos;
        this.error = error;
    }

    public static long getSerialVersionUID() {
        return SerialVersionUID;
    }

   

    public Compilador(String nombre, String creador, float lineas, float lexico, float sintatico, float semantico, float intermedio, float optimizador, float generador) {
        this.nombre = nombre;
        this.creador = creador;
        this.lineas = lineas;
        this.lexico = lexico;
        this.sintatico = sintatico;
        this.semantico = semantico;
        this.intermedio = intermedio;
        this.optimizador = optimizador;
        this.generador = generador;
    }

    public float getGenerador() {
        return generador;
    }

    public void setGenerador(float generador) {
        this.generador = generador;
    }

 

    public Compilador() {
    }

    public Compilador(String nombre, String creador, float lineas, float lexico, float sintatico, float semantico, float intermedio, float optimizador) {
        this.nombre = nombre;
        this.creador = creador;
        this.lineas = lineas;
        this.lexico = lexico;
        this.sintatico = sintatico;
        this.semantico = semantico;
        this.intermedio = intermedio;
        this.optimizador = optimizador;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public float getLineas() {
        return lineas;
    }

    public void setLineas(float lineas) {
        this.lineas = lineas;
    }

    public float getLexico() {
        return lexico;
    }

    public void setLexico(float lexico) {
        this.lexico = lexico;
    }

    public float getSintatico() {
        return sintatico;
    }

    public void setSintatico(float sintatico) {
        this.sintatico = sintatico;
    }

    public float getSemantico() {
        return semantico;
    }

    public void setSemantico(float semantico) {
        this.semantico = semantico;
    }

    public float getIntermedio() {
        return intermedio;
    }

    public void setIntermedio(float intermedio) {
        this.intermedio = intermedio;
    }

    public float getOptimizador() {
        return optimizador;
    }

    public void setOptimizador(float optimizador) {
        this.optimizador = optimizador;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
