package promi.promiPackage;


/**
* promi/promiPackage/Raisons.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:24 Uhr MESZ
*/

public class Raisons implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static promi.promiPackage.Raisons[] __array = new promi.promiPackage.Raisons [__size];

  public static final int _EINS = 0;
  public static final promi.promiPackage.Raisons EINS = new promi.promiPackage.Raisons(_EINS);
  public static final int _ZWEI = 1;
  public static final promi.promiPackage.Raisons ZWEI = new promi.promiPackage.Raisons(_ZWEI);
  public static final int _DREI = 2;
  public static final promi.promiPackage.Raisons DREI = new promi.promiPackage.Raisons(_DREI);

  public int value ()
  {
    return __value;
  }

  public static promi.promiPackage.Raisons from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Raisons (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Raisons
