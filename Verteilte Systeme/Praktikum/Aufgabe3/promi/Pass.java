package promi;


/**
* promi/Pass.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

public class Pass implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static promi.Pass[] __array = new promi.Pass [__size];

  public static final int _REISEPASS = 0;
  public static final promi.Pass REISEPASS = new promi.Pass(_REISEPASS);
  public static final int _AUSWEIS = 1;
  public static final promi.Pass AUSWEIS = new promi.Pass(_AUSWEIS);

  public int value ()
  {
    return __value;
  }

  public static promi.Pass from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Pass (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Pass
