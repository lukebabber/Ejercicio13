/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package máquinaexpendedoraUnderwoodLuke2223;

/**
 *
 * @author efech
 */

public class MáquinaExpendedoraUnderwoodLuke2223 {// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precioMaximoUnderwoodLuke;//precio máximo que puede tener un snack

    /*Constructor por defecto*/
    public MáquinaExpendedoraUnderwoodLuke2223() {
    
    }
    
    
     /*Constructor por parámetros*/
    public MáquinaExpendedoraUnderwoodLuke2223(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precioMaximoUnderwoodLuke = precio_max;
    }
    
    /*Método que devuelve el número de snack que tiene la máquina*/
    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada snack*/
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
     /*Método que permite modificar el número de snack dsiponbles de la máquina*/
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }
    
     /*Método que permite aumentar el precio de venta, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecioMaximoUnderwoodLuke() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
    /*Método que permite obtener un snack si se tiene suficiente dinero y hay 
suficientes unidades en la máquina*/
    public void sacarsnack(int unidades, double dinero, String regaloUnderwoodLuke2223) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioMaximoUnderwoodLuke
     */
    public double getPrecioMaximoUnderwoodLuke() {
        return precioMaximoUnderwoodLuke;
    }

    /**
     * @param precioMaximoUnderwoodLuke the precioMaximoUnderwoodLuke to set
     */
    public void setPrecioMaximoUnderwoodLuke(double precioMaximoUnderwoodLuke) {
        this.precioMaximoUnderwoodLuke = precioMaximoUnderwoodLuke;
    }

}
