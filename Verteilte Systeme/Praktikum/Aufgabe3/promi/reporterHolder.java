package promi;

/**
* promi/reporterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

public final class reporterHolder implements org.omg.CORBA.portable.Streamable
{
  public promi.reporter value = null;

  public reporterHolder ()
  {
  }

  public reporterHolder (promi.reporter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = promi.reporterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    promi.reporterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return promi.reporterHelper.type ();
  }

}
