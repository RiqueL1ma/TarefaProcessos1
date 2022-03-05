package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Principal {

	public static void main(String[] args) {
		RedesController redeController = new RedesController();
		
		  int opc = 0 ;
		  while (opc!=9){
		opc = Integer.parseInt(JOptionPane.showInputDialog
		("1 -  Exibir o Sistema Operacional \n 2 - Exibir IP \n 3 - Exibir Ping Google \n 9 - Finaliza"));
		     switch (opc) {
		            case 1:  redeController.osExibir(); 
		                     break;
		            case 2: redeController.ip();
		                    break;
		            case 3:
		                    redeController.ping();     
		                    break;
		            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
		                     break;
		            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
		
		
		
		     }

		  }
	}
}
