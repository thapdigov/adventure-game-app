package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("---------------------------------------------------------");
        System.out.println("You are in the store, where you can buy weapons or armor!");
        System.out.println("---------------------------------------------------------");
        Integer selectStore = InputUtil.getInteger("""
                Your choice:
                1.Weapon
                2.Armor
                3.Exit
                """);
        while (selectStore < 1 || selectStore > 3) {
            selectStore = InputUtil.getInteger("Invalid input,your choice between 1 and 3");
        }
        switch (selectStore) {
            case 1:
                printWeapon();
                break;
            case 2:
             //   printArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("\t\t########Weapon########");
        System.out.println("-----------------------------------------");
        for (Weapon weapon : Weapon.weaponList()) {
            System.out.println(weapon);
        }
        System.out.println("-----------------------------------------");
        int weaponId = InputUtil.getInteger("Enter the weaponID:");
        Weapon selectedWeapon = Weapon.getWeaponById(weaponId);
        if (selectedWeapon != null && this.getPlayer().getWeapon().getName().equals(selectedWeapon.getName())) {
            System.out.println("You have already purchased this weapon!");
        } else {
            assert selectedWeapon != null;
            if (selectedWeapon.getPrice() <= this.getPlayer().getMoney()) {
                System.out.println("Your previous weapon: " + this.getPlayer().getWeapon());
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());
                this.getPlayer().setWeapon(selectedWeapon);
                System.out.println("You bought a weapon,your new weapon: " + this.getPlayer().getWeapon());
                this.getPlayer().setDamage(this.getPlayer().getDamage() + selectedWeapon.getDamage());
                System.out.println("Your player : " + this.getPlayer());
            } else {
                System.out.println("Insufficient funds!");
            }
        }

    }
}


