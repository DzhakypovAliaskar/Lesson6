package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player(99, 177, "King");
        System.out.println(player.getLevel() + " " + player.getHeight() + " " + player.getName());

        Boss boss = new Boss(95, 186, "Thomas Shelby", 65);
        System.out.println(boss.getLevel() + " " + boss.getHeight() + " " +
                boss.getName() + " " + boss.getNumberOfSubordinates());

        Warrior warrior = new Warrior(73, 190, "Spartacus", 173);
        System.out.println(warrior.getLevel() + " " + warrior.getHeight() + " " +
                warrior.getName() + " " + warrior.getNumberOfFights());

        Magical magical = new Magical(84, 200, "Gandalf", 20);
        System.out.println(magical.getLevel() + " " + magical.getHeight() +
                " " + magical.getName() + " " + magical.getNumberOfSpells() + " ");

        Mental mental = new Mental(64, 167, "Einstein", 91.7, "Home work" );
        System.out.println(mental.getLevel() + " " + mental.getHeight() + " " + mental.getName() + " "
                + mental.getPercentageOfBrainWork() + " " + mental.getPlanName() + " " );

    }

}
