package az.turing.adventuregameapp.location;

import az.turing.adventuregameapp.inventory.Armor;
import az.turing.adventuregameapp.inventory.Weapon;
import az.turing.adventuregameapp.player.Player;
import az.turing.adventuregameapp.util.InputUtil;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("You are in the Tool store, where you can buy weapons or armor!");
            System.out.println("--------------------------------------------------------------");
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
                case 1 -> printWeapon();
                case 2 -> printArmor();
                case 3 -> flag = false;
            }
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("Your balance: " + this.getPlayer().getMoney());
        System.out.println("\t\t########WEAPONS########");
        System.out.println("-----------------------------------------");
        for (Weapon weapon : Weapon.weaponList()) {
            System.out.println(weapon);
        }
        System.out.println("-----------------------------------------");
        int weaponId = InputUtil.getInteger("Enter the weaponID:");
        Weapon selectedWeapon = Weapon.getWeaponById(weaponId);
        if (selectedWeapon != null && this.getPlayer().getWeapon().getName().equals(selectedWeapon.getName())) {
            System.out.println("You have already purchased this weapon!");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Your player : " + this.getPlayer());
            System.out.println("---------------------------------------------------------------------");
        } else {
            assert selectedWeapon != null;
            if (selectedWeapon.getPrice() <= this.getPlayer().getMoney()) {
                System.out.println("Your previous weapon: " + this.getPlayer().getWeapon());
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());
                this.getPlayer().setWeapon(selectedWeapon);
                System.out.println("You bought a weapon,your new weapon: " + this.getPlayer().getWeapon());
                this.getPlayer().setDamage(this.getPlayer().getDamage() + selectedWeapon.getDamage());
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Your player : " + this.getPlayer());
                System.out.println("---------------------------------------------------------------------");
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    }

    public void printArmor() {
        System.out.println("Your balance: " + this.getPlayer().getMoney());
        System.out.println("\t\t########ARMORS########");
        System.out.println("-----------------------------------------");
        for (Armor armor : Armor.armorList()) {
            System.out.println(armor);
        }
        System.out.println("-----------------------------------------");
        int armorId = InputUtil.getInteger("Enter the armorID:");
        Armor selectedArmor = Armor.getArmorById(armorId);
        if (selectedArmor != null && this.getPlayer().getArmor().getName().equals(selectedArmor.getName())) {
            System.out.println("You have already purchased this armor!");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Your player : " + this.getPlayer());
            System.out.println("---------------------------------------------------------------------");
        } else {
            assert selectedArmor != null;
            if (selectedArmor.getPrice() <= this.getPlayer().getMoney()) {
                System.out.println("Your previous armor: " + this.getPlayer().getArmor());
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                this.getPlayer().setArmor(selectedArmor);
                System.out.println("You bought armor,your new armor: " + this.getPlayer().getArmor());
                //  this.getPlayer().setDamage(this.getPlayer().getDamage() + selectedWeapon.getDamage());
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Your player : " + this.getPlayer());
                System.out.println("---------------------------------------------------------------------");
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    }
}



