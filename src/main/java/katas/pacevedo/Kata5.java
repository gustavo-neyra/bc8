package katas.pacevedo;

public class Kata5 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String Ganador = "";
        while(fighter1.health>0 && fighter2.health>0){
            if(fighter1.name.equals(firstAttacker)){
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if(fighter2.health<=0){
                    Ganador = fighter1.name;
                    break;
                }else{
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    if(fighter1.health<=0){
                        Ganador = fighter2.name;
                        break;
                    }
                }
            }else{
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if(fighter1.health<=0){
                    Ganador = fighter2.name;
                    break;
                }else{
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    if(fighter2.health<=0){
                        Ganador = fighter1.name;
                        break;
                    }
                }

            }
        }
        return Ganador;
    }
}
