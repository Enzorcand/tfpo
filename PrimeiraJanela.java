import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraJanela extends JFrame implements ActionListener {
 private JButton botCadasCli;
 private JButton botCadasObra;
 private JButton botReserva;

 

    public PrimeiraJanela() {
    super();
    
    botCadasCli = new JButton("CADASTRAR CLIENTE");
    botCadasObra = new JButton("CADASTRAR OBRA");
    botReserva = new JButton("RESERVA");
  
    FlowLayout layout = new FlowLayout();
    JPanel painel = new JPanel();
    painel.setLayout(layout);
  
    painel.add(botCadasCli);
    painel.add(botCadasObra);
    painel.add(botReserva);

    this.add(painel);
    this.setSize(800,600);
    this.setTitle("BIBLIOTECA");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
  
    
    botCadasCli.addActionListener(this);
    botCadasObra.addActionListener(this);
    botReserva.addActionListener(this);
    this.setVisible(true);
 }
  public void actionPerformed(ActionEvent e) {
   if(e.getSource() == botCadasCli) {
       JanelaCadasCli janClie=new JanelaCadasCli();
       
   }
   else if(e.getSource() == botCadasObra) {

   }
   else if(e.getSource() == botReserva) {

   }
  }
}
