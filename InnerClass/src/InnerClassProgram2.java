class Computer {

   // static nested class
   static class Ports{
       int usb = 2;
       int hdmi = 1;
       int aux = 2;
       int getTotalPorts(){
           return usb+hdmi+aux;
       }
   }

}
public class InnerClassProgram2 {
   public static void main(String[] args) {

       Computer.Ports ports = new Computer.Ports();
       System.out.println("Total Ports = " + ports.getTotalPorts());
   }
}