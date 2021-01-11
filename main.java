public class main {
    public static void main (String[] args){
        ListaDupla lista = new ListaDupla();
        Paciente homer = new Paciente("Homer Simpson", (byte) 48, 'm');
        Paciente marge = new Paciente("Marge Simpson", (byte) 45, 'f');
        Paciente bart = new Paciente("Bart Simpson", (byte) 10, 'm');
        Paciente lisa = new Paciente("Lisa Simpson", (byte) 9, 'f');
        Paciente maggie = new Paciente("Maggie", (byte) 1, 'f');
        Paciente camila = new Paciente("Camila", (byte) 18, 'f');
        Paciente jose = new Paciente("Jose", (byte) 19, 'm');
        Paciente burns = new Paciente("Sr. Burns", (byte) 47, 'm');

        System.out.println("----1----");
        lista.adiciona(homer);
        lista.adiciona(marge);
        System.out.println(lista.imprimir());

        System.out.println("----2----");
        lista.esvaziaLista();
        System.out.println(lista.imprimir());

        System.out.println("----3----");
        lista.adiciona(homer);
        lista.adiciona(0,bart);
        lista.adiciona(1,camila);
        System.out.println(lista.imprimir());

        System.out.println("----4----");
        lista.esvaziaLista();

        System.out.println("----5----");
        lista.adiciona(homer);
        lista.adiciona(bart);
        lista.adicionaNoComeco(lisa);
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----6----");
        lista.esvaziaLista();
        System.out.println(lista.imprimir());

        System.out.println("----7----");
        lista.adiciona(homer);
        lista.adiciona(maggie);
        lista.adiciona(0, bart);
        lista.adiciona(1,marge);
        System.out.println(lista.imprimir());
        System.out.println("Lisa esta na lista? "+lista.contem(lisa));

        System.out.println("----8----");
        lista.esvaziaLista();

        System.out.println("----9----");
        lista.adiciona(homer);
        lista.adiciona(bart);
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----10----");
        System.out.println("Marge esta na lista? "+lista.contem(marge));
        System.out.println("Homer esta na lista? "+lista.contem(homer));
        System.out.println("Bart esta na lista? "+lista.contem(bart));
        System.out.println("Maggie esta na lista? "+lista.contem(maggie));
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----11----");
        lista.esvaziaLista();

        System.out.println("----12----");
        lista.adicionaNoComeco(homer);
        lista.adicionaNoComeco(bart);
        lista.adiciona(marge);
        lista.adiciona(1,maggie);
        lista.adicionaNoComeco(jose);
        lista.adicionaFim(burns);
        System.out.println(lista.imprimir());

        System.out.println("----13----");
        lista.removedoFim();
        System.out.println(lista.imprimir());

        System.out.println("----14----");
        lista.remove(1);
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----15----");
        System.out.println("Marge esta na lista? "+lista.contem(marge));
        System.out.println("Homer esta na lista? "+lista.contem(homer));
        System.out.println("Bart esta na lista? "+lista.contem(bart));
        System.out.println("Maggie esta na lista? "+lista.contem(maggie));
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----16----");
        lista.removedoComeco();
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----17----");
        System.out.println("Marge esta na lista? "+lista.contem(marge));
        System.out.println("Homer esta na lista? "+lista.contem(homer));
        System.out.println("Bart esta na lista? "+lista.contem(bart));
        System.out.println("Maggie esta na lista? "+lista.contem(maggie));
        System.out.println(lista.imprimir());
        System.out.println("Tamanho: "+lista.tamanho());

        System.out.println("----18----");
        lista.esvaziaLista();
        System.out.println(lista.imprimir());




    }


}
