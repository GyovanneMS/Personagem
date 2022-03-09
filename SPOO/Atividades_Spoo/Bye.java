public class Bye{
	ListaVeiculos listv = null;

	private void jBVeiculosActionPerformed(java.awt.event.ActionEvent evt) {
		String Pessoa_ID = (String) jTLista.getModel().getValueAt(
				jTLista.getSelectedRow(), 0);
		this.listv = new ListaVeiculos(null, true, Pessoa_ID);
		this.listv.setVisible(true);
	}

}