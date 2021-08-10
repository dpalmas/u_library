package visao;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame
{
    public TelaLogin()
    {
        initComponents();
    }

    @SuppressWarnings ("unchecked")
    private void initComponents()
    {
        jLabel1 = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonAcessar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 375));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18));
        jLabel1.setText("Livraria Universitária");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 70, 220, 30);

        jLabelSenha.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(150, 180, 70, 22);

        jLabelUsuario.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(150, 140, 80, 20);

        jButtonSair.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(360, 210, 110, 50);

        jButtonAcessar.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(230, 210, 110, 50);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(230, 130, 240, 34);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(230, 170, 240, 34);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png")));
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(10, 120, 140, 150);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.png")));
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 480, 375);

        setSize(new java.awt.Dimension(479, 405));
        setLocationRelativeTo(null);
    }

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (jTextFieldUsuario.getText().equals("admin") && jPasswordFieldSenha.getText().equals("livraria"))
        {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos!");
        }
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.exit(0);
    }

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt)
    {
    }

    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
}
