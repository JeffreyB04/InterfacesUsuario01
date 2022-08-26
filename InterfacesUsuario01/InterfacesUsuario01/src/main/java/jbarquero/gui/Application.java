package jbarquero.gui;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {   //psvm para crear la linea
        System.out.println("Hello world");   //sout

        JFrame gui = new JFrame("Hello World");
        gui.setSize(400, 200);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // gui.setVisible(true);
        gui.setLayout(null);

        JLabel id_l = new JLabel("ID: ");
        id_l.setBounds(20, 10, 40, 30); //donde esta ubicado
        gui.add(id_l);

        JTextField id_t = new JTextField("");
        id_t.setBounds(60, 10, 150, 30);
        gui.add(id_t);

        JButton guardar_b = new JButton("Guardar");  //components, composite
        guardar_b.setBounds(60, 100, 100, 30);
        gui.add(guardar_b);

        gui.setVisible(true);
        System.out.println("Main termina");
    }

}


