public class Docente extends Persona{
 private String especialidad; private double salario;
 public Docente(String n,int e,String es,double s){super(n,e);especialidad=es;salario=s;}
 @Override public void mostrarInformacion(){System.out.println(nombre+" "+especialidad+" "+salario);}
}