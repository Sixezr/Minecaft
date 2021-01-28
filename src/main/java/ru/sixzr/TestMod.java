package ru.sixzr;

import net.minecraftforge.fml.common.Mod;
import ru.sixzr.init.RegisterBlocks;
import ru.sixzr.init.RegisterItem;

@Mod(TestMod.MOD_ID)
public class TestMod {
    public static final String MOD_ID = "testmod";

    public TestMod() {
        RegisterItem.register();
        RegisterBlocks.register();
    }

}
