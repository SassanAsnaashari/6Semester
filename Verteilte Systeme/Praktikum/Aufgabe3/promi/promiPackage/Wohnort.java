package promi.promiPackage;


/**
* promi/promiPackage/Wohnort.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

public final class Wohnort implements org.omg.CORBA.portable.IDLEntity
{
  public String ortsname = null;
  public String staat = null;
  public short date[] = null;

  public Wohnort ()
  {
  } // ctor

  public Wohnort (String _ortsname, String _staat, short[] _date)
  {
    ortsname = _ortsname;
    staat = _staat;
    date = _date;
  } // ctor

} // class Wohnort
