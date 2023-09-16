public class Main {
    public static void main(String[] args) {
       Boss boss = new Boss();
       boss.setHealth(200);
       boss.setDamage(25);
       boss.setProtection("physical");

       System.out.println("ЗДОРОВЬЕ : " + boss.getHealth() + "  " + "УРОН : "  + boss.getDamage() + "  " + "ЗАЩИТА : " + boss.getProtection() );



    }
}