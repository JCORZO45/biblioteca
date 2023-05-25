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
   
    private Libro libro;
    

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Libro pPlan)
    {
        this.venPrin = pVenPrin;
        this.libro=pPlan;
        
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nTelefonia\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
  
   



        if(comando.equals("glibro"))

        {
        System.out.println("Hola");
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

