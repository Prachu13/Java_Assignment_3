interface A
{
public void Details();
default void Address()
{
System.out.println("Address :-\n88, Kanteshwar soc,,\nLalita chokdi,\nKatargam,\nSurat - 395004");
}
}
public class pr7 implements A
{
public void Details()
{
System.out.println("Details:-");
System.out.println("Name : Prachi Gajera");
System.out.println("ID No. : 21CE030");
System.out.println("Collage name : CSPIT");
System.out.println("Branch : Computer Engineering");
System.out.println("Current Sem. : 3");
}
