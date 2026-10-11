package justduck.continuumcombat;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ContinuumCombat.MOD_ID)
public class ContinuumCombat {
    public static final String MOD_ID = "continuum_combat";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ContinuumCombat(IEventBus modEventBus) {
        LOGGER.info("Continuum Combat initialized - Better Combat compatibility for Continuum Construct");
    }
}
