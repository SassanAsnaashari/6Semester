package promi.menschPackage;


/**
* promi/menschPackage/Name.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:10 Uhr MESZ
*/

public final class Name implements org.omg.CORBA.portable.IDLEntity
{
  public String nachname = null;
  public String vorname[] = null;

  public Name ()
  {
  } // ctor

  public Name (String _nachname, String[] _vorname)
  {
    nachname = _nachname;
    vorname = _vorname;
  } // ctor

} // class Name
