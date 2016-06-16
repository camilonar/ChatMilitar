package Interface;

import Connection.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI extends javax.swing.JFrame {

    
    private Conexion conexion;
    private static String userName;
    private static String host;
    private static JTextArea texto;
    private JTextField mensaje;
    private JScrollPane jScrollPanelTexto;

    public static void main(String[] args) {
        host = JOptionPane.showInputDialog("Ingrese el host del chatServer", "localhost");
        userName = JOptionPane.showInputDialog("Ingrese su nombre de Usuario");
        if (host != null && userName != null && !userName.equals("")) {
            try {
                GUI inst = new GUI();
                inst.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }

    public GUI() throws MalformedURLException, RemoteException, NotBoundException {
        super();
        conexion = new Conexion();
        conexion.conectar(host, userName);
        initGUI();
    }

    private void initGUI() {
        try {
            {
                jScrollPanelTexto = new JScrollPane();
                getContentPane().add(jScrollPanelTexto);
                jScrollPanelTexto.setBounds(7, 7, 378, 203);
                jScrollPanelTexto.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                {
                    texto = new JTextArea();
                    texto.setLineWrap(true);
                    texto.setEditable(false);
                    jScrollPanelTexto.setViewportView(texto);
                }
            }
            {
                mensaje = new JTextField();
                getContentPane().add(mensaje);
                mensaje.setBounds(7, 217, 378, 42);
                mensaje.addKeyListener(new KeyAdapter() {
                    public void keyReleased(KeyEvent evt) {
                        MessageKeyPressed(evt);
                    }
                });
            }
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            getContentPane().setLayout(null);
            this.setTitle("MyRMIChat - " + userName);
            this.setResizable(false);
            pack();
            setSize(400, 300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showMensaje(String mensaje, String userName) {
        if (!userName.equals("")) {
            texto.append(userName + ": " + mensaje + "\n");
        } else {
            texto.append(mensaje + "\n");
        }
    }

    private void MessageKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !mensaje.getText().equals("")) {

            conexion.enviarMensaje(mensaje.getText(), userName);
            mensaje.setText("");

        }
    }
}
