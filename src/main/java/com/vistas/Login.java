package com.vistas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Login extends JFrame {

    private JPanel contentPane, topBarPane;
    private JTextField textField1, textField2;
    private JLabel label1, label2, label3, label4;
    private JButton button1;
    private JSeparator separator1, separator2;

    public Login() {
        initComponents();
    }

    private void initComponents() {

        // Configuraciones del frame
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(400, 500);
        setLayout(new BorderLayout());

        // Inicializar componentes
        contentPane = new JPanel();
        topBarPane = new JPanel(new BorderLayout());
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel("INICIAR");
        label2 = new JLabel("user");
        label3 = new JLabel("password");
        label4 = new JLabel("X");
        button1 = new JButton("Entrar");
        separator1 = new JSeparator();
        separator2 = new JSeparator();

        // Configurar barra de arrastre
        topBarPane.setBackground(Color.BLACK);
        topBarPane.setPreferredSize(new Dimension(getWidth(), 30));

        label4.setForeground(Color.WHITE);
        label4.setPreferredSize(new Dimension(40, 30));
        label4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        topBarPane.add(label4, BorderLayout.EAST);

        // Configurar el panel con fondo blanco y BoxLayout vertical
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setBorder(new EmptyBorder(40,40,40,40));
        contentPane.setBackground(Color.WHITE);

        // Centrar textos
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Fuentes de los textos
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label4.setFont(new Font("Arial", Font.BOLD, 16));

        // Configuraciones de los campos de texto
        textField1.setBorder(null);
        textField2.setBorder(null);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField2.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setMaximumSize(new Dimension(Short.MAX_VALUE, 25));
        textField2.setMaximumSize(new Dimension(Short.MAX_VALUE, 25));

        // Posicion de los componentes en el panel
        contentPane.add(Box.createRigidArea(new Dimension(0, 50)));
        contentPane.add(label1);
        contentPane.add(Box.createRigidArea(new Dimension(0, 70)));
        contentPane.add(label2);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(textField1);
        contentPane.add(separator1);
        contentPane.add(Box.createRigidArea(new Dimension(0, 15)));
        contentPane.add(label3);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(textField2);
        contentPane.add(separator2);
        contentPane.add(Box.createRigidArea(new Dimension(0, 25)));
        contentPane.add(button1);
        contentPane.add(Box.createRigidArea(new Dimension(0, 30)));

        // Configuraciones finales para el renderizado
        add(topBarPane, BorderLayout.NORTH);
        add(contentPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
