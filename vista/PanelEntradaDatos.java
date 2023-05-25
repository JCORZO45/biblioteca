package vista;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbedicion;
    private JLabel lbedicionLujo;
    private JLabel lbnombreLibro;
    private JLabel lbImagen;
    private JCheckBox ckBoton;


    private JTextField tfedicion;
    private JLabel lblibreria;
    private ImageIcon iImagen;
    private JTextField tfautor;
    private JLabel lbautor;
    private JTextField tfnombreLibro;
   

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.cyan);

        //Crear y agregar etiqueta empleados
        lbedicion = new JLabel("Año de Edición: ");
        lbedicion.setBounds(10,130,120,20);
        lbedicion.setFont(new Font("Arial", Font.BOLD, 14));
        lbedicion.setForeground(Color.black);
        this.add(lbedicion);

        tfedicion= new JTextField();
        tfedicion.setBounds(160, 130, 100, 25);
        this.add(tfedicion);


        lbedicionLujo = new JLabel("Edición de lujo: ");
        lbedicionLujo.setBounds(10,170,120,20);
        lbedicionLujo.setFont(new Font("Arial", Font.BOLD, 14));
        lbedicionLujo.setForeground(Color.black);
        this.add(lbedicionLujo);

        ckBoton = new JCheckBox();
        ckBoton.setBounds(160, 170, 70, 30);
        this.add(ckBoton);

        // Creacion y adicion de etiqueta label lbRadio
        lblibreria = new JLabel("LIBRERIA");
        lblibreria.setFont(new Font("Arial", Font.BOLD, 25));
        lblibreria.setForeground(Color.black);
        lblibreria.setBounds(180, 20,400,20);
        this.add(lblibreria);
  
        // Creacion y adicion de caja de texto tfRadio
        lbnombreLibro = new JLabel("Nombre del libro: ");
        lbnombreLibro.setBounds(10, 70,180,20);
        lbnombreLibro.setFont(new Font("Arial", Font.BOLD, 14));
        lbnombreLibro.setForeground(Color.black);
        this.add(lbnombreLibro);
  
        // Creacion y adicion de caja de texto tfRadio
        tfnombreLibro= new JTextField();
        tfnombreLibro.setBounds(160, 70, 100, 25);
        this.add(tfnombreLibro);
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/logo_footer.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(450,40,300,150);
        add(lbImagen);

        lbautor = new JLabel("Autor: ");
        lbautor.setBounds(10, 100,100,20);
        lbautor.setFont(new Font("Arial", Font.BOLD, 14));
        lbautor.setForeground(Color.black);
        this.add(lbautor);
  
        // Creacion y adicion de caja de texto tfRadio
        tfautor = new JTextField();
        tfautor.setBounds(160, 100, 100, 25);
        this.add(tfautor);
        //Crear y agregar combo lista Empleados
    

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("José Fernando Corzo Cordero");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getnombreLibro ()
    {
        return tfnombreLibro.getText();
    }

    public String getautor()
    {
        return tfautor.getText();
    }

    public String getedicion ()
    {
        return tfedicion.getText();
    }


        public void borrar()
    {
        tfnombreLibro.setText(" ");
        tfautor.setText(" ");
        tfedicion.setText(" ");
       
    }
    public Boolean getDelujo(){
        return ckBoton.isSelected();
    }
    

    public void agregarOyentesBotones(Controlador controlador) {
    }
 
    

}
