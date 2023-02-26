package org.example.ejs;

import java.util.HashMap;

public class EmpleadoHashTable {

    // Tablas internas de la tabla hash para cada campo de búsqueda
    private HashMap<String, Empleado> porNombre = new HashMap<>();
    private HashMap<Integer, Empleado> porNumeroEmpleado = new HashMap<>();
    private HashMap<Integer, Empleado> porNumeroSeguridadSocial = new HashMap<>();

    // Método para agregar un empleado a la tabla hash
    public void agregarEmpleado(Empleado empleado) {
        // Calcular el valor hash para cada campo de búsqueda
        int hashNombre = empleado.getNombre().hashCode();
        int hashNumeroEmpleado = Integer.hashCode(empleado.getNumeroEmpleado());
        int hashNumeroSeguridadSocial = Integer.hashCode(empleado.getNumeroSeguridadSocial());

        // Buscar en la tabla interna correspondiente utilizando el valor hash
        if (porNombre.containsKey(empleado.getNombre())) {
            porNombre.put(empleado.getNombre(), empleado);
        } else {
            porNombre.put(empleado.getNombre(), empleado);
        }

        if (porNumeroEmpleado.containsKey(empleado.getNumeroEmpleado())) {
            porNumeroEmpleado.put(empleado.getNumeroEmpleado(), empleado);
        } else {
            porNumeroEmpleado.put(empleado.getNumeroEmpleado(), empleado);
        }

        if (porNumeroSeguridadSocial.containsKey(empleado.getNumeroSeguridadSocial())) {
            porNumeroSeguridadSocial.put(empleado.getNumeroSeguridadSocial(), empleado);
        } else {
            porNumeroSeguridadSocial.put(empleado.getNumeroSeguridadSocial(), empleado);
        }
    }

    // Método para buscar un empleado por nombre
    public Empleado buscarPorNombre(String nombre) {
        if (porNombre.containsKey(nombre)) {
            return porNombre.get(nombre);
        } else {
            return null;
        }
    }

    // Método para buscar un empleado por número de empleado
    public Empleado buscarPorNumeroEmpleado(int numeroEmpleado) {
        if (porNumeroEmpleado.containsKey(numeroEmpleado)) {
            return porNumeroEmpleado.get(numeroEmpleado);
        } else {
            return null;
        }
    }

    // Método para buscar un empleado por número de seguridad social
    public Empleado buscarPorNumeroSeguridadSocial(int numeroSeguridadSocial) {
        if (porNumeroSeguridadSocial.containsKey(numeroSeguridadSocial)) {
            return porNumeroSeguridadSocial.get(numeroSeguridadSocial);
        } else {
            return null;
        }
    }
}
