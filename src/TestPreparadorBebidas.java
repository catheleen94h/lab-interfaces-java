public class TestPreparadorBebidas {
    public static void main(String[] args) {
        EquipoCocina cafetera1 = new Cafetera();
        EquipoCocina licuadora1 = new Licuadora();

        PreparadorBebidas preparador1 = new PreparadorBebidas(cafetera1, licuadora1);

        preparador1.prepararDesayuno();
        preparador1.apagarTodo();

        EquipoCocina maquinaTe = new MaquinaTe();
        EquipoCocina exprimidor = new Exprimidor();
        PreparadorBebidas preparador2 = new PreparadorBebidas(maquinaTe, exprimidor);

        preparador2.prepararDesayuno();
        preparador2.apagarTodo();

        EquipoCocina cafeteraPrincipal = new Cafetera();
        EquipoCocina cafeteraSecundaria = new Cafetera();
        PreparadorBebidas preparador3 = new PreparadorBebidas(cafeteraPrincipal, cafeteraSecundaria);

        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }
}
