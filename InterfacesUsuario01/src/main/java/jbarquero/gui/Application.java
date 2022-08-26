package jbarquero.gui;

import javax.swing.*;

//No se han seteado bien las coordenadas

public class Application {
    public static void main(String[] args) {   //psvm para crear la linea
    //System.out.println("Hello world");   //sout

        JFrame gui = new JFrame("Hello World");
        gui.setSize(1200, 1000);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // gui.setVisible(true);
        gui.setLayout(null);

        JLabel id_l = new JLabel("ID: ");
        id_l.setBounds(20, 10, 40, 30); //donde esta ubicado
        gui.add(id_l);

        JTextField id_t = new JTextField("");
        id_t.setBounds(60, 10, 150, 30);
        gui.add(id_t);


        JLabel name_l = new JLabel("Name: ");
        id_l.setBounds(20, 20, 40, 30); //donde esta ubicado
        gui.add(name_l);

        JTextField name_t = new JTextField("");
        id_t.setBounds(0, 20, 150, 30);
        gui.add(name_t);


        JRadioButton sexo_b = new JRadioButton("masculino");
        sexo_b.setBounds(280,200,100,30);
        gui.add(sexo_b);

        JRadioButton sexo_f = new JRadioButton("femenino");
        sexo_b.setBounds(120,300,100,30);
        gui.add(sexo_f);

        JComboBox<String> estado = new JComboBox<>(new String[]{"Soltero","Sasado"});
        estado.setBounds(60, 100, 100, 30);

        JButton guardar_b = new JButton("Guardar");  //components, composite
        guardar_b.setBounds(60, 100, 100, 30);
        gui.add(guardar_b);


        JCheckBox hobby_m =new JCheckBox("musica");
        hobby_m.setBounds(60, 100, 100, 30);
        gui.add(hobby_m);

        JCheckBox hobby_b =new JCheckBox("cine");
        hobby_b.setBounds(60, 100, 100, 30);
        gui.add(hobby_b);

        JCheckBox hobby_d =new JCheckBox("deporte");
        hobby_d.setBounds(60, 100, 100, 30);
        gui.add(hobby_d);

        gui.setVisible(true);
      //  System.out.println("Main termina");
    }

}

//JPanel gui = new JPanel();
//jf.setContentPane(gui);