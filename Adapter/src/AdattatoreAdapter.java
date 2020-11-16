public class AdattatoreAdapter extends Presa implements AdattatorePresa {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertiVolt(v,10);
    }
    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertiVolt(v, 40);
    }

    private Volt convertiVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }


}
