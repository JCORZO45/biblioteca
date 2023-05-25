package modelo; 

public class Libro{
    protected int edicion ;
    protected String nombreLibro; 
    protected String nombreAutor; 
    protected Boolean ediciondLujo;
    
    public Libro (int Edicion , String NombreLibro, String NombreAutor, Boolean EdicionLujo){
        this.edicion=Edicion;
        this.nombreAutor=NombreAutor;
        this.nombreLibro=NombreLibro;
        this.ediciondLujo=EdicionLujo;
    }
    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    public String getNombrelibro() {
        return nombreLibro;
    }
    public void setNombrelibro(String nombrelibro) {
        this.nombreLibro = nombrelibro;
    }
    public String getNombreautor() {
        return nombreAutor;
    }
    public void setNombreautor(String nombreautor) {
        this.nombreAutor = nombreautor;
    }
    public Boolean getEdiciondLujo() {
        return ediciondLujo;
    }
    public void setEdiciondLujo(Boolean ediciondLujo) {
        this.ediciondLujo = ediciondLujo;
    } 





}
