package promi.promiPackage;


/**
* promi/promiPackage/Wohnort_SeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

abstract public class Wohnort_SeqHelper
{
  private static String  _id = "IDL:promi/promi/Wohnort_Seq:1.0";

  public static void insert (org.omg.CORBA.Any a, promi.promiPackage.Wohnort[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static promi.promiPackage.Wohnort[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = promi.promiPackage.WohnortHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (promi.promiPackage.Wohnort_SeqHelper.id (), "Wohnort_Seq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static promi.promiPackage.Wohnort[] read (org.omg.CORBA.portable.InputStream istream)
  {
    promi.promiPackage.Wohnort value[] = null;
    int _len0 = istream.read_long ();
    value = new promi.promiPackage.Wohnort[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = promi.promiPackage.WohnortHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, promi.promiPackage.Wohnort[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      promi.promiPackage.WohnortHelper.write (ostream, value[_i0]);
  }

}
