package Service;

import Entidad.Coordenada;
import Entidad.Palabra;
import Entidad.Sopa;
import Enum.BaseDePalabras;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SashaGameDC@gmail.com
 */
public class Service {
    
    private final Scanner leer;
    private final Random rad;
    private final Sopa sopa;
    private final ArrayList<Palabra>lista;
    private final ArrayList<Coordenada>coordenadas;
    
    /**
     * AL INSTANCIAR EL SERVICE SE CREAN LAS HERRAMIENTAS, EL OBJETO SOPA Y LA LISTA DE OBJETOS PALABRA
     */
    public Service() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.rad  = new Random();
        this.sopa = new Sopa();
        this.lista = new ArrayList();
        this.coordenadas = new ArrayList();   
    }
    /**
     * MENU DE INICIO
     */
    public void menu(){
        //SE INGRESA LA DIFICULTAD DEL JUEGO EN EL MANU DE INICIO//
        int auxMenu = 0;
        do{    
            System.out.println("Ingrese la dificultad a jugar\n" + "1)-Facil\n" + "2)-Normal\n" + "3)-Dificil");    
            int dificultad = leer.nextInt();
            if(dificultad==1 || dificultad==2 || dificultad==3){
                auxMenu++;
                sopa.setDificultad(dificultad);
            }
        }while(auxMenu==0);
        //SE PROCEDEN A GENERAR LAS PALABRAS//
        crearPalabras();
        //SEGUN DIFICULTAD, SE INGRESAN LAS PALABRAS//
        cargarPalabras();
        mostrarMatriz();
        
    }
    /**
     * CREAR PALABRAS
     */
    private void crearPalabras(){
        
        //SE CREAN VECTORES PARA GUARDAR LOS VALORES ALEATORIOS QUE SE LE ASIGNARAN A CADA PALABRA//
        //NÚMERO QUE OTORGARÁ EL VALOR STRING DE LA PALABRA//
        int[] alPA = valorAleatorio(12, 100);
        //NÚMERO QUE OTORGARÁ EL VALOR ALEATORIO DE LA FILA//
        int[] alPF = valorAleatorio(12, 20);
        //NÚMERO QUE OTORGARÁ EL VALOR ALEATORIO DE LA COLUMNA//
        int[] alPC = valorAleatorio(12, 15);
        //SE CAMBIA EL VALOR NUMÉRICO POR LA PALABRA CORRESPONDIENTE//
        String[] pa = valorString(12,alPA); 
        //SE CREA LA PALABRA CON SUS VALOR STRING, DE FILA Y COLUMNA//
        for (int i = 0; i < 12; i++) {
            
            Palabra pal = new Palabra();
            pal.setPa(pa[i]);
            pal.setPf(alPF[i]);
            pal.setPc(alPC[i]);
            //SE AGREGA EL OBJETO PARALABRA AL ARRRAYLIST "LISTA"//
            lista.add(pal);
        }
    }
    
    /**
     * SE GENERAN VALORES ALEATORIOS PARA LOS VECTORES ENVIADOS
     * @param cant CANTIDAD DE VALORES A GENERAR
     * @param val VALOR NUMÉRICO MÁXIMO PARA EL RANDOM
     * @return RETORNA EL VECTOR LLENO DE NUMEROS ALEATORIOS
     */    
    public int[] valorAleatorio(int cant, int val){
        
        int[] numall = new int[cant];
        
        for (int i = 0; i < cant; i++) {
            if(i==0){
            numall[i] = rad.nextInt(val);
            }else{
                boolean aux;
                do{
                    aux= false;
                    numall[i] = rad.nextInt(val);
                    for (int j = 0; j < i; j++) {
                       if(numall[j]==numall[i]){
                           aux= true;
                           break;
                       } 
                    }
                }while(aux);
            }
        }
        return numall;   
    }  
    
    /**
     * SEGUN EL VALOR NUMÉRICO, SE BUSCA EL MISMO VALOR EN EL ENUM POR CODIGO
     * @param cant LA CANTIDAD DE PALABRAS A BUSCAR
     * @param val VECTOR DE VALORES NUMÉRICOS
     * @return RETORNA EL VECTOR STRING CON LAS PALABRAS A ENCONTRAR
     */ 
    private String[] valorString(int cant,int[] val){
        
        String[] change = new String[cant]; 
        int auxEnum = 0;
        for (int i = 0; i < cant; i++) {
            auxEnum = val[i]+5000;
            for (BaseDePalabras aux : BaseDePalabras.values()) {
                if(auxEnum==aux.getCodigo()){
                    change[i]=aux.getPalabra();
                }
            }
        }
        return change;
    }
    
    /**
    * SEGÚN LA DIFICULTAD, SE INGRESA LAS PALABRAS EN LA FILA Y COLUMNA CORRESPONDIENTE EN EL ORDEN CORRECTO
    * Izq->Der FACIL, Izq->Der y Arriba->Abajo NORMAL, 4 direcciones DIFICIL  
    */
    private void cargarPalabras(){
        
        switch(sopa.getDificultad()){
            case 1:
                ingresarPalabras(lista.size(),1);
                break;
            case 2:
                sopa.setmFantasma(inicializada());
                ingresarPalabras(6, 1);
                transpuesta();
                sinUso();
                int[] nCoordenadas = valorAleatorio(6, coordenadas.size());
                nuevasCoord(6, 6, nCoordenadas);
                ingresarPalabras(6, 2);
                break;
                
            case 3:
                
                break;
        }
    }
    /**
     * INGRESA LAS PALABRAS CORRESPONDIENTES DENTRO DE LA SOPA DE LETRAS
     * @param cantPal DEPENDIENDO DE LA DIFICULTAD, CAMBIA LA CANTIDAD DE PALABRAS A AINGRESAR
     * @param iniLista INDICA DONDE COMIENZA DENTRO DE LA LISTA DE PALABRAS. 
     */
    private void ingresarPalabras(int cantPal,int iniLista){
        
        String[][]mAux=sopa.getMatriz();
        String[][]mTrs=sopa.getmFantasma();
        
        int aux=0;
        if(iniLista==2){
            aux=6;
        }
        
        for (int i = 0; i < cantPal; i++){
            Palabra x = lista.get(aux);
            String palabra=x.getPa();
            int fila=x.getPf();
            int colu=x.getPc();
            int cont=0;
            for (int j = colu; j < colu+5; j++){
                mAux[fila][j]=palabra.substring(cont,cont+1);
                mTrs[fila][j]="x";
                cont++;
            }
            cont=0;
            aux++;
        }
        
        sopa.setMatriz(mAux);
        sopa.setmFantasma(mTrs);
    }
        
    /**
     * Muestra la sopa de letras en pantalla y las palabras a buscar
     */
    private void mostrarMatriz(){
        
        String[][] aux = sopa.getMatriz();
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                System.out.print("[" + aux[i][j] + "]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < lista.size(); i++) {
            
            System.out.print(lista.get(i).getPa()+" ");  
        }
        System.out.println("");
    }
    
    /**
     * transpone la matriz para colocar palabras en otro sentido
     */
    private void transpuesta(){
        
        String[][] mAux=sopa.getMatriz();
        String[][] mFan=sopa.getmFantasma();
        String[][] aux= inicializada();
        String[][] aux2= inicializada();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                aux[i][j]=mAux[j][i]; 
                aux2[i][j]=mFan[j][i]; 
            }
        }
        sopa.setMatriz(aux);
        sopa.setmFantasma(aux2);
    }
    
    /**
     * INICIA LA MATRIZ DE MARCAS EN ESPACIOS VACIOS
     * @return MATRIZ INICIALIZADA
     */
    private String[][] inicializada(){
        String[][]cero = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                cero[i][j]=" ";
            }
        }
        return cero;
    }
    
    //COMPRUEBA CUANTOS ESPACIOS QUEDAN LIBRES PARA INGRESAR PALABRAS//
    private void sinUso(){
        
        String[][]aux=sopa.getmFantasma();
                
        int cont=0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(aux[i][j].equals(" ")){
                  cont++;  
                    if(cont==5){
                        Coordenada ij = new Coordenada();
                        ij.setFila(i);
                        ij.setColu(j-4);
                        coordenadas.add(ij);
                    }else if(cont==10){
                        Coordenada ij = new Coordenada();
                        ij.setFila(i);
                        ij.setColu(j-4);
                        coordenadas.add(ij);
                    }else if(cont==15){
                        Coordenada ij = new Coordenada();
                        ij.setFila(i);
                        ij.setColu(j-4);
                        coordenadas.add(ij);
                    }else if(cont==20){
                        Coordenada ij = new Coordenada();
                        ij.setFila(i);
                        ij.setColu(j-4);
                        coordenadas.add(ij);
                    }
                }else{
                    cont=0;
                }
            }
            cont=0;
        }
    
    }
    
    /**
     * GENERA COORDENADAS PARA CAMBIAR LOS VALORES DE FILA Y COLUMNA A LAS PALABRAS QUE SE INGRESARAN EN OTRO SENTIDO
     * @param cantPal CANTIDAD DE PALABRAS QUE NECESITAN NUEVAS FILAS
     * @param iniLista VALOR QUE INDICA DONDE TIENE QUE INICIAR A CAMBIAR VALORES DENTRO DE LA LISTA DE PALABRAS
     * @param numeros  SE OBTIENE UN VECTOR CON LOS NÚMEROS QUE CORRESPONDEN A LA UBICACION DE LOS DATOS DENTRO DE LA LISTA
     *  COORDENADAS, QUE ALMACENAN LOS NUEVOS VALORES DE FILA Y COLUMNA.
     */
    private void nuevasCoord(int cantPal, int iniLista, int[] numeros){
        
        int aux=iniLista;
        
        for (int i = 0; i < cantPal; i++) {
            
            int aux2 = numeros[i];
            lista.get(aux).setPf(coordenadas.get(aux2).getFila());
            lista.get(aux).setPc(coordenadas.get(aux2).getColu());
            aux++;
        }
        aux=0;
    }
}