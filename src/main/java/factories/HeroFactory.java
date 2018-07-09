package factories;

import enumeration.ArmorType;
import enumeration.CharacterType;
import enumeration.HelmType;
import enumeration.WeaponType;
import gui.models.ElfModel;
import gui.models.HeroModel;
import gui.models.HunterModel;
import gui.models.KnightModel;
import gui.models.VillagerModel;
import gui.models.WarriorModel;

public class HeroFactory
{
    
    public static HeroModel newHero(String name, String type, int level, int xPoints, int attack, int defense, int hitPoints, String weapon, String armor, String helm, String icon)
    {
        String storeType = type.trim().toLowerCase();
        String temp = "";
        if (hitPoints <= 0)
            hitPoints = 50;

        if (storeType.equals("warrior") == true)
            temp = "warrior";
        else if (storeType.equals("hunter") == true)
            temp = "hunter";
        else if(storeType.equals("elf") == true)
            temp = "elf";
        else if(storeType.equals("knight") == true)
            temp = "knight";
        else if (storeType.equals("villager") == true)
            temp = "villager";
        else
            temp = null;
        
        if (temp != null)
        {
            for (CharacterType etype : CharacterType.values())
            {
                CharacterType tempCharacterType = CharacterType.valueOf(temp);
                HelmType tempHelmType = HelmType.valueOf(helm);
                WeaponType tempWeaponType = WeaponType.valueOf(weapon);
                ArmorType tempArmorType = ArmorType.valueOf(armor);

                int i = 1;
                if (etype.equals(tempCharacterType) == true)
                {
                    switch(tempCharacterType)
                    {
                        case Warrior:
                           return (new WarriorModel(name, etype, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
                        case Elf:
                       return (new ElfModel(name, etype, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
                        case Hunter:
                          return (new HunterModel(name, etype, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
                        case Knight:
                          return (new KnightModel(name, etype, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
                        case Villager:
                            return (new VillagerModel(name, etype, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
                        default:
                            break;
                    }
                }
            }            
        }
        return (null);
    }

    public static HeroModel newHero(String name, String type, String icon)
    {
        int level = 0;
        int xPoints = 0;
        int attack  = 2;
        int defense = 2;
        int hitPoints  = 50;

        String storeType = type.trim().toLowerCase();
        if (icon == null)
            icon = "src/main/java/packages/images/default-image.png";

        CharacterType tempCharacterType = CharacterType.valueOf(storeType);
        HelmType tempHelmType = HelmType.Cap;
        WeaponType tempWeaponType = WeaponType.Flux;
        ArmorType tempArmorType = ArmorType.Warden_of_War;

        switch(tempCharacterType)
        {
            case Warrior:
                return (new WarriorModel(name, tempCharacterType, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
            case Elf:
                return (new ElfModel(name, tempCharacterType, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
            case Hunter:
                return (new HunterModel(name, tempCharacterType, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
            case Knight:
                return (new KnightModel(name, tempCharacterType, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
            case Villager:
                return (new VillagerModel(name, tempCharacterType, level, xPoints, attack, defense, hitPoints, tempWeaponType, tempArmorType, tempHelmType, icon));
            default:
                break;
        }           
        return (null);
    }
}


