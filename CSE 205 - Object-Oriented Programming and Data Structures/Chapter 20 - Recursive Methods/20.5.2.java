public class DollViewer
{
   public static String show(Doll d)
   {
    if (d.isSolid())
            return d.getName();
        else
            return d.getName() + " contains " + show(d.getDollInside());

   }

   public static void main (String [] args)
   {
      Doll dolls1 = new Doll("Alina", new Doll("Vera", new Doll("Galina")));
      Doll dolls2 = new Doll("Anna", new Doll("Dina"));
      Doll dolls3 = new Doll("Nika");
      Doll dolls4 = new Doll("Martina", new Doll("Olga", new Doll("Sofia", new Doll("Elvira"))));
      System.out.println(show(dolls1));
      System.out.println(show(dolls2));
      System.out.println(show(dolls3));
      System.out.println(show(dolls4));
   }
}   