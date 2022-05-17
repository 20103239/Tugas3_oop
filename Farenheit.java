
package conversisuhu;

/**
 *
 * @author Kristina 20103239
 */
public class Farenheit {
    double toReamur(){
        //Re = (F − 32) / 2,25
        return ((ConversiSuhu.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (F + 459,67) / 1,8
        return ((ConversiSuhu.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //C = (F − 32) / 1,8
        return ((ConversiSuhu.SuhuAwal-32)/1.8);
    }
}
