/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Persona {
protected String nombre;
    protected String apellido;
    protected String dirección;
    protected int id;
    
    public Persona(String nombre, String apellido, String direccion, int id){
        this.nombre = nombre;
    
        this.apellido = apellido;
        this.dirección = direccion;
        this.id = id;
    }
    
    public Persona (){
    }
    
    public void mostrarDatos(){
        
        System.out.println(this.nombre +"\t\t\t"+ this.apellido + "\t\t\t\t\t" + this.dirección + "\t\t\t\t" + this.id + "\n\n");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}
        