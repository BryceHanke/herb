package net.bryce.herb.mixin;


import net.bryce.herb.Herb;
import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useJoint(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.JAR) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "jar_model", "inventory"));
        }

        for (Identifier strain : Strains.strains)
        {
            if (stack.isOf(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_joint"))) && renderMode != ModelTransformationMode.GUI)
            {
                return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "joint_model", "inventory"));
            }
            if (stack.isOf(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_lit_joint"))) && renderMode != ModelTransformationMode.GUI)
            {
                return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "lit_joint_model", "inventory"));
            }
            if (stack.isOf(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_jar_of_trimmed"))) && renderMode != ModelTransformationMode.GUI)
            {
                return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "trimmed_jar_model", "inventory"));
            }
            if (stack.isOf(Registries.ITEM.get(new Identifier("herb", String.valueOf(strain.getPath())+"_jar_of_cured"))) && renderMode != ModelTransformationMode.GUI)
            {
                return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "cured_jar_model", "inventory"));
            }
        }
        return value;
    }
}