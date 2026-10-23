import java.util.ArrayList;
import java.util.List;

public class PreparadorBebidasV2 {

    private List<EquipoCocina> equipos;


    public PreparadorBebidasV2(List<EquipoCocina> equipos) {
        this.equipos = equipos;
    }
    public void prepararDesayuno() {

        System.out.println("Iniciando preparacion del desayuno...");
        for(EquipoCocina equipo: equipos){
        equipo.encender();
        equipo.preparar();
        System.out.println("Desayuno listo.");
    }}
    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        for(EquipoCocina equipo: equipos){
        equipo.apagar();
        System.out.println("Equipos apagados.");
    }}
}