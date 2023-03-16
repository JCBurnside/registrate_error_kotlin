package example.examplemod

import com.tterrag.registrate.Registrate
import net.minecraftforge.eventbus.api.IEventBus

class MyRegistrate : Registrate(ExampleMod.ID) {
    public override fun registerEventListeners(bus: IEventBus): Registrate {
        return super.registerEventListeners(bus)
    }
}