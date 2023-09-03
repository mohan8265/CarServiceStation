import java.util.HashMap;
import java.util.Map;

public class CarService {
    static Map<String,Map<String,Integer>> carServiceCharges = new HashMap<>();

    static {
        Map<String,Integer> hatchbackCharges = new HashMap<>();
        hatchbackCharges.put("BS01",2000);
        hatchbackCharges.put("EF01",5000);
        hatchbackCharges.put("CF01",2000);
        hatchbackCharges.put("BF01",1000);
        hatchbackCharges.put("GF01",3000);

        Map<String,Integer> sedanCharges = new HashMap<>();
        sedanCharges.put("BS01",4000);
        sedanCharges.put("EF01",8000);
        sedanCharges.put("CF01",4000);
        sedanCharges.put("BF01",1500);
        sedanCharges.put("GF01",6000);

        Map<String,Integer> suvCharges = new HashMap<>();
        suvCharges.put("BS01",5000);
        suvCharges.put("EF01",10000);
        suvCharges.put("CF01",6000);
        suvCharges.put("BF01",2500);
        suvCharges.put("GF01",8000);


        carServiceCharges.put("HatchBack",hatchbackCharges);
        carServiceCharges.put("Sedan",sedanCharges);
        carServiceCharges.put("SUV",suvCharges); 
    }
}
