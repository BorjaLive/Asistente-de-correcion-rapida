package correccionrapida;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.ini4j.Ini;
import org.ini4j.IniPreferences;

public class CorreccionRapida {

    static String asig = "1";
    public static java.util.prefs.Preferences valores;
    
    public static void main(String[] args) throws IOException {
        Ini ini = new Ini(new File("valores.ini"));
        valores = new IniPreferences(ini);
        System.out.println();
        System.out.println("----------CORRECCION RAPIDA----------");
        selecAsig(0);
    }
    
    private static void selecAsig(double contenidoT){
        System.out.print("Introduce el numero de asignatura, nada para usar la anterior: ");
        Scanner scaner = new Scanner(System.in);
        String asig2 = null;
        asig2 = scaner.nextLine();
        
        if(asig2.isEmpty()){
            System.out.println("Seleccionada la anterior: "+asig);
                switch(asig){
                    case("1"):
                        c2Lengua(contenidoT);
                    break;
                    case("2"):
                        c2Mates(contenidoT);
                    break;
                    case("3"):
                        c2Ciencia(contenidoT);
                    break;
                }
        }
        
        switch(asig2){
            case("1"):
                System.out.println("Seleccionada Lengua");
                asig = "1";
                cLengua();
            break;
            case("2"):
                System.out.println("Seleccionada Matematicas");
                asig = "2";
                cMates();
            break;
            case("3"):
                System.out.println("Seleccionada Ciencias Naturales y Sociales");
                asig = "3";
                cCiencia();
            break;
        }
        
    }
    
    private static void cLengua(){
        int presentación, ortografia, vocabulario, caligrafia;
        double contenidoT, contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Ortografia: ");
        ortografia = scaner.nextInt();
        System.out.print("Vocabulario: ");
        vocabulario = scaner.nextInt();
        System.out.print("Caligrafia: ");
        caligrafia = scaner.nextInt();
        System.out.print("Contendo Total: ");
        contenidoT = scaner.nextDouble();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        System.out.print("Contenido Regular: ");
        contenidoR = scaner.nextDouble();
        
        if(presentación == 0){
            presentación = 10;
        }
        if(ortografia == 0){
            ortografia = 10;
        }
        if(vocabulario == 0){
            vocabulario = 10;
        }
        if(caligrafia == 0){
            caligrafia = 10;
        }
        
        System.out.println("Nota final: "+STest.lengua(presentación,ortografia,vocabulario,caligrafia,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
    private static void cMates(){
        int presentación, calculo, problemas;
        double contenidoT, contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Calculo: ");
        calculo = scaner.nextInt();
        System.out.print("Problemas: ");
        problemas = scaner.nextInt();
        System.out.print("Contendo Total: ");
        contenidoT = scaner.nextDouble();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        System.out.print("Contenido Regular: ");
        contenidoR = scaner.nextDouble();
        
        if(presentación == 0){
            presentación = 10;
        }
        if(calculo == 0){
            calculo = 10;
        }
        if(problemas == 0){
            problemas = 10;
        }
        
        System.out.println("Nota final: "+STest.matematicas(calculo,problemas,presentación,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
    private static void cCiencia(){
        int presentación, ortografia, vocabulario, caligrafia;
        double contenidoT, contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Ortografia: ");
        ortografia = scaner.nextInt();
        System.out.print("Contendo Total: ");
        contenidoT = scaner.nextDouble();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        System.out.print("Contenido Regular: ");
        contenidoR = scaner.nextDouble();
        
        if(presentación == 0){
            presentación = 10;
        }
        if(ortografia == 0){
            ortografia = 10;
        }
        
        System.out.println("Nota final: "+STest.naturales(presentación,ortografia,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
    private static void c2Lengua(double contenidoT){
        int presentación, ortografia, vocabulario, caligrafia;
        double contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Ortografia: ");
        ortografia = scaner.nextInt();
        System.out.print("Vocabulario: ");
        vocabulario = scaner.nextInt();
        System.out.print("Caligrafia: ");
        caligrafia = scaner.nextInt();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        if(contenidoB != contenidoT){
            System.out.print("Contenido Regular: ");
            contenidoR = scaner.nextDouble();
        }else{
            contenidoR = 0;
        }
        
        if(presentación == 0){
            presentación = 10;
        }
        if(ortografia == 0){
            ortografia = 10;
        }
        if(vocabulario == 0){
            vocabulario = 10;
        }
        if(caligrafia == 0){
            caligrafia = 10;
        }
        
        System.out.println("Nota final: "+STest.lengua(presentación,ortografia,vocabulario,caligrafia,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
    private static void c2Mates(double contenidoT){
        int presentación, calculo, problemas;
        double contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Calculo: ");
        calculo = scaner.nextInt();
        System.out.print("Problemas: ");
        problemas = scaner.nextInt();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        if(contenidoB != contenidoT){
            System.out.print("Contenido Regular: ");
            contenidoR = scaner.nextDouble();
        }else{
            contenidoR = 0;
        }
        
        if(presentación == 0){
            presentación = 10;
        }
        if(calculo == 0){
            calculo = 10;
        }
        if(problemas == 0){
            problemas = 10;
        }
        
        System.out.println("Nota final: "+STest.matematicas(calculo,problemas,presentación,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
    private static void c2Ciencia(double contenidoT){
        int presentación, ortografia, vocabulario, caligrafia;
        double contenidoB, contenidoR;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Presentación: ");
        presentación = scaner.nextInt();
        System.out.print("Ortografia: ");
        ortografia = scaner.nextInt();
        System.out.print("Contenido Bien: ");
        contenidoB = scaner.nextDouble();
        if(contenidoB != contenidoT){
            System.out.print("Contenido Regular: ");
            contenidoR = scaner.nextDouble();
        }else{
            contenidoR = 0;
        }
        
        if(presentación == 0){
            presentación = 10;
        }
        if(ortografia == 0){
            ortografia = 10;
        }
        
        System.out.println("Nota final: "+STest.naturales(presentación,ortografia,contenidoT,contenidoB,contenidoR,valores));
        
        selecAsig(contenidoT);
    }
    
}
