package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConnection.ConexaoDB;
import modeloDao.DaoAluno;
import modeloBeans.Aluno;

public class FormAluno extends javax.swing.JFrame
{
    Aluno modelo = new Aluno();
    DaoAluno control = new DaoAluno();
    ConexaoDB conexao = new ConexaoDB();
    Integer flag = 0;

    public FormAluno()
    {
        initComponents();
        preencherTabela("select * from Alunos order by Nome");
    }

    @SuppressWarnings ("unchecked")
    private void initComponents()
    {
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCurso = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRA = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jLabel2.setText("Cod RA:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jLabel4.setText("Curso:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jLabel5.setText("Estado:");

        jFormattedTextFieldCurso.setEnabled(false);
        jFormattedTextFieldCurso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jFormattedTextFieldCursoActionPerformed(evt);
            }
        });

        jFormattedTextFieldRA.setEnabled(false);
        jFormattedTextFieldRA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jFormattedTextFieldRAActionPerformed(evt);
            }
        });

        jFormattedTextFieldNome.setEnabled(false);
        jFormattedTextFieldNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jFormattedTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxEstado.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
        { "Ativo", "Inativo", " " }));
        jComboBoxEstado.setEnabled(false);

        jButtonNovo.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]
                {
                        {},
                        {},
                        {},
                        {}
                },
                new String[] {

                }));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Noto Sans", 0, 18));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 16));
        jLabel6.setText("ID:");

        jTextFieldID.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jFormattedTextFieldCurso)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jFormattedTextFieldNome)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jFormattedTextFieldRA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                                                .addGap(96, 96, 96)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jFormattedTextFieldRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel2))
                                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jFormattedTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(8, 8, 8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonSalvar)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButtonCancelar)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonEditar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonExcluir))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jFormattedTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonPesquisar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18));
        jLabel1.setText("Cadastro de Alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        setSize(new java.awt.Dimension(945, 515));
        setLocationRelativeTo(null);
    }

    private void jFormattedTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_jFormattedTextFieldNomeActionPerformed
    }

    private void jFormattedTextFieldRAActionPerformed(java.awt.event.ActionEvent evt)
    {
    }

    private void jFormattedTextFieldCursoActionPerformed(java.awt.event.ActionEvent evt)
    {
    }

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt)
    {
    }

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt)
    {
        flag = 1;
        jFormattedTextFieldNome.setEnabled(true);
        jFormattedTextFieldCurso.setEnabled(true);
        jFormattedTextFieldRA.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (flag == 1)
        {
            modelo.setNome(jFormattedTextFieldNome.getText());
            modelo.setCurso(jFormattedTextFieldCurso.getText());
            modelo.setEstado((String) jComboBoxEstado.getSelectedItem());
            modelo.setNumero_ra(Integer.parseInt(jFormattedTextFieldRA.getText()));
            control.Salvar(modelo);
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldCurso.setText("");
            jFormattedTextFieldRA.setText("");
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldCurso.setEnabled(false);
            jFormattedTextFieldRA.setEnabled(false);
            jComboBoxEstado.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
        }
        else
        {
            modelo.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            modelo.setNome(jFormattedTextFieldNome.getText());
            modelo.setCurso(jFormattedTextFieldCurso.getText());
            modelo.setNumero_ra(Integer.parseInt(jFormattedTextFieldRA.getText()));
            modelo.setEstado((String) jComboBoxEstado.getSelectedItem());
            control.Editar(modelo);
            jTextFieldID.setText("");
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldCurso.setText("");
            jFormattedTextFieldRA.setText("");
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldCurso.setEnabled(false);
            jFormattedTextFieldRA.setEnabled(false);
            jComboBoxEstado.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt)
    {
        modelo.setPesquisa(jTextFieldPesquisa.getText());
        Aluno model = control.buscaAluno(modelo);
        jFormattedTextFieldNome.setText(model.getNome());
        jTextFieldID.setText(String.valueOf(model.getCodigo()));
        jFormattedTextFieldCurso.setText(String.valueOf(model.getCurso()));
        jFormattedTextFieldRA.setText(String.valueOf(model.getNumero_ra()));
        jComboBoxEstado.setSelectedItem(model.getEstado());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt)
    {
        jFormattedTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCurso.setEnabled(!true);
        jFormattedTextFieldRA.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt)
    {
        flag = 2;
        jFormattedTextFieldNome.setEnabled(true);
        jFormattedTextFieldCurso.setEnabled(true);
        jFormattedTextFieldRA.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt)
    {
        Integer resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION)
        {
            modelo.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            control.Excluir(modelo);
            jTextFieldID.setText("");
            jFormattedTextFieldNome.setText("");
            jFormattedTextFieldCurso.setText("");
            jFormattedTextFieldRA.setText("");
            jFormattedTextFieldNome.setEnabled(false);
            jFormattedTextFieldCurso.setEnabled(false);
            jFormattedTextFieldRA.setEnabled(false);
            jComboBoxEstado.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt)
    {
        String nome_aluno = "" + jTableAlunos.getValueAt(jTableAlunos.getSelectedRow(), 1);
        conexao.conexao();
        conexao.executaSQL("select * from Alunos where Nome = '" + nome_aluno + "'");
        try
        {
            while (conexao.resultset.first())
            {
                jTextFieldID.setText(String.valueOf(conexao.resultset.getInt("AlunoID")));
                jFormattedTextFieldRA.setText(conexao.resultset.getString("NumeroRA"));
                jFormattedTextFieldNome.setText(conexao.resultset.getString("Nome"));
                jFormattedTextFieldCurso.setText(conexao.resultset.getString("Curso"));
                jComboBoxEstado.setSelectedItem(conexao.resultset.getString("Estado"));
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados\n" + ex);
        }
        conexao.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);

    }

    public void preencherTabela(String SQL)
    {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]
        { "ID", "Cod RA", "Nome", "Curso", "Estado" };
        conexao.conexao();
        conexao.executaSQL(SQL);
        try
        {
            conexao.resultset.first();
            do
            {
                dados.add(new Object[]
                { conexao.resultset.getInt("AlunoID"),
                        conexao.resultset.getInt("NumeroRA"), conexao.resultset.getString("Nome"),
                        conexao.resultset.getString("Curso"), conexao.resultset.getString("Estado") });
            }
            while (conexao.resultset.next());
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList" + ex);

        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableAlunos.setModel(modelo);
        jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableAlunos.getColumnModel().getColumn(0).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableAlunos.getColumnModel().getColumn(1).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableAlunos.getColumnModel().getColumn(2).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTableAlunos.getColumnModel().getColumn(3).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(4).setPreferredWidth(79);
        jTableAlunos.getColumnModel().getColumn(4).setResizable(false);
        jTableAlunos.getTableHeader().setReorderingAllowed(false);
        jTableAlunos.setAutoResizeMode(jTableAlunos.AUTO_RESIZE_OFF);
        jTableAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.desconecta();

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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCurso;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldRA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
