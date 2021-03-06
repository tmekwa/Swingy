package gui.models;

import enumeration.ArmorType;
import enumeration.CharacterType;
import enumeration.HelmType;
import enumeration.WeaponType;
import interfaces.IHero;

public class KnightModel extends HeroModel implements IHero
{
    public KnightModel(String name, CharacterType type, int level, int xPoints, int attack, int defense, int hitPoints, WeaponType weapon, ArmorType armor, HelmType helm, String icon)
	{
        super(name,  type, level, xPoints, attack, defense, hitPoints, weapon, armor, helm, icon);
    }
}