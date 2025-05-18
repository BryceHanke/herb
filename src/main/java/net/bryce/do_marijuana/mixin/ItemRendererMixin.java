package net.bryce.do_marijuana.mixin;


import net.bryce.do_marijuana.Lets_do_marijuana;
import net.bryce.do_marijuana.item.ModItems;
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
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "jar_model", "inventory"));
        }

        if (stack.isOf(ModItems.OG_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.OG_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "cured_jar_model", "inventory"));
        }

        if (stack.isOf(ModItems.GDP_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.GDP_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "cured_jar_model", "inventory"));
        }

        if (stack.isOf(ModItems.RP_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_LIT_JOINT) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "lit_joint_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_JAR_OF_TRIMMED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "trimmed_jar_model", "inventory"));
        }
        if (stack.isOf(ModItems.RP_JAR_OF_CURED) && renderMode != ModelTransformationMode.GUI) {
            return ((net.bryce.do_marijuana.mixin.ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Lets_do_marijuana.MOD_ID, "cured_jar_model", "inventory"));
        }

        return value;
    }
}