/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.apresentacao;

import br.com.SistemaGerenciadordeConsultas.entidade.Especialidade;
import br.com.SistemaGerenciadordeConsultas.entidade.Medico;
import br.com.SistemaGerenciadordeConsultas.negocio.EspecialidadeBO;
import br.com.SistemaGerenciadordeConsultas.negocio.MedicoBO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rayssa
 */
public class ListagemMedicoForm extends javax.swing.JFrame {

    /**
     * Creates new form NovoMedicoForm
     */
    private List<Medico> medicos;
    private Medico filtro;

    public ListagemMedicoForm()throws SQLException {
      this.PrepararTela();
    }
     public void PrepararTela() throws SQLException {
        
            initComponents();
            carregarCmb();
            this.carregarTabelaMedico();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedico = new javax.swing.JTable();
        btnNovoNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEspecialidade = new javax.swing.JLabel();
        cmbEspecialidade = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Médicos");
        setExtendedState(6);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Médicos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tblMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMedico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblMedico);

        btnNovoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469138520_add_user.png"))); // NOI18N
        btnNovoNovo.setText("Novo");
        btnNovoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469138663_user_profile_edit.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469138248_ic_assignment_return_48px.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCpf.setText("Cpf:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNome.setText("Nome:");

        lblEspecialidade.setText("Especialidade:");

        cmbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469139237_search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469225071_clear_left.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEspecialidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecialidade)
                    .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1017, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoNovoActionPerformed
        try {
            NovoMedicoForm novoMedicoForm = new NovoMedicoForm(this);
            novoMedicoForm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ListagemMedicoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoNovoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtro = new Medico();
        String cpf = txtCpf.getText().trim();
        String nome = txtNome.getText().trim();
        Especialidade especialidade = null;
        try {
            especialidade = (Especialidade) cmbEspecialidade.getSelectedItem();
        } catch (Exception e) {
        }
        filtro.setNome(nome);
        filtro.setCpf(cpf);
        filtro.setEspecialidade(especialidade);
        carregarTabelaMedico();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCpf.setText("");
        txtNome.setText("");
        try {
            carregarCmb();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        filtro = null;
        carregarTabelaMedico();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            this.editarMedico();
        } catch (SQLException ex) {
            Logger.getLogger(NovoMedicoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void editarMedico() throws SQLException {
         try {
            int linhaSelecionada = tblMedico.getSelectedRow();
            if (linhaSelecionada != -1) {
                Medico medicoSelecionado = medicos.get(linhaSelecionada);

                int resposta;
                String mensagem = "Deseja alterar Médico? " + medicoSelecionado.getNome();
                String titulo = "Alteração de Médico";
                resposta = JOptionPane.showConfirmDialog(this, mensagem, titulo, JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_NO_OPTION) {
                    NovoMedicoForm cadastroMedico = new NovoMedicoForm(medicoSelecionado,this);
                    cadastroMedico.setVisible(true);
                }
            } else {
                String mensagem = "Nenhum médico selecionado para Alterar.";
                JOptionPane.showMessageDialog(this, mensagem, "Alteração de Médico", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            String mensagem = "Erro inesperado! Informe a mensagem de erro ao administrador do sistema.";
            mensagem += "\nMensagem de erro:\n" + e.getMessage();
            e.printStackTrace(System.err);
            JOptionPane.showMessageDialog(this, mensagem, "Alteração de Médico ", JOptionPane.ERROR_MESSAGE);
             
            //this.dispose();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovoNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbEspecialidade;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblMedico;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void carregarCmb() throws SQLException {
        EspecialidadeBO especialidadeBO = new EspecialidadeBO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbEspecialidade.getModel();
        model.removeAllElements();
        model.addElement("Selecione");
        for (Especialidade especialidade : especialidadeBO.buscarTodos()) {
            model.addElement(especialidade);
        }
    }

    public void carregarTabelaMedico() {
        MedicoBO medicoBO = new MedicoBO();
        try {
            if (filtro == null) {
                this.medicos = medicoBO.buscarTodos();
            } else {
                this.medicos = medicoBO.buscarTodosFiltro(filtro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Model model = new Model();
        this.tblMedico.setModel(model);
    }

    private class Model extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return medicos.size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int linha, int coluna) {
            Medico medico = medicos.get(linha);
            if (coluna == 0) {
                return medico.getNome();
            } else if (coluna == 1) {
                return medico.getCpf();
            } else if (coluna == 2) {
                return medico.getCrm();
            } else if (coluna == 3) {
                return medico.getEspecialidade().getNome();
            } else if (coluna == 4) {
                return medico.getTelefone();
            } else if (coluna == 5) {
                return medico.getEndereco();
            } else if (coluna == 6) {
                return medico.getSexo();
            }
            return null;
        }

        @Override
        public String getColumnName(int coluna) {
            if (coluna == 0) {
                return "NOME";
            } else if (coluna == 1) {
                return "CPF";
            } else if (coluna == 2) {
                return "CRM";
            } else if (coluna == 3) {
                return "ESPECIALIDADE";
            } else if (coluna == 4) {
                return "TELEFONE";
            } else if (coluna == 5) {
                return "ENDEREÇO";
            } else if (coluna == 6) {
                return "SEXO";
            }
            return null;
        }
    }
}
