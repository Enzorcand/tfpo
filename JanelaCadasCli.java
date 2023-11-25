import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JanelaCadasCli extends JFrame implements ActionListener{
    private JTextField nomeCli;
    private JTextField matric;
    private JTextField telefone;
    private JButton botaoNome;
    private JButton botaoMatric;
    private JButton botaoTele;
    
    public JanelaCadasCli(){
         super();
         
         
         botaoMatric = new JButton("ENVIAR MATRICULA");
         botaoNome = new JButton("ENVIAR NOME");
         botaoTele = new JButton("ENVIAR TELEFONE");
         nomeCli = new JTextField(30);
         matric = new JTextField(30);
         telefone = new JTextField(30);
         
         GridLayout lay=new  GridLayout();
         JPanel painel=new JPanel(new GridLayout(3, 1));
         painel.add(nomeCli);
         painel.add(botaoNome);
         painel.add(matric);
         painel.add(botaoMatric);
         painel.add(telefone);
         painel.add(botaoTele);
         
         this.add(painel);
         this.setSize(800,600);
         this.setTitle("CADASTRO CLIENTE");
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         botaoMatric.addActionListener(this);
         botaoNome.addActionListener(this);
         botaoTele.addActionListener(this);
         this.setVisible(true);
    }
      public void actionPerformed(ActionEvent e) {
      String nome;
      String matric;
      String tele;
          if(e.getSource() == botaoNome) {
         nome = nomeCli.getText();
       
      }
       else if(e.getSource() == botaoMatric) {
         matric = nomeCli.getText();  

     }
       else if(e.getSource() == botaoTele) {
         tele = nomeCli.getText();  

     }
     
   }
}