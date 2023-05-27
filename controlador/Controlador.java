package controlador;

import modelo.Libro;

import vista.VentanaPrincipal;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
   
    private Libro mLibro;
    

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Libro pMLibro)
    {
        this.venPrin = pVenPrin;
        this.mLibro=pMLibro;
        
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nColeccion\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
   
  
   



        if(comando.equals("glibro")){
            mLibro.setNombreLibro(venPrin.miPanelEntradaDatos.getnombreLibro());
            mLibro.setAutor(venPrin.miPanelEntradaDatos.getautor());
            mLibro.setEdicion(venPrin.miPanelEntradaDatos.getedicion());
            mLibro.seteDLujo(venPrin.miPanelEntradaDatos.getDelujo());




            venPrin.miPanelResultados.mostrarResultado(mLibro.toString());

            

        
        }

    
        //Agregar vendedor
        if(comando.equals("reset"))
        {
            
            this.venPrin.miPanelEntradaDatos.borrar();;
            this.venPrin.miPanelResultados.borrar();;
    
        }
       


        //Salir
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(venPrin,"Has salido de la aplicacion");
            System.exit(0);
        }  
    }


}

