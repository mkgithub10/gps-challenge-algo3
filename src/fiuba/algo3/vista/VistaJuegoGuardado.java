package fiuba.algo3.vista;


import javax.swing.*;
import java.awt.*;

public class VistaJuegoGuardado {

    public VistaJuegoGuardado() {
        {

            JDialog unDialog = new JDialog();
            unDialog.setBounds(440,50,400,120);
            unDialog.setLayout(null);
            unDialog.setModal(true);
            unDialog.setDefaultCloseOperation(unDialog.DISPOSE_ON_CLOSE);

            JLabel labelMensaje1 = new JLabel();
            labelMensaje1.setText("La partida fue guardada.");
            labelMensaje1.setForeground(new Color(197,0, 23));
            labelMensaje1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
            labelMensaje1.setBounds(10,0,400,30);
            labelMensaje1.setVisible(true);

            JLabel labelMensaje2 = new JLabel();
            labelMensaje2.setText("Para seguir jugando, quitar pausa");
            labelMensaje2.setForeground(new Color(197,0, 23));
            labelMensaje2.setFont(new Font(Font.SERIF, Font.BOLD, 20));
            labelMensaje2.setBounds(10,30,400,30);
            labelMensaje2.setVisible(true);

            JLabel labelMensaje3 = new JLabel();
            labelMensaje3.setText("Cerrar para continuar");
            labelMensaje3.setForeground(new Color(197,0, 23));
            labelMensaje3.setFont(new Font(Font.SERIF, Font.BOLD, 10));
            labelMensaje3.setBounds(10,60,400,30);
            labelMensaje3.setVisible(true);

            unDialog.add(labelMensaje1);
            unDialog.add(labelMensaje2);
            unDialog.add(labelMensaje3);

            unDialog.setVisible(true);

        }
    }
}
