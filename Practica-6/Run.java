public class Run{
    public static void main(String[] args){
        int edad = 16;
        try{
            EdadException edadEx = new EdadException();
            edadEx.validarEdad(edad);
        }catch(EdadException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}