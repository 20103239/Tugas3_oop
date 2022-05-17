
package conversisuhu;

/**
 *
 * @author Kristina 20103239
 */
public class Kelvin {
    double toFahrenheit(){
        //F = K × 1,8 − 459,67
        return (ConversiSuhu.SuhuAwal*1.8-459.67);
    }
    double toReamur(){
        //Re = (K − 273,15) × 0,8
        return ((ConversiSuhu.SuhuAwal-273.15)*0.8);
    }
    double toCelcius(){
        //C = K − 273,15
        return (ConversiSuhu.SuhuAwal-273.15);
    }
    
}
