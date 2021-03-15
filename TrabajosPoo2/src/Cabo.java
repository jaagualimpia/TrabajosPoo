public class Cabo extends SoldadoEjercito{
    protected final static boolean pensionPrematura = true;
    protected boolean pension35;

    public Cabo() {
        super();
        this.edad = edad;
    }

    private void tienePension(){
        if(edad >= 35){
            pension35 = true;
        }else{
            pension35 = false;
        }
    }
}


