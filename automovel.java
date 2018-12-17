import javax.swing.JOptionPane;
class automovel
{
   public static void main(String args[])
   {
       float car_fab, tax_ven, tax_imp, car_tot;

       car_fab = Float.parseFloat(JOptionPane.showInputDialog
       ("Digite o valor de fábrica do carro: "));

       tax_ven = (car_fab / 100) * 25;
       tax_imp = (car_fab / 100) * 45;
       car_tot = car_fab + tax_ven + tax_imp;

       JOptionPane.showMessageDialog(null,"Valor do carro fábrica: "+car_fab+
       "\nTaxa vendedor: "+tax_ven+"\nTaxa imposto: "+tax_imp+
       "\nValor total do carro: "+car_tot);

       System.out.println("Valor do carro fábrica: "+car_fab);
       System.out.println("Taxa Vendedor: "+tax_ven);
       System.out.println("Taxa imposto: "+tax_imp);
       System.out.println("Valor total do carro: "+car_tot);
   }
}