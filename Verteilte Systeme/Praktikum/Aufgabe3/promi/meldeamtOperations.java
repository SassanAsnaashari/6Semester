package promi;


/**
* promi/meldeamtOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./src/main/java/my_modul.idl
* Dienstag, 26. April 2022 16:32 Uhr MESZ
*/

public interface meldeamtOperations 
{
  promi.promi suchen (promi.meldeamtPackage.U u);
  promi.meldeamtPackage.Emotion zuzug (promi.promi promi);
  org.omg.CORBA.Any wegzug (promi.promi promi);
} // interface meldeamtOperations
