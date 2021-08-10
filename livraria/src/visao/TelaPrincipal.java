package visao;

import modeloConnection.ConexaoDB;

public class TelaPrincipal extends javax.swing.JFrame
{

    ConexaoDB conecta = new ConexaoDB();

    public TelaPrincipal()
    {
        initComponents();
        conecta.conexao();
    }

    @SuppressWarnings ("unchecked")
    private void initComponents()
    {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternalFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonConsulta = new javax.swing.JButton();
        jButtonCadAluno = new javax.swing.JButton();
        jButtonCadLivros = new javax.swing.JButton();
        jButtonCadEmprestimo = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemLivros = new javax.swing.JMenuItem();
        jMenuItemEmprestimo = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemWelcome = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternalFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrame.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18));
        jLabel2.setText("Cadastros");
        jPanelInternalFrame.add(jLabel2);
        jLabel2.setBounds(20, 10, 110, 22);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18));
        jLabel3.setText("Consulta");
        jPanelInternalFrame.add(jLabel3);
        jLabel3.setBounds(20, 200, 110, 22);

        jButtonConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png")));
        jButtonConsulta.setToolTipText("Empréstimos de Livros");
        jPanelInternalFrame.add(jButtonConsulta);
        jButtonConsulta.setBounds(20, 230, 110, 130);

        jButtonCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Student.png")));
        jButtonCadAluno.setToolTipText("Alunos");
        jButtonCadAluno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCadAlunoActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButtonCadAluno);
        jButtonCadAluno.setBounds(20, 40, 140, 140);

        jButtonCadLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png")));
        jButtonCadLivros.setToolTipText("Livros");
        jButtonCadLivros.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCadLivrosActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButtonCadLivros);
        jButtonCadLivros.setBounds(160, 40, 140, 140);

        jButtonCadEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/scholarship.png")));
        jButtonCadEmprestimo.setToolTipText("Empréstimos");
        jPanelInternalFrame.add(jButtonCadEmprestimo);
        jButtonCadEmprestimo.setBounds(300, 40, 140, 140);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png")));
        jLabelPainelFundo.setMaximumSize(new java.awt.Dimension(512, 512));
        jLabelPainelFundo.setMinimumSize(new java.awt.Dimension(512, 512));
        jLabelPainelFundo.setPreferredSize(new java.awt.Dimension(512, 512));
        jPanelInternalFrame.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, -10, 980, 400);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternalFrame);
        jPanelInternalFrame.setBounds(0, 60, 980, 450);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18));
        jLabel1.setText("Sistema de Gerenciamento de Livraria");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 400, 40);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png")));
        jButtonFechar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(940, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 50, 990, 550);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg")));
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 980, 530);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadAluno.setText("Alunos");
        jMenuItemCadAluno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemCadAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadAluno);

        jMenuItemLivros.setText("Livros");
        jMenuCadastro.add(jMenuItemLivros);

        jMenuItemEmprestimo.setText("Empréstimos");
        jMenuCadastro.add(jMenuItemEmprestimo);

        jMenuBar1.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemWelcome.setText("Tela Bem-Vindo");
        jMenuItemWelcome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemWelcomeActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemWelcome);

        jMenuBar1.add(jMenuFerramentas);

        jMenuRelatorio.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorio);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(993, 582));
        setLocationRelativeTo(null);
    }

    private void jButtonCadLivrosActionPerformed(java.awt.event.ActionEvent evt)
    {
    }

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt)
    {
        jInternalFrameBemVindo.dispose();
    }

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt)
    {
        conecta.desconecta();
        System.exit(0);
    }

    private void jMenuItemWelcomeActionPerformed(java.awt.event.ActionEvent evt)
    {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }

    private void jMenuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt)
    {
        FormAluno tela = new FormAluno();
        tela.setVisible(true);
    }

    private void jButtonCadAlunoActionPerformed(java.awt.event.ActionEvent evt)
    {
        FormAluno tela = new FormAluno();
        tela.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonCadAluno;
    private javax.swing.JButton jButtonCadEmprestimo;
    private javax.swing.JButton jButtonCadLivros;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemEmprestimo;
    private javax.swing.JMenuItem jMenuItemLivros;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemWelcome;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternalFrame;
}
