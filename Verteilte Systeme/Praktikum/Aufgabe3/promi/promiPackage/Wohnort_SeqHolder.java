package promi.promiPackage;


/**
* promi/promiPackage/Wohnort_SeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

public final class Wohnort_SeqHolder implements org.omg.CORBA.portable.Streamable
{
  public promi.promiPackage.Wohnort value[] = null;

  public Wohnort_SeqHolder ()
  {
  }

  public Wohnort_SeqHolder (promi.promiPackage.Wohnort[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = promi.promiPackage.Wohnort_SeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    promi.promiPackage.Wohnort_SeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return promi.promiPackage.Wohnort_SeqHelper.type ();
  }

}