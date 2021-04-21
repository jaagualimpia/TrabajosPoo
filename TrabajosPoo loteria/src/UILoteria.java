import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UILoteria extends JFrame {
JButton [] botonesRifa = new JButton[20];
Container contenedor;
JButton botonJugar, botonlimpiar = new JButton();
JLabel [] identificadoresPremio = new JLabel[4] ;
JPanel panelBotonesUtiles, panelInfoRifa = new JPanel();
String [] listaPremios = {"Premio mayor", "Primer seco", "Segundo seco", "Tercer seco"};
AdministradorDeAcciones admin = new AdministradorDeAcciones();


    public UILoteria(){
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        botonJugar = new JButton();
        panelBotonesUtiles = new JPanel();
        botonJugar.setText("Jugar");
        botonlimpiar.setText("Limpiar");
        botonJugar.addActionListener(admin);
        botonlimpiar.addActionListener(admin);

        creadorPanelInfoRifa();
        actualizarPanelInformacion();


        panelBotonesUtiles.setLayout(new GridLayout(1,2));
        panelInfoRifa.setLayout(new GridLayout(4,6));
        panelBotonesUtiles.add(botonJugar);
        panelBotonesUtiles.add(botonlimpiar);
        contenedor.add(panelInfoRifa, BorderLayout.CENTER);
        contenedor.add(panelBotonesUtiles, BorderLayout.SOUTH);

        setMaximumSize(new Dimension(900, 400));
        setMinimumSize(new Dimension(900, 400));
        setVisible(true);
    }

    private class AdministradorDeAcciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonJugar){
                rellenadorBotonesRifa();
            }
            else if(e.getSource() == botonlimpiar){
                borradorBotonesRifa();
            }
        }
    }

    public static void main(String[] args) {
        UILoteria guiLoteria = new UILoteria();
        guiLoteria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void actualizarPanelInformacion(){
        for (int i = 0; i < identificadoresPremio.length; i++) {
            panelInfoRifa.add(identificadoresPremio[i]);
            for (int j = 0; j < 5; j++) {
                panelInfoRifa.add(botonesRifa[j+((i*5))]);
            }
        }
    }

    private void rellenadorBotonesRifa(){
        for (int i = 0; i < botonesRifa.length; i++) {
            this.botonesRifa[i].setText(((int) (Math.random()*100))+"");
        }
    }

    private void borradorBotonesRifa(){
        for (int i = 0; i < botonesRifa.length; i++) {
            this.botonesRifa[i].setText("");
        }
    }

    private void creadorPanelInfoRifa(){
        for (int i = 0; i < identificadoresPremio.length; i++) {
            this.identificadoresPremio[i] = new JLabel(listaPremios[i]);
        }
        for (int i = 0; i < botonesRifa.length; i++) {
            this.botonesRifa[i] = new JButton();
        }
    }
}
