
package proyecto1;

public  class Empleado extends Personal {
    //Atributos de la clase empleado
    public double sueldo;
    public String cargo;
//Constructor Vacio
    public Empleado() {
    }
//Cosntructor q recibe parametros
    public Empleado(double sueldo, String cargo, String cedula, String nombre, String apellido, String telefono, String correo, String numCelular) {
        super(cedula, nombre, apellido, telefono, correo, numCelular);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
//Metodos especiales set y get para obetener y establecer 
    public double getSueldo() {
        return sueldo;
    }

    public void setSalario(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   
    public double Sueldo() {
        return getSueldo();
    }
    @Override
    //Metodo que hereda de la clase padre 
     public String mostrarDatos(){
        String ms=super.mostrarDatos();
        return ms +getCargo()+" "+getSueldo();
    }
}
