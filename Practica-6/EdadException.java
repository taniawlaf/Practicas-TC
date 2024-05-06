public class EdadException extends Exception{
    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }

    public EdadException(int edad)throws EdadException{
        this.validarEdad(edad);
    }

    public void validarEdad(int edad)throws EdadException{
        if(!(edad >= 18 && edad <= 45)){
            //System.out.println("La edad capturada no pertenece al rango permitido (18 a 45 años), favor de capturar una edad dentro del rango")
            throw new EdadException("Error edad");
        }
    }
}