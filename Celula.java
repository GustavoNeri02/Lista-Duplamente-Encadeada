public class Celula {
    Celula proxima;
    Celula anterior;
    Object elemento;

    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.anterior = null;
        this.elemento = elemento;
    }

    public Celula (Object elemento){
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
