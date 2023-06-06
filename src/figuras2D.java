public class figuras2D {
    int nLados; //numero de lados
    float lado; //longitud del lado
    //constructores
    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }

    public figuras2D(float lado) {
        this.lado = lado;
    }

    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    //setters y getters
    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float areaCuadrado(int lado){
       return this.lado*this.lado;
    };

    public float perimetroCuadrado(){
    return 0;
    };

    public float areaTriangulo(){
        return 0;
    };

    public float perimetroTriangulo(){
        return 0;
    };
}
