public class ExemploSwitch
{
  public static void main (String args[])
  {
    int codigo = 1;
    
    switch(codigo)
    {
      case 1 : System.out.println ("O produto é um shampoo.");
               System.out.println ("E acompanha um condicionador.");
       break;
      case 2 : System.out.println ("O produto é um perfume.");
       break;
      case  3: System.out.println ("O produto é um hidratante.");
       break;
      case 4 : System.out.println ("O produto é um sabonete.");
       break;
    }
  }
}