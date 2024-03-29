
package proyecto1;

	public class Personal {
	    //Atributos de la clase Personal
	     public String cedula;
	    public String nombre;
	    public String apellido;
	    public String telefono;
	    public String correo;
	    public String numCelular;	   
	//Creamos el constructor vacio
	    public Personal() {
	    }
	//Constructor para recibir parametros
	    public Personal(String cedula,String nombre, String
	     apellido, String telefono,  String correo, String
	     numCelular) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.telefono = telefono;    
	        this.correo = correo;
	        this.numCelular = numCelular;
	        this.cedula=cedula;
	     
	    }
	   //Metodos set y get para obtener y establecer los valores

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
	
	    // Metodo mostrarDatos
	    public String mostrarDatos() {
	        return ". "+ getNombre() + "     " + getApellido()+ "     " + getTelefono() + "     " + getCorreo()           + "     " + getNumCelular() ;
	    }
        }

