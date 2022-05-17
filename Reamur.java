
package conversisuhu;

/**
 *
 * @author Kristina Dewi 20103239
 */
public class Reamur {
    double toFahrenheit(){
  //F = Re × 2,25 + 32
  return (ConversiSuhu.SuhuAwal*2.25+32);
  }
  double toKelvin(){
  //K = Re / 0,8 + 273,15
  return (ConversiSuhu.SuhuAwal/0.8+237.15);
  }
  double toCelcius(){
  //C = Re / 0,8
  return (ConversiSuhu.SuhuAwal/0.8);
  }
    
}
