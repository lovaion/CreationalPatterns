package Prototype;

public class GestoreDecorazioni {

    private OggettiHalloween decorazione1;

    public GestoreDecorazioni(OggettiHalloween decorazione1) {
        this.decorazione1 = decorazione1;
    }

    public OggettiHalloween creaDecorazione1(){
        OggettiHalloween nuovaDec = decorazione1.cloneMio();
        nuovaDec.getDec().setTipo("Cioccolato");
        return nuovaDec;
    }



}
