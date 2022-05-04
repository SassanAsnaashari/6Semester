package promi.promiPackage;


/**
* promi/promiPackage/WohnortHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

abstract public class WohnortHelper
{
  private static String  _id = "IDL:promi/promi/Wohnort:1.0";

  public static void insert (org.omg.CORBA.Any a, promi.promiPackage.Wohnort that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static promi.promiPackage.Wohnort extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "ortsname",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "staat",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (promi.promi.ACHT, _tcOf_members0 );
          _members0[2] = new org.omg.CORBA.StructMember (
            "date",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (promi.promiPackage.WohnortHelper.id (), "Wohnort", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static promi.promiPackage.Wohnort read (org.omg.CORBA.portable.InputStream istream)
  {
    promi.promiPackage.Wohnort value = new promi.promiPackage.Wohnort ();
    value.ortsname = istream.read_string ();
    value.staat = istream.read_string ();
    value.date = new short[promi.promi.ACHT];
    for (int _o0 = 0;_o0 < (promi.promi.ACHT); ++_o0)
    {
      value.date[_o0] = istream.read_short ();
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, promi.promiPackage.Wohnort value)
  {
    ostream.write_string (value.ortsname);
    ostream.write_string (value.staat);
    if (value.date.length != (promi.promi.ACHT))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (promi.promi.ACHT); ++_i0)
    {
      ostream.write_short (value.date[_i0]);
    }
  }

}
