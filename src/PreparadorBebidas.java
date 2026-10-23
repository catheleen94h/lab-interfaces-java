public class PreparadorBebidas {

    private EquipoCocina equipo1;
    private EquipoCocina equipo2;

    public PreparadorBebidas(EquipoCocina equipo1, EquipoCocina equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    public void prepararDesayuno(EquipoCocina cocina,  EquipoCocina licuadora) {

        System.out.println("Iniciando preparacion del desayuno...");
        equipo1.encender();
        equipo1.preparar();
        equipo2.encender();
        equipo2.preparar();
        System.out.println("Desayuno listo.");
    }
    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        equipo2.apagar();
        equipo2.apagar();
        System.out.println("Equipos apagados.");
    }
}
