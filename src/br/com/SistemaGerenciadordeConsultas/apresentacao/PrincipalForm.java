/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.apresentacao;

import br.com.SistemaGerenciadordeConsultas.entidade.QuantidadeConsultaPorDia;
import br.com.SistemaGerenciadordeConsultas.entidade.Usuario;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.excecao.LoginInvalidoException;
import br.com.SistemaGerenciadordeConsultas.negocio.ConsultaBO;
import br.com.SistemaGerenciadordeConsultas.negocio.UsuarioBO;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rayssa
 */
public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    Usuario usuario;

    public PrincipalForm() {
        initComponents();
        desabilitarMenuTela();
    }

    private void desabilitarMenuTela() {
        btnLogoff.setEnabled(false);
        menuCadastro.setEnabled(false);
        MenuRelatorios.setEnabled(false);
        menuAgenda.setEnabled(false);

    }

    private void habilitarMenuTela(Usuario usuario) {
        btnEntrar.setEnabled(false);
        btnLogoff.setEnabled(true);
        menuCadastro.setEnabled(true);
        MenuRelatorios.setEnabled(true);
        menuAgenda.setEnabled(true);
        lblLogin.setEnabled(false);
        txtLogin.setEnabled(false);
        lblSenha.setEnabled(false);
        txtSenha.setEnabled(false);
        if (usuario.getGrupo_Usuario().equals("ADMINISTRADOR")) {
            mnuMedico.setEnabled(true);
            mnuEspecialidade.setEnabled(true);
            mnuPaciente.setEnabled(false);
            mnuConsulta.setEnabled(false);

        } else if (usuario.getGrupo_Usuario().equals("SECRETÁRIA")) {
            mnuPaciente.setEnabled(true);
            mnuConsulta.setEnabled(true);
            mnuMedico.setEnabled(false);
            mnuEspecialidade.setEnabled(false);
            mnuUsuario.setEnabled(false);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogoff = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenuItem();
        mnuEspecialidade = new javax.swing.JMenuItem();
        mnuMedico = new javax.swing.JMenuItem();
        mnuPaciente = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        mnuAgendaPorMedico = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        mnuRelatorioMedico = new javax.swing.JMenuItem();
        mnuRelatorioPaciente = new javax.swing.JMenuItem();
        mnuConsultaPorDia = new javax.swing.JMenuItem();
        mnuSistema = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Gerenciador Consultas Médicas");
        setExtendedState(6);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1467405001_Login_out.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1467404971_Login_in.png"))); // NOI18N
        btnEntrar.setText("Login");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenha.setText("Senha:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/caduceus-medical-symbol-of-two-ascending-serpents-on-a-cane-with-wings.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogoff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/computer-monitor.png"))); // NOI18N
        menuCadastro.setText("Cadastros");

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/couple-users-silhouette.png"))); // NOI18N
        mnuUsuario.setText("Usuário");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(mnuUsuario);

        mnuEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/notes.png"))); // NOI18N
        mnuEspecialidade.setText("Especialidade");
        mnuEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEspecialidadeActionPerformed(evt);
            }
        });
        menuCadastro.add(mnuEspecialidade);

        mnuMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/medical-doctor-specialist (1).png"))); // NOI18N
        mnuMedico.setText("Médico");
        mnuMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(mnuMedico);

        mnuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/health-insurance-symbol-of-a-man-with-broken-arm.png"))); // NOI18N
        mnuPaciente.setText("Paciente");
        mnuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(mnuPaciente);

        mnuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/medical-records.png"))); // NOI18N
        mnuConsulta.setText("Consulta");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        menuCadastro.add(mnuConsulta);

        jMenuBar1.add(menuCadastro);

        menuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/calendar (1).png"))); // NOI18N
        menuAgenda.setText("Agenda");

        mnuAgendaPorMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469138584_Searchicons-search-people.png"))); // NOI18N
        mnuAgendaPorMedico.setText("Buscar Por Medico");
        mnuAgendaPorMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgendaPorMedicoActionPerformed(evt);
            }
        });
        menuAgenda.add(mnuAgendaPorMedico);

        jMenuBar1.add(menuAgenda);

        MenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/google-drive-pdf-file.png"))); // NOI18N
        MenuRelatorios.setText("Relatorios");

        mnuRelatorioMedico.setText("Consulta Medico(A)");
        mnuRelatorioMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioMedicoActionPerformed(evt);
            }
        });
        MenuRelatorios.add(mnuRelatorioMedico);

        mnuRelatorioPaciente.setText("Consulta Paciente");
        mnuRelatorioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioPacienteActionPerformed(evt);
            }
        });
        MenuRelatorios.add(mnuRelatorioPaciente);

        mnuConsultaPorDia.setText("Gráfico Consultas Diárias");
        mnuConsultaPorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaPorDiaActionPerformed(evt);
            }
        });
        MenuRelatorios.add(mnuConsultaPorDia);

        jMenuBar1.add(MenuRelatorios);

        mnuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/logout.png"))); // NOI18N
        mnuSistema.setText("Sistema");
        mnuSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSistemaActionPerformed(evt);
            }
        });

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/1469138757_reboot.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuSistema.add(mnuSair);

        jMenuBar1.add(mnuSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1227, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistema?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        try {
            ListagemUsuarioForm usuarioForm = new ListagemUsuarioForm();
            usuarioForm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void mnuEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEspecialidadeActionPerformed
        ListagemEspecialidadeForm especialidadeForm = new ListagemEspecialidadeForm();
        especialidadeForm.setVisible(true);
    }//GEN-LAST:event_mnuEspecialidadeActionPerformed

    private void mnuMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMedicoActionPerformed
        try {
            ListagemMedicoForm medicoForm = new ListagemMedicoForm();
            medicoForm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuMedicoActionPerformed

    private void mnuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPacienteActionPerformed
        try {
            ListagemPacienteForm pacienteForm = new ListagemPacienteForm();
            pacienteForm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuPacienteActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
       ListagemConsultasForm listagemConsulta = new ListagemConsultasForm();
       listagemConsulta.setVisible(true);
    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void mnuAgendaPorMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgendaPorMedicoActionPerformed
        AbrirAgendaMedicoForm abrirAgendaMedicoForm = new AbrirAgendaMedicoForm();
        abrirAgendaMedicoForm.setVisible(true);
    }//GEN-LAST:event_mnuAgendaPorMedicoActionPerformed

    private void mnuRelatorioMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioMedicoActionPerformed
        RelatorioMedicoForm relatorioMedicoForm = new RelatorioMedicoForm();
        relatorioMedicoForm.setVisible(true);
    }//GEN-LAST:event_mnuRelatorioMedicoActionPerformed

    private void mnuRelatorioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioPacienteActionPerformed
        RelatorioPacienteForm pacienteForm = new RelatorioPacienteForm();
        pacienteForm.setVisible(true);
    }//GEN-LAST:event_mnuRelatorioPacienteActionPerformed

    private void mnuConsultaPorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaPorDiaActionPerformed
        // TODO add your handling code here:
        List<QuantidadeConsultaPorDia> listaDeConsultasPorDia;
        ConsultaBO consultaBO = new ConsultaBO();
        try {
            listaDeConsultasPorDia = consultaBO.buscarConsultasPorDia();
            this.gerarGraficoConsultaPorDia(listaDeConsultasPorDia);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnuConsultaPorDiaActionPerformed

    private void mnuSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuSistemaActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        PrincipalForm principalForm = new PrincipalForm();
        principalForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login = txtLogin.getText().trim();
        String senha = txtSenha.getText().trim();
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        try {
            usuario.setSenha(Criptografia.exemploMD5(senha));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(NovoUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(NovoUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            UsuarioBO usuarioBO = new UsuarioBO();
            usuarioBO.login(usuario);

            try {
                Usuario usuarioTela = usuarioBO.pesquisarLoginCadastrado(usuario);
                habilitarMenuTela(usuarioTela);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (CampoObrigatorioException e) {
            JOptionPane.showMessageDialog(this, "Preencha Todos os Campos para logar no Sistema!", "Login de Usuário!", JOptionPane.ERROR_MESSAGE);
        } catch (LoginInvalidoException e) {
            JOptionPane.showMessageDialog(this, "Login Inválido!Usuário não Cadastrado no Sistema", "Login de Usuário!", JOptionPane.ERROR_MESSAGE);
            limparCamposTela();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed
    private void limparCamposTela() {
        txtLogin.setText("");
        txtSenha.setText("");
    }

    private void gerarGraficoConsultaPorDia(List<QuantidadeConsultaPorDia> consultas) {
        try {
            String arquivoRelatorio = System.getProperty("user.dir")
                    + "/relatorios/GraficoConsultaPorDia.jasper";

            Map<String, Object> paramentros = new HashMap<String, Object>();

            JRBeanCollectionDataSource fonteDados
                    = new JRBeanCollectionDataSource(consultas);

            JasperPrint relatorioGerado = JasperFillManager.fillReport(arquivoRelatorio, paramentros, fonteDados);

            JasperViewer telaExibicaoRelatorio
                    = new JasperViewer(relatorioGerado, false);
            telaExibicaoRelatorio.setTitle("Gráfico de Consultas por Dia");
            telaExibicaoRelatorio.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao exibir gráfico.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem mnuAgendaPorMedico;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuConsultaPorDia;
    private javax.swing.JMenuItem mnuEspecialidade;
    private javax.swing.JMenuItem mnuMedico;
    private javax.swing.JMenuItem mnuPaciente;
    private javax.swing.JMenuItem mnuRelatorioMedico;
    private javax.swing.JMenuItem mnuRelatorioPaciente;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JMenuItem mnuUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
