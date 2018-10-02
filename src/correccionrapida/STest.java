package correccionrapida;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class STest {
    
    static NumberFormat redondeo = new DecimalFormat("#0.##");
    
    public static String lengua(int presentacion, int ortografia, int vocabulario, int caligrafia, double contenidoTotal, double contenidoBien, double contenidoRegular, java.util.prefs.Preferences valores){
        return redondeo.format(((presentacion*Double.parseDouble(valores.node("Lengua").get("Presentacion", null))) + (ortografia*Double.parseDouble(valores.node("Lengua").get("Ortografia", null))) + (vocabulario*Double.parseDouble(valores.node("Lengua").get("Vocabulario", null))) + (caligrafia*Double.parseDouble(valores.node("Lengua").get("Caligrafia", null)))) + (((contenidoBien+(contenidoRegular/2))/contenidoTotal)*(Double.parseDouble(valores.node("Lengua").get("Contenido", null)))*10));
    }
    
    public static String matematicas(int calculo, int problemas, int presentacion, double contenidoTotal, double contenidoBien, double contenidoRegular, java.util.prefs.Preferences valores){
        return redondeo.format(((calculo*Double.parseDouble(valores.node("Matematicas").get("Calculo", null))) + (problemas*Double.parseDouble(valores.node("Matematicas").get("Problemas", null))) + (presentacion*Double.parseDouble(valores.node("Matematicas").get("Presentacion", null)))) + (((contenidoBien+(contenidoRegular/2))/contenidoTotal)*(Double.parseDouble(valores.node("Matematicas").get("Contenido", null)))*10));
    }
    
    public static String naturales(int presentacion, int ortografia, double contenidoTotal, double contenidoBien, double contenidoRegular, java.util.prefs.Preferences valores){
        return redondeo.format(((ortografia*Double.parseDouble(valores.node("Naturales").get("Ortografia", null))) + (presentacion*Double.parseDouble(valores.node("Naturales").get("Presentacion", null)))) + (((contenidoBien+(contenidoRegular/2))/contenidoTotal)*(Double.parseDouble(valores.node("Naturales").get("Contenido", null)))*10));
    }
    
    public static String sociales(int presentacion, int ortografia, double contenidoTotal, double contenidoBien, double contenidoRegular,java.util.prefs.Preferences valores){
        return redondeo.format(((ortografia*Double.parseDouble(valores.node("Sociales").get("Ortografia", null))) + (presentacion*Double.parseDouble(valores.node("Sociales").get("Presentacion", null)))) + (((contenidoBien+(contenidoRegular/2))/contenidoTotal)*(Double.parseDouble(valores.node("Sociales").get("Contenido", null)))*10));
    }
    
}
