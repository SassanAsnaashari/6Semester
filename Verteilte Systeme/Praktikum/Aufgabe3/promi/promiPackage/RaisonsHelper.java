package promi.promiPackage;


/**
* promi/promiPackage/RaisonsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:24 Uhr MESZ
*/

abstract public class RaisonsHelper
{
  private static String  _id = "IDL:promi/promi/Raisons:1.0";

  public static void insert (org.omg.CORBA.Any a, promi.promiPackage.Raisons that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static promi.promiPackage.Raisons extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (promi.promiPackage.RaisonsHelper.id (), "Raisons", new String[] { "EINS", "ZWEI", "DREI"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static promi.promiPackage.Raisons read (org.omg.CORBA.portable.InputStream istream)
  {
    return promi.promiPackage.Raisons.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, promi.promiPackage.Raisons value)
  {
    ostream.write_long (value.value ());
  }

}
