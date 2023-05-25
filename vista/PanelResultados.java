package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelResultados()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.cyan);

        //Crear y agregar area de texto Resultados
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,720,150);
        this.add(spResultado);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public void mostrarResultado(String msj)
    {
        //taResultado.append(msj + "\n");
        taResultado.setText(msj);
    }

    public void borrar() {
        taResultado.setText("");
        
    }
}