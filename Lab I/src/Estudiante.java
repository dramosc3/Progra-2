public class Estudiante{
 
 private String nombre; private int edad; private double[] notas;
 
 public Estudiante(String n, int e, double[] notas){
  this.nombre=n;
  this.edad=e;
  this.notas=notas;
 }
 
 public double calcularPromedio(){
  double s=0;
  for(double x:notas)s+=x;
  return s/notas.length;
 }
 
 public void mostrarInformacion(){
  System.out.println(nombre+" "+calcularPromedio());
 }
}
