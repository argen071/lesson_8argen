package kg.geeks.game.general;

import kg.geeks.game.players.Boss;
import kg.geeks.game.players.Hero;
import kg.geeks.game.players.SuperAbility;

public class Spitfire extends Hero {
    private int bonusDamage;
    public Spitfire(String name, int health, int damage) {super(name, health, damage, SuperAbility.BONUS_DAMAGE);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
