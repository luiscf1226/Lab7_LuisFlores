/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class error {
    float codigo;
    String descripcion;

    public error() {
    }

    public error(float codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "error{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
}
