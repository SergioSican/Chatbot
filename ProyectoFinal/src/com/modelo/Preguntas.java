
package com.modelo;

/**** @author Guilllermo Marroquin No.Carne: 0900-16-6266*/
/*Este es el modelo de las preguntas con sus respectivo respuestas, id, con su raiz, hijo1, hijo2, hijo3, hijo4.*/
public class Preguntas {
   private int id;//CONTIENE EL ID DE LA PREGUNTA
    private Preguntas Raiz;//CONTIENE LA RAIZ DE LA PREGUNTA
    private Preguntas Hijo1;//CONTIENE EL HIJO 1 DEL OBJETO PREGUNTA
    private Preguntas Hijo2;//CONTIENE EL HIJO 2 DEL OBJETO PREGUNTA
    private Preguntas Hijo3;//CONTIENE EL HIJO 3 DEL OBJETO PREGUNTA
    private Preguntas Hijo4;//CONTIENE EL HIJO 4 DEL OBJETO PREGUNTA
    private String pregunta;//CONTIENE LA PREGUNTA 
    private String Respuesta;//CONTIENE LA RESPUESTA

    public int getId() {//RETORNA EL ID DE LA PREGUNTA
        return id;
    }

    public void setId(int id) {//RECIBE EL ID DE LA PREGUNTA
        this.id = id;
    }
    
    public Preguntas getHijo4() {//CONTIENE EL HIJO 4 DEL OBJETO PREGUNTA
        return Hijo4;
    }

    public void setHijo4(Preguntas Hijo4) {//RECIBE EL HIJO 4 DEL OBJETO PREGUNTA
        this.Hijo4 = Hijo4;
    }
    
    public Preguntas getRaiz() {//RETORNA LA RAIZ
        return Raiz;
    }

    public void setRaiz(Preguntas Raiz) {//RECIBE LA RAIZ DE LA PREGUNTA
        this.Raiz = Raiz;
    }

    public Preguntas getHijo1() {//RETORNA EL HIJO 1 DEL OBJETO PREGUNTA
        return Hijo1;
    }

    public void setHijo1(Preguntas Hijo1) {//RECIBE EL HIJO 1 DEL OBJETO PREGUNTA
        this.Hijo1 = Hijo1;
    }

    public Preguntas getHijo2() {//RETORNA EL HIJO 2 DEL OBJETO PREGUNTA
        return Hijo2;
    }

    public void setHijo2(Preguntas Hijo2) {//RECIBE EL HIJO 2 DEL OBJETO PREGUNTA
        this.Hijo2 = Hijo2;
    }

    public Preguntas getHijo3() {//RETORNA EL HIJO 3 DEL OBJETO PREGUNTA
        return Hijo3;
    }

    public void setHijo3(Preguntas Hijo3) {//RECIBE EL HIJO 3 DEL OBJETO PREGUNTA
        this.Hijo3 = Hijo3;
    }

    public String getPregunta() {//RETORNA LA PREGUNTA DEL OBJETO PREGUNTA
        return pregunta;
    }

    public void setPregunta(String pregunta) {//RECIBE LA PREGUNTA
        this.pregunta = pregunta;
    }

    public String getRespuesta() {//RETORNA LA RESPUESTA
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {//RECIBE LA RESPUESTA
        this.Respuesta = Respuesta;
    }

    @Override
    public int hashCode() {
        return this.id; //Para cambiar el cuerpo de metodo generado, elegir herramienta | plantillas
    }
    
    
   
}
