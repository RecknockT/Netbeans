package Enum;

/**
 * @author SashaGameDC@gmail.com
 */
public enum BaseDePalabras {
    
    ALAJA(5001,"alaja"),BALAS(5002,"balas"),COMER(5003,"comer"),DADOS(5004,"dados"),ESTAR(5005,"estar"),FOCAS(5006,"focas"),GASTO(5007,"gasto"),INCAS(5008,"incas"),JEFES(5009,"jefes"),LIJAR(5010,"lijar"),
    MONTE(5011,"monte"),NACER(5012,"nacer"),OBVIO(5013,"obvio"),PELEA(5014,"pelea"),QATAR(5015,"qatar"),RUIDO(5016,"ruido"),SUBIR(5017,"subir"),TABLA(5018,"tabla"),UVADA(5019,"uvada"),VOLAR(5020,"volar"),
    AGUDO(5021,"agudo"),BUENO(5022,"bueno"),CLAVO(5023,"clavo"),DENSO(5024,"denso"),EDEMA(5025,"edema"),FALTO(5026,"falto"),GUSTO(5027,"gusto"),IDEAS(5028,"ideas"),JERGA(5029,"jerga"),LENTO(5030,"lento"),
    MOLER(5031,"moler"),NECIO(5032,"necio"),OIRTE(5033,"oirte"),PINTO(5034,"pinto"),QUEJA(5035,"queja"),REMAR(5036,"remar"),SERIO(5037,"serio"),TERSO(5038,"terso"),UBICA(5039,"ubica"),VERDE(5040,"verde"),
    ALADO(5041,"alado"),BANDA(5042,"banda"),CIEGO(5043,"ciego"),DEJAR(5044,"dejar"),ELIAS(5045,"elias"),FERIA(5046,"feria"),GENES(5047,"genes"),INDIA(5048,"india"),JULIO(5049,"Julio"),LARGO(5050,"largo"),
    METRO(5051,"metro"),NORMA(5052,"norma"),OVULO(5053,"ovulo"),PRIMO(5054,"primo"),QUEMA(5055,"quema"),RIMEL(5056,"rimel"),SUCIO(5057,"sucio"),TONOS(5058,"tonos"),URICO(5059,"urico"),VECES(5060,"veces"),
    ACTOR(5061,"actor"),BUSCA(5062,"busca"),CERCA(5063,"cerca"),DOLAR(5064,"dolar"),ENOJO(5065,"enojo"),FINCA(5066,"finca"),GRITO(5067,"grito"),INFLO(5068,"inflo"),JUSTO(5069,"justo"),LIBRO(5070,"libro"),
    MARCO(5071,"marco"),NOTAS(5072,"notas"),OPERA(5073,"opera"),PARTO(5074,"parto"),QUITO(5075,"quito"),RUBIO(5076,"rubio"),SIETE(5077,"siete"),TORPE(5078,"torpe"),UMBRE(5079,"umbro"),VINOS(5080,"vinos"),
    ABETO(5081,"abeto"),BARCO(5082,"barco"),CABRA(5083,"cabra"),DATOS(5084,"datos"),ELEVO(5085,"elevo"),FUERA(5086,"fuera"),GRAVE(5087,"grave"),ISLAS(5088,"islas"),JUGAR(5089,"jugar"),LISTA(5090,"lista"),
    MANIA(5091,"mania"),NIEVE(5092,"nieve"),OSTRA(5093,"ostra"),PIANO(5094,"piano"),QUEDA(5095,"queda"),RENTA(5096,"renta"),SABIO(5097,"sabio"),TIRAS(5098,"tiras"),URNAS(5099,"urnas"),VENIR(5100,"venir");
    
    private int codigo;
    private String palabra;

    private BaseDePalabras(int codigo, String palabra) {
        this.codigo = codigo;
        this.palabra = palabra;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getPalabra() {
        return palabra;
    }
}