package net.bryce.herb.mixin;


import net.bryce.herb.Herb;
import net.bryce.herb.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
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

        if (stack.isOf(ModItems.OG_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "cured_jar_model", "inventory"));
        }

        if (stack.isOf(ModItems.GDP_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "cured_jar_model", "inventory"));
        }

        if (stack.isOf(ModItems.RP_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.herb.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Herb.MOD_ID, "cured_jar_model", "inventory"));
        }

        return value;
    }
}