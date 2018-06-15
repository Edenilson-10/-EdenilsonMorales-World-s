/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Victor.Morales
 */
public abstract class RazaAbstract  extends ObjectFactory{
    
    private Edificacion edificacion;
    private Grupo grupo;
    private Vehiculo vehiculo;
    
    private String descripcion;

    /**
     * @return the edificacion
     */
    public Edificacion getEdificacion() {
        return edificacion;
    }

    /**
     * @param edificacion the edificacion to set
     */
    public void setEdificacion(Edificacion edificacion) {
        this.edificacion = edificacion;
    }

    /**
     * @return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
