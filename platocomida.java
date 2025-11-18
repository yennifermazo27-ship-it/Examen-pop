
public class platocomida extends ItemMenu  {
    private boolean esvegetariano;

    public platocomida(String id, String nombre, double precio,boolean esvegetariano) {
        super(id, nombre, precio);

        this.esvegetariano = esvegetariano;
    }
    public boolean esvegetariano(){
        return esvegetariano;
    }

    public void setesvegetriano(boolean esvegetariano){

    this.esvegetariano= esvegetariano;
    }

    @Override
    public String obtenerDetalles(){
    return super.obtenerDetalles()+ "¿esvegetariano?" +(esvegetariano?"si":"no");

    }
    
    }

