import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIConverter extends JFrame {
    Container contenedor;
    JTextField ingresoConversion;
    JLabel etiquetaPresentacionPrograma, unidadesConvertidas;
    FlowLayout layout;
    JButton button1;
    AdministradorDeAcciones admin;
    JComboBox listaDeItems1, listaDeItems2;
    String []  lista1 = {"Kilogramos", "Onzas", "Libras", "toneladas", };
    String []  lista2 = {"Gramos", "Onzas", "Libras"};

    public UIConverter(){
        super("Conversor de unidades");
        button1 = new JButton();
        listaDeItems1 = new JComboBox(lista1);
        listaDeItems2 = new JComboBox(lista2);
        ingresoConversion = new JTextField(15);
        admin = new AdministradorDeAcciones();
        contenedor = getContentPane();
        layout = new FlowLayout();
        unidadesConvertidas = new JLabel();
        contenedor.setLayout(layout);
        etiquetaPresentacionPrograma = new JLabel("Conversor de unidades");
        etiquetaPresentacionPrograma.setFont(new Font("Arial",Font.ITALIC,20));
        button1.setText("Convertir a ");

        contenedor.add(etiquetaPresentacionPrograma);
        contenedor.add(ingresoConversion);
        contenedor.add(listaDeItems1);
        contenedor.add(button1);
        contenedor.add(listaDeItems2);
        contenedor.add(unidadesConvertidas);

        button1.addActionListener(admin);

        setBounds(0,0,300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        UIConverter gui = new UIConverter();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class AdministradorDeAcciones implements ActionListener, ConvertirPeso {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1){

                if(listaDeItems1.getSelectedItem().equals(lista1[0])){
                    if(listaDeItems2.getSelectedItem().equals(lista2[0])){
                        kilogramoAGramo();
                    }else{
                        unidadesConvertidas.setText("No esta disponibla la conversion solicitada");
                    }

                }else if(listaDeItems1.getSelectedItem().equals(lista1[1])){
                    if(listaDeItems2.getSelectedItem().equals(lista2[0])){
                        onzaAGramo();
                    }else{
                        unidadesConvertidas.setText("No esta disponibla la conversion solicitada");
                    }

                }else if(listaDeItems1.getSelectedItem().equals(lista1[2])){
                    if(listaDeItems2.getSelectedItem().equals(lista2[1])){
                        libraAOnza();
                    }else{
                        unidadesConvertidas.setText("No esta disponibla la conversion solicitada");
                    }

                }else if(listaDeItems1.getSelectedItem().equals(lista1[3])){
                    if(listaDeItems2.getSelectedItem().equals(lista2[2])){
                        toneladaALibra();
                    }else{
                        unidadesConvertidas.setText("No esta disponibla la conversion solicitada");
                    }
                }
            }
        }

        @Override
        public void kilogramoAGramo() {
            double valorNumerico = Double.parseDouble(ingresoConversion.getText());
            valorNumerico = valorNumerico*1000;
            unidadesConvertidas.setText(valorNumerico + lista2[listaDeItems2.getSelectedIndex()]);
        }

        @Override
        public void onzaAGramo() {
            double valorNumerico = Double.parseDouble(ingresoConversion.getText());
            valorNumerico = valorNumerico*28.35;
            unidadesConvertidas.setText(valorNumerico + lista2[listaDeItems2.getSelectedIndex()]);
        }

        @Override
        public void libraAOnza() {
            double valorNumerico = Double.parseDouble(ingresoConversion.getText());
            valorNumerico = valorNumerico*16;
            unidadesConvertidas.setText(valorNumerico + lista2[listaDeItems2.getSelectedIndex()]);
        }

        @Override
        public void toneladaALibra() {
            double valorNumerico = Double.parseDouble(ingresoConversion.getText());
            valorNumerico = valorNumerico*2000;
            unidadesConvertidas.setText(valorNumerico + lista2[listaDeItems2.getSelectedIndex()]);
        }

    }
}
