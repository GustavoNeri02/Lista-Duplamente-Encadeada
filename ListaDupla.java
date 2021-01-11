public class ListaDupla {
    Celula primeira;
    Celula ultima;
    int totalElementos = 0;

    boolean posicaoOcupada(int posicao){
        return (posicao >= 0)&&(posicao < this.totalElementos);
    }

    Celula pegaCelula(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao nao existe");
        }else{
            Celula atual = this.primeira;
            for(int i=0; i < posicao; i++){
                atual = atual.getProxima();
            }
            return atual;
        }
    }

    Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    void adicionaNoComeco(Object elemento){
        if(this.totalElementos == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalElementos++;
    }

    void adiciona(Object elemento){
        if(this.totalElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalElementos++;
        }
    }

    void adiciona(int posicao, Object elemento){
        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        }else if(posicao == this.totalElementos){
            this.adiciona(elemento);
        }else {
            Celula anterior = this.pegaCelula(posicao-1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalElementos++;
        }
    }

    void adicionaFim(Object elemento){
        if(this.totalElementos == 0) {
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(null, elemento);
            nova.setAnterior(this.ultima);
            nova.setProxima(null);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalElementos++;
        }
    }

    void removedoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalElementos--;
        }
        if(this.totalElementos == 0){
            this.ultima = null;
        }
    }

    void removedoFim(){
        if(!this.posicaoOcupada(totalElementos-1)){
            throw new IllegalArgumentException("Posicao nao existe");
        }else{
            if(this.totalElementos == 1){
                this.removedoComeco();
            }else{
                Celula penultima = this.ultima.getAnterior();
                penultima.setProxima(null);
                this.ultima = penultima;
                this.totalElementos--;
            }
        }
    }

    void remove(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            if (pos == 0){
            this.removedoComeco();
            }else if(pos == this.totalElementos -1){
                this.removedoFim();
            }else {
                Celula anterior = this.pegaCelula(pos -1);
                Celula atual = anterior.getProxima();
                Celula proxima = atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                this.totalElementos--;
            }
        }
    }

    boolean contem(Object elemento){
        Celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = atual.getProxima();
        }
        return false;
    }

    int tamanho(){
        return(this.totalElementos);
    }

    void esvaziaLista(){
        this.primeira = null;
        this.ultima = null;
        this.totalElementos = 0;
    }

    String imprimir(){
        if(this.totalElementos == 0){
            return("[]");
        }else{
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.primeira;
            for(int i=0; i < this.totalElementos -1; i++){
                builder.append(((Paciente) atual.getElemento()).getNome());
                builder.append(", ");
                atual = atual.getProxima();
            }
            builder.append(((Paciente) atual.getElemento()).getNome());
            builder.append("]");
            return(builder.toString());
        }
    }


    public Celula getPrimeira() {
        return primeira;
    }

    public void setPrimeira(Celula primeira) {
        this.primeira = primeira;
    }

    public Celula getUltima() {
        return ultima;
    }

    public void setUltima(Celula ultima) {
        this.ultima = ultima;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void setTotalElementos(int totalElementos) {
        this.totalElementos = totalElementos;
    }
}
