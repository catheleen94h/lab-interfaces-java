public class Licuadora implements EquipoCocina{

    private boolean encendida = false;
    private int velocidad =1;




    @Override
    public void encender() {
        encendida = true;
        System.out.println("licuadora encendida");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("licuadora apagada");
    }

    @Override
    public void preparar() {
        if (encendida){
            System.out.println("licuando ingredientes a velocidad " + velocidad);

        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && velocidad <5){
            velocidad++;
            System.out.println("velocidad de la licuadora " + velocidad);

        }
    }
}
