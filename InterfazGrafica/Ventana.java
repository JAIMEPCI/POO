package InterfazGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {
    JPanel panel;
    JButton boton1;
    public Ventana(){
        this.setTitle("AMONGUS");
        //this.setBounds(400,150,700,500);
        //this.setLocation(300,150);
        this.setLocationRelativeTo(null); //aparezca en la mitad //debiendo
        this.setSize(500,500);
        this.setMinimumSize(new Dimension(440,360)); //tamaño minimo para la ventana, dimension es una clase
        //this.setResizable(false); //se puede agrandar o hacer pequeña
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //se cierre el programa cuando cierre pestaña
        iniciarComponente();
    }
    private void crearListRaton(){
        MouseListener m1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {
                boton1.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                boton1.setBackground(Color.GRAY);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton1.setBackground(Color.GRAY);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton1.setBackground(Color.LIGHT_GRAY);
            }

        };
        boton1.addMouseListener(m1);
    }
    private void crearBotones(){
        boton1 = new JButton("Aceptar");
        boton1.setText("dame clik");
        //boton1.setEnabled(false);  //no funcione el boton
        boton1.setMnemonic('a');
        boton1.setBackground(Color.LIGHT_GRAY);
        boton1.setForeground(Color.magenta);
        boton1.setFont(new Font("times new roman",Font.ITALIC,15));
        boton1.setBounds(50,50,100,50);
        panel.add(boton1);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Que pensabas que pasaria?","sus", JOptionPane.QUESTION_MESSAGE);
            }
        };
        boton1.addActionListener(al);
    }
    private void crearRadioButton(){
        JRadioButton radb1 = new JRadioButton("Opcion A",true);
        radb1.setBounds(300,40,100,50);
        panel.add(radb1);

        JRadioButton radb2 = new JRadioButton("Opcion B",false);
        radb2.setBounds(300,100,100,50);
        panel.add(radb2);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radb1);
        grupo.add(radb2);
    }
    private void crearCheck(){
        JCheckBox ch1 = new JCheckBox("Primero",true);
        ch1.setBounds(150,50,100,50);
        panel.add(ch1);
    }
    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.green);
        this.getContentPane().add(panel);
    }
    private void crearTextF(){
        JTextField te1 = new JTextField("Looking kinda sus...");
        te1.setBounds(300,200,200,20);
        System.out.println(te1.getText());
        panel.add(te1);
    }
    private void crearAreaTexto(){
        JTextArea ta = new JTextArea("Texto inicial");
        ta.setBounds(300,300,150,200);
        ta.append("\nagrego mas");
        panel.add(ta);
        ta.setEditable(false);
    }
    private void crearEtiqueta(){
        JLabel etiqueta = new JLabel("holiwis amiguis");
        etiqueta.setText("mucho texto");
        etiqueta.setAlignmentX(SwingConstants.RIGHT); //debiendo
        etiqueta.setFont(new Font("comic sans",Font.BOLD,30));
        etiqueta.setBounds(10,10,400,20);
        etiqueta.setForeground(Color.white);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.DARK_GRAY);
        panel.add(etiqueta);

        JLabel etiima = new JLabel(new ImageIcon("gru.jpg"));
        ImageIcon imag = new ImageIcon("sus.jpg");
        etiima.setBounds(20,110,200,200);
        etiima.setIcon(new ImageIcon(imag.getImage().getScaledInstance(etiima.getWidth(),etiima.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiima);
    }
    private void crearListas(){
        String [] colores = {"Amarillo","Azul","Rojo"};
        JComboBox combo = new JComboBox(colores);
        combo.setBounds(20,350,100,30);
        combo.addItem("Morado");

        combo.setSelectedItem("Rojo");
        panel.add(combo);
        System.out.println(combo.getSelectedItem());
    }
    private void iniciarComponente(){
        crearPanel();
        crearEtiqueta();
        crearBotones();
        crearRadioButton();
        crearCheck();
        crearTextF();
        crearAreaTexto();
        crearListas();
        crearListRaton();
    }
}
