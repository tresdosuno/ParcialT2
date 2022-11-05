
package edu.eci.pdsw.samples.services;
/**
 * @author 2106913
 */
public class ExcepcionServiciosSuscripciones extends Exception {

    public ExcepcionServiciosSuscripciones() {
    }

    public ExcepcionServiciosSuscripciones(String message) {
        super(message);
    }

    public ExcepcionServiciosSuscripciones(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionServiciosSuscripciones(Throwable cause) {
        super(cause);
    }
    
}
