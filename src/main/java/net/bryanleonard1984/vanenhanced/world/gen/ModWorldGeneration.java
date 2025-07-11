package net.bryanleonard1984.vanenhanced.world.gen;

public class ModWorldGeneration
{
    public static void generateModWorldGeneration()
    {
        ModOreGeneration.removeOres();
        ModOreGeneration.generateOres();
    }
}
