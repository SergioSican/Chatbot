
package com.controlador;


import com.modelo.Preguntas;
import com.modelo.DbData;
import java.io.BufferedReader;//adiocional
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**** @author Guilllermo Marroquin No.Carne: 0900-16-6266*/
/*Grupo1*/
/*Es Parte controlador con declaracion de cada objeto perteneciente para cada objetos a utilizar, como tambien la asignacion de las 47 preguntas(BASADO EN EL DIAGRAMA DEL ARBOL MULTIPLE), su busqueda de preguntas, insertar las preguntas no constestadas*/

public class Controlador {
    private Preguntas pregunta;//ESTE SERA LA RAIZ EN DONDE LOS DEMAS PREGUNTAS SE INGRESARAN
    private DbData<Preguntas> dbpregunta;//ESTE SERA EL CONTROLADOR DE DOCUMENTO DE TEXTO PREGUNTAS
    private DbData<String> dbpregunno;//ESCRBIRA LAS PREGUNTAS QUE NO SE CONTESTEN EN UN FICHERO DE TEXTO LLAMADO dbnocontestada.txt en el proyecto
    private String respuesta, pe;//almacenan las preguntas y tambien las respuesta
  
    //ADICIONALES
    private BufferedReader sc;

    //Esta sirve para declararse el constructor con parametros(manualmente) Ejemplo: Controlador c = new Controlador(pregunta, cliente, pedidos,....);

    public Controlador(Preguntas pregunta) {
        this.pregunta = pregunta;
    }
    
    //define y aclara cada uno de los objetos como tambien los controladores de cliente, pregunta, pedidos, cuenta_cliente, menu
    public Controlador(){
        this.pregunta = new Preguntas();//DECLARA EL ARBOL        
        this.dbpregunno = new DbData(String.class, "dbnocontestada.txt");
        this.dbpregunta = new DbData(Preguntas.class, "dbpregunta.txt");
        this.sc = new BufferedReader(new InputStreamReader(System.in));//USADO PARA LEER LAS PREGUNTAS DE LOS USUARIOS
        this.respuesta ="Disculpa no entiendo tu pregunta";
    }
    
    //ESTA FUNCION SE ENCARGA DE CREAR EL ARBOL MANUALMENTE SOLO SE REQUIEREN 56 OBJETOS DE PREGUNTAS (NOTA TOMADO DEL LA ESTRUCTURA DE DATOS EN ARBOL MULTIPLE)
     public void asignacion_pregunta(){
        try {
            pregunta.setId(dbpregunta.getAll().get(0).getId());
            pregunta.setPregunta(dbpregunta.getAll().get(0).getPregunta());//ASIGNACION DE LA PREGUNTA A LA RAIZ DEL ARBOL
            pregunta.setRespuesta(dbpregunta.getAll().get(0).getRespuesta());//ASIGNACION DE LA RESPUESTA A LA RAIZ DEL ARBOL
            pregunta.setHijo1(dbpregunta.getAll().get(1));//ASIGNACION NODO 1 DE LA PREGUNTA Y RESPUESTA (SALUDO) hola
            pregunta.setHijo2(dbpregunta.getAll().get(2));//ASIGNACION NODO 2 DE LA PREGUNTA Y RESPUESTA (MENU) Que puedo hacer
            pregunta.setHijo3(dbpregunta.getAll().get(3));//ASIGNACION NODO 3 DE LA PREGUNTA Y RESPUESTA (NO ENTIENDO) Preguntas No relacionadas
             
            //NODO 1 (SALUDO) hola
            pregunta.getHijo1().setHijo1(dbpregunta.getAll().get(4));//ASIGNACION NODO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA //BUEN DIA
            pregunta.getHijo1().setHijo2(dbpregunta.getAll().get(5));//ASIGNACION NODO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA //HOLA CHATBOT
            pregunta.getHijo1().setHijo3(dbpregunta.getAll().get(6));//ASIGNACION NODO 1 HIJO 3 DE LA PREGUNTA Y RESPUESTA  //BUENOS DIAS
            
            //BUENO DIA
            pregunta.getHijo1().getHijo1().setHijo1(dbpregunta.getAll().get(7));//ASIGNACION NODO 1 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA 
            pregunta.getHijo1().getHijo1().setHijo2(dbpregunta.getAll().get(8));//ASIGNACION NODO 1 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().setHijo3(dbpregunta.getAll().get(9));//ASIGNACION NODO 1 HIJO 1 HIJO 3 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo1().setHijo1(dbpregunta.getAll().get(10));//ASIGNACION NODO 1 HIJO 1 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo1().setHijo2(dbpregunta.getAll().get(11));//ASIGNACION NODO 1 HIJO 1 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo2().setHijo1(dbpregunta.getAll().get(12));//ASIGNACION NODO 1 HIJO 1 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo2().setHijo2(dbpregunta.getAll().get(13));//ASIGNACION NODO 1 HIJO 1 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo3().setHijo1(dbpregunta.getAll().get(14));//ASIGNACION NODO 1 HIJO 1 HIJO 3 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo1().getHijo3().setHijo2(dbpregunta.getAll().get(15));//ASIGNACION NODO 1 HIJO 1 HIJO 3 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            
            //HOLA
            pregunta.getHijo1().getHijo2().setHijo1(dbpregunta.getAll().get(16));//ASIGNACION NODO 1 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA 
            pregunta.getHijo1().getHijo2().setHijo2(dbpregunta.getAll().get(17));//ASIGNACION NODO 1 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().setHijo3(dbpregunta.getAll().get(18));//ASIGNACION NODO 1 HIJO 2 HIJO 3 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo1().setHijo1(dbpregunta.getAll().get(19));//ASIGNACION NODO 1 HIJO 2 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo1().setHijo2(dbpregunta.getAll().get(20));//ASIGNACION NODO 1 HIJO 2 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo2().setHijo1(dbpregunta.getAll().get(21));//ASIGNACION NODO 1 HIJO 2 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo2().setHijo2(dbpregunta.getAll().get(22));//ASIGNACION NODO 1 HIJO 2 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo3().setHijo1(dbpregunta.getAll().get(23));//ASIGNACION NODO 1 HIJO 2 HIJO 3 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo3().setHijo2(dbpregunta.getAll().get(24));//ASIGNACION NODO 1 HIJO 2 HIJO 3 HIJO 2 DE LA PREGUNTA Y RESPUESTA
        
            //BUENOS DIAS
            pregunta.getHijo1().getHijo2().setHijo1(dbpregunta.getAll().get(25));//ASIGNACION NODO 1 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA 
            pregunta.getHijo1().getHijo2().setHijo2(dbpregunta.getAll().get(26));//ASIGNACION NODO 1 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().setHijo3(dbpregunta.getAll().get(27));//ASIGNACION NODO 1 HIJO 1 HIJO 3 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo1().setHijo1(dbpregunta.getAll().get(28));//ASIGNACION NODO 1 HIJO 3 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo1().setHijo2(dbpregunta.getAll().get(29));//ASIGNACION NODO 1 HIJO 3 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo2().setHijo1(dbpregunta.getAll().get(30));//ASIGNACION NODO 1 HIJO 3 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo2().setHijo2(dbpregunta.getAll().get(31));//ASIGNACION NODO 1 HIJO 3 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo3().setHijo1(dbpregunta.getAll().get(32));//ASIGNACION NODO 1 HIJO 3 HIJO 3 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo1().getHijo2().getHijo3().setHijo2(dbpregunta.getAll().get(33));//ASIGNACION NODO 1 HIJO 3 HIJO 3 HIJO 2 DE LA PREGUNTA Y RESPUESTA
        
            //NODO 2 (MENU) Que puedo hacer
            //SON LOS HIJOS DEL NODO 2
            pregunta.getHijo2().setHijo1(dbpregunta.getAll().get(34));//ASIGNACION NODO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA //QUIERO VER MIS ORDENES
            pregunta.getHijo2().setHijo2(dbpregunta.getAll().get(35));//ASIGNACION NODO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA  //QUIERO COMPRAR
            pregunta.getHijo2().setHijo3(dbpregunta.getAll().get(36));//ASIGNACION NODO 2 HIJO 3 DE LA PREGUNTA Y RESPUESTA  //QUIERO CANCELAR MI ORDEN
            pregunta.getHijo2().setHijo4(dbpregunta.getAll().get(37));//ASIGNACION NODO 2 HIJO 4 DE LA PREGUNTA Y RESPUESTA  //QUIERO CONSULTAR
            
            //QUIERO COMPRAR HIJO 2
            pregunta.getHijo2().getHijo2().setHijo1(dbpregunta.getAll().get(38));//ASIGNACION NODO 2 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA 
            pregunta.getHijo2().getHijo2().setHijo2(dbpregunta.getAll().get(39));//ASIGNACION NODO 2 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().setHijo3(dbpregunta.getAll().get(40));//ASIGNACION NODO 2 HIJO 2 HIJO 3 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo1().setHijo1(dbpregunta.getAll().get(41));//ASIGNACION NODO 2 HIJO 2 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo1().setHijo2(dbpregunta.getAll().get(42));//ASIGNACION NODO 2 HIJO 2 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo2().setHijo1(dbpregunta.getAll().get(43));//ASIGNACION NODO 2 HIJO 2 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo2().setHijo2(dbpregunta.getAll().get(44));//ASIGNACION NODO 2 HIJO 2 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo3().setHijo1(dbpregunta.getAll().get(45));//ASIGNACION NODO 2 HIJO 2 HIJO 3 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo2().getHijo3().setHijo2(dbpregunta.getAll().get(46));//ASIGNACION NODO 2 HIJO 2 HIJO 3 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            
            //QUIERO CONSULTAR HIJO 4 
            pregunta.getHijo2().getHijo4().setHijo1(dbpregunta.getAll().get(47));//ASIGNACION NODO 2 HIJO 4 HIJO 1 DE LA PREGUNTA Y RESPUESTA //AL CREDITO
            pregunta.getHijo2().getHijo4().setHijo2(dbpregunta.getAll().get(48));//ASIGNACION NODO 2 HIJO 4 HIJO 2 DE LA PREGUNTA Y RESPUESTA // AL DEBITO
            pregunta.getHijo2().getHijo4().setHijo3(dbpregunta.getAll().get(49));//ASIGNACION NODO 2 HIJO 4 HIJO 3 DE LA PREGUNTA Y RESPUESTA //AL EFECTIVO
            pregunta.getHijo2().getHijo4().getHijo1().setHijo1(dbpregunta.getAll().get(50));//ASIGNACION NODO 2 HIJO 4 HIJO 1 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo4().getHijo1().setHijo2(dbpregunta.getAll().get(51));//ASIGNACION NODO 2 HIJO 4 HIJO 1 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo4().getHijo2().setHijo1(dbpregunta.getAll().get(52));//ASIGNACION NODO 2 HIJO 4 HIJO 2 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo4().getHijo2().setHijo2(dbpregunta.getAll().get(53));//ASIGNACION NODO 2 HIJO 4 HIJO 2 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo4().getHijo3().setHijo1(dbpregunta.getAll().get(54));//ASIGNACION NODO 2 HIJO 4 HIJO 3 HIJO 1 DE LA PREGUNTA Y RESPUESTA
            pregunta.getHijo2().getHijo4().getHijo3().setHijo2(dbpregunta.getAll().get(55));//ASIGNACION NODO 2 HIJO 4 HIJO 3 HIJO 2 DE LA PREGUNTA Y RESPUESTA
            
            
            //NOTA HIJO 1(QUIERO VER MIS PEDIDOS) Y HIJO 3(QUIERO CANCELAR MI ORDEN) SON MANEJADOS POR UNA FUNCION
            
            //LA ESTRUCTURA DEL GSON TXT:
                /* EJEMPLO DE ESTRUCTURA DEL OBJETO
            { "Raiz":"null", "Hijo1":"null", "Hijo2":null, "Hijo3":null, "Hijo4":null, "pregunta": "Hola", "respuesta":"Hola"}
            
            
            NOTA: NO TIENE QUE TENER ? ¿ ¡ ! , en las respuesta o preguntas
            */
            

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    //ESTO ESTA BASADO EN RECORRIDO DE PREORDEN DE UN ARBOL: RAIZ>HIJOIZQUIERDA>HIJODERECHA SOLO QUE CON MAS HIJOS
    //EJEMPLO RAIZ>HIJO1>HIJO2>HIJO3>HIJO4
    //EL SE ENCARGA DE BUSCAR LA PREGUNTA EN TODO EL ARBOL POR ESO NO TIENE QUE EXISTIR NINGUNA PREGUNTA REPETIDA IDENTICADA EN LA ESTRUCTURA DE DATOS
    public void bus_(String d, Preguntas pregunt){//SIEMPRE SE DECLARA LA PREGUNTA Y EL ARBOL
        pe=d;
        String aux;//SERA USADO COMO AUXILIAR PARA INTRODUCIR LAS PREGUNTAS DEL ARBOL MULTIPLE
        if(pregunt==null){//DETERMINA SI EL NODO NO ES NULO //NO SE RECOMIENDA MODIFICAR PARA NO ALTERAR LA BUSQUEDA DE LA PREGUNTA
        return;//NO SE RECOMIENDA MODIFICAR
        }
        
        bus_(d, pregunt.getHijo1());//COMIENZA A BUSCAR EN EL HIJO1 //NO SE RECOMIENDA MODIFICAR PARA NO ALTERAR LA BUSQUEDA DE LA PREGUNTA
        aux = pregunt.getPregunta();//AUXILIAR RECIBE LA PREGUNTA
        if(pregunt.getPregunta()!=null){//EMPIEZA A COMPRAR QUE NO SEA NULO
        if(aux.equals(d)){respuesta = pregunt.getRespuesta(); System.out.println(respuesta);}}//COMPARA PARA COMPROBAR SI LA PREGUNTA ES LA MISMA QUE LA QUE ESCRIBIO EL CLIENTE
       
        bus_(d, pregunt.getHijo2());//COMIENZA A BUSCAR EN EL HIJO2 //NO SE RECOMIENDA MODIFICAR PARA NO ALTERAR LA BUSQUEDA DE LA PREGUNTA
        bus_(d, pregunt.getHijo3());//COMIENZA A BUSCAR EN EL HIJO3 //NO SE RECOMIENDA MODIFICAR PARA NO ALTERAR LA BUSQUEDA DE LA PREGUNTA
        bus_(d, pregunt.getHijo4());//COMIENZA A BUSCAR EN EL HIJO4 //NO SE RECOMIENDA MODIFICAR PARA NO ALTERAR LA BUSQUEDA DE LA PREGUNTA
      
   
    }
    
    //LAS PREGUNTAS QUE NO SEAN ENCONTRADAS EL LAS AGREGARA EN UN FICHERO DE TEXTO PARA ALMACENARLAS
    public void designar_nopregunta() throws IOException{
       if((respuesta.equals("Disculpa no entiendo tu pregunta"))){//REVISA SI LA PREGUNTA NO ESTA VACIA Y QUE LA RESPUESTA DIGA LO DEL TEXTO
            this.dbpregunno.add(pe);//AÑADE EN UN ARCHIVO DE dbnocontestada
            System.out.println(respuesta);
       }
       
   }
    
    
    //NOTA LO BUSCARA EN LA LISTA DE PREGUNTAS BASADO EN EL DIAGRAMA DE ARBOL MULTIPLE ANEXADO (PUESTO COMO EJEMPLO DE SU FUNCIONAMIENTO)
    public void operation_() throws IOException{//OPERA LOS DATOS
        String a;
       this.asignacion_pregunta();//CREAR EL ARBOL MULTPLE
       
      do{
          this.respuesta="Disculpa no entiendo tu pregunta";
        System.out.println("Bienvenido ingrese pregunta");//INFORMA AL USUARIO INGRESAR UNA PREGUNTA
           
                a= sc.readLine();//RECIBE LA PREGUNTA DESCRITA POR EL USUARIO
           
        bus_(a, pregunta);//BUSCA LA PALBRA EN LA BUSQUEDA
        this.designar_nopregunta();
       }while((a.equals("OK"))==false);//CONDICIONAR HASTA LLEGAR HASTA LA PALABRA OK SEGUIRA CORRIENDO
    
    }
    
}

