package modelo;

public class Libro
{  
    //Atributos
    protected String nombreLibro;
    protected String autor;
    protected String Edicion;
    protected Boolean eDLujo;

    //Constructor
    public Libro()
    {
        nombreLibro = "";
        autor = "";
        Edicion = "";
        eDLujo = false;
    }
    public Libro(String nombreLibro, String autor, String anioEdicion, Boolean eDLujo)
    {
        this.nombreLibro  = nombreLibro;
        this.autor = autor;
        this.Edicion = Edicion;
        this.eDLujo = false;
    }


    //Getters and setters
    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEdicion() {
        return Edicion;
    }
    public void setEdicion(String edicion) {
        Edicion = edicion;
    }
    public Boolean geteDLujo() {
        return eDLujo;
    }
    public void seteDLujo(Boolean eDLujo) {
        this.eDLujo = eDLujo;
    }
     

    //Metodos
    public String toString()
    {
        return "Nombre  del libro : " + nombreLibro + "\nAño de edicion: " + Edicion + "\nAutor del libro: " + autor + "\nEdicion de lujo: " + (eDLujo ? "Si" : "No");
    }








}
