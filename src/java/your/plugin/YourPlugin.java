package your.plugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class YourPlugin extends JavaPlugin {

    public YourPlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }
}
