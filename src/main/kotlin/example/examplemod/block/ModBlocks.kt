package example.examplemod.block

import com.tterrag.registrate.Registrate
import example.examplemod.ExampleMod
import example.examplemod.ExampleMod.REGISTRATE
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.registerObject

object ModBlocks {
    fun register() {
    }
    val MY_BLOCK = REGISTRATE
        .block<SampleBlock>("sample",::SampleBlock)
        .register()

    val MY_BLOCK_ENTITY = REGISTRATE
        .blockEntity<SampleBlockEntity>("sample_entity",::SampleBlockEntity)
        .register()
}