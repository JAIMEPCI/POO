package InterfazGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Jueguito extends JFrame {
    JLabel imagen = new JLabel();
    JPanel panel;

    private void iniciarComponente() {
        crearPanel();
        crearImagen();
        imagenMuevase();
    }

    public Jueguito() {
        this.setTitle("RUN!");
        this.setBounds(100, 100, 1200, 550);
        this.setResizable(false);
        this.setEnabled(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponente();
    }

    private void crearImagen() {
        ImageIcon a  = new ImageIcon("smirkwguy.jpg");
        imagen.setIcon(new ImageIcon(a.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        imagen.setBounds(100,100,100,100);
        panel.add(imagen);
    }
    private void imagenMuevase(){
        MouseMotionListener m = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }
            @Override
            public void mouseMoved(MouseEvent e) {
                imagen.setLocation(e.getX()+50,e.getY()-50);
            }
        };
        panel.addMouseMotionListener(m);
    }
    private void crearPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);
        this.getContentPane().add(panel);
    }
}
