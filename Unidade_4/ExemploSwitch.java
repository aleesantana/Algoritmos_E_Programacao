public class ExemploSwitch
{
  public static void main (String args[])
  {
    int codigo = 1;
    
    switch(codigo)
    {
      case 1 : System.out.println ("O produto � um shampoo.");
               System.out.println ("E acompanha um condicionador.");
       break;
      case 2 : System.out.println ("O produto � um perfume.");
       break;
      case  3: System.out.println ("O produto � um hidratante.");
       break;
      case 4 : System.out.println ("O produto � um sabonete.");
       break;
    }
  }
}