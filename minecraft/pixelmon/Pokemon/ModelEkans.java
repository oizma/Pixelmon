// Date: 25/06/2012 11:06:13 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelEkans extends ModelBase {
	// field
	
	ModelRenderer BODY1;
	ModelRenderer BODY2;
	ModelRenderer BODY3;
	ModelRenderer BODY4;
	ModelRenderer BODY5;
	ModelRenderer BODY6;
	ModelRenderer BODY7;
	ModelRenderer TAIL;
    ModelRenderer HEADBASE;
	ModelRenderer BottomMouth;
  
    public ModelEkans()
    {
      textureWidth = 64;
      textureHeight = 128;
      
      HEADBASE = new ModelRenderer(this, "HEADBASE");
      HEADBASE.setRotationPoint(0F, 20F, -18.5F);
      setRotation(HEADBASE, 0F, 0F, 0F);
      HEADBASE.mirror = true;
        ModelRenderer Head3 = new ModelRenderer(this, 0, 79);
        Head3.addBox(-2.5F, 0F, -4F, 5, 3, 4);
        Head3.setRotationPoint(0F, -1F, -3.5F);
        Head3.setTextureSize(64, 128);
        Head3.mirror = true;
        setRotation(Head3, 0F, 0F, 0F);
        ModelRenderer Head1 = new ModelRenderer(this, 0, 90);
        Head1.addBox(-2.5F, -2F, -4F, 5, 5, 4);
        Head1.setRotationPoint(0F, -1F, 0.5F);
        Head1.setTextureSize(64, 128);
        Head1.mirror = true;
        setRotation(Head1, 0F, 0F, 0F);
        ModelRenderer BottomMouth = new ModelRenderer(this, 1, 33);
        BottomMouth.addBox(0F, 0F, -6F, 5, 1, 8);
        BottomMouth.setRotationPoint(-2.5F, 1.4F, -1F);
        BottomMouth.setTextureSize(64, 128);
        BottomMouth.mirror = true;
        setRotation(BottomMouth, 0.2883408F, 0F, 0F);
        ModelRenderer Head2 = new ModelRenderer(this, 0, 110);
        Head2.addBox(-2F, 0F, -4F, 4, 3, 4);
        Head2.setRotationPoint(0F, -2.6F, -3.5F);
        Head2.setTextureSize(64, 128);
        Head2.mirror = true;
        setRotation(Head2, 0.4089647F, 0F, 0F);
        
        HEADBASE.addChild(BottomMouth);
        HEADBASE.addChild(Head1);
        HEADBASE.addChild(Head2);
        HEADBASE.addChild(Head3);
        
      BODY1 = new ModelRenderer(this, "BODY1");
      BODY1.setRotationPoint(0F, 20F, -18.5F);
      setRotation(BODY1, 0F, 0F, 0F);
      BODY1.mirror = true;
        ModelRenderer body1 = new ModelRenderer(this, 40, 118);
        body1.addBox(-2F, 0F, 0F, 4, 4, 6);
        body1.setRotationPoint(0F, -1.8F, 0.6F);
        body1.setTextureSize(64, 128);
        body1.mirror = true;
        setRotation(body1, -0.3316126F, 0F, 0F);
      BODY2 = new ModelRenderer(this, "BODY2");
      BODY2.setRotationPoint(0F, 2F, 5F);
      setRotation(BODY2, 0F, 0F, 0F);
      BODY2.mirror = true;
        ModelRenderer body2 = new ModelRenderer(this, 0, 62);
        body2.addBox(-2F, 0F, 0F, 4, 4, 7);
        body2.setRotationPoint(0F, -2F, 0F);
        body2.setTextureSize(64, 128);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
      BODY3 = new ModelRenderer(this, "BODY3");
      BODY3.setRotationPoint(0F, 0F, 6F);
      setRotation(BODY3, 0F, 0F, 0F);
      BODY3.mirror = true;
        ModelRenderer body3 = new ModelRenderer(this, 0, 62);
        body3.addBox(-2F, 0F, 0F, 4, 4, 8);
        body3.setRotationPoint(0F, -2F, 0F);
        body3.setTextureSize(64, 128);
        body3.mirror = true;
        setRotation(body3, 0F, 0F, 0F);
      BODY4 = new ModelRenderer(this, "BODY4");
      BODY4.setRotationPoint(0F, 0F, 7F);
      setRotation(BODY4, 0F, 0F, 0F);
      BODY4.mirror = true;
        ModelRenderer body4 = new ModelRenderer(this, 0, 62);
        body4.addBox(-2F, 0F, 0F, 4, 4, 8);
        body4.setRotationPoint(0F, -2F, 0F);
        body4.setTextureSize(64, 128);
        body4.mirror = true;
        setRotation(body4, 0F, 0F, 0F);
      BODY5 = new ModelRenderer(this, "BODY5");
      BODY5.setRotationPoint(0F, 0F, 7F);
      setRotation(BODY5, 0F, 0F, 0F);
      BODY5.mirror = true;
        ModelRenderer  body5 = new ModelRenderer(this, 0, 62);
        body5.addBox(-2F, 0F, 0F, 4, 4, 8);
        body5.setRotationPoint(0F, -2F, 0F);
        body5.setTextureSize(64, 128);
        body5.mirror = true;
        setRotation(body5, 0F, 0F, 0F);
      BODY6 = new ModelRenderer(this, "BODY6");
      BODY6.setRotationPoint(0F, 0F, 7F);
      setRotation(BODY6, 0F, 0F, 0F);
      BODY6.mirror = true;
        ModelRenderer  body6 = new ModelRenderer(this, 0, 62);
        body6.addBox(-2F, 0F, 0F, 4, 4, 8);
        body6.setRotationPoint(0F, -2F, 0F);
        body6.setTextureSize(64, 128);
        body6.mirror = true;
        setRotation(body6, 0F, 0F, 0F);
      BODY7 = new ModelRenderer(this, "BODY7");
      BODY7.setRotationPoint(0F, 0F, 7F);
      setRotation(BODY7, 0F, 0F, 0F);
      BODY7.mirror = true;
        ModelRenderer  body7 = new ModelRenderer(this, 0, 42);
        body7.addBox(-1.5F, 0F, 0F, 3, 3, 4);
        body7.setRotationPoint(0F, -1.5F, 0F);
        body7.setTextureSize(64, 128);
        body7.mirror = true;
        setRotation(body7, 0F, 0F, 0F);
      TAIL = new ModelRenderer(this, "TAIL");
      TAIL.setRotationPoint(0F, 0F, 3F);
      setRotation(TAIL, 0F, 0F, 0F);
      TAIL.mirror = true;
        ModelRenderer  tail2 = new ModelRenderer(this, 0, 0);
        tail2.addBox(-0.5F, 0F, 0F, 1, 1, 2);
        tail2.setRotationPoint(0F, -0.5F, 2.5F);
        tail2.setTextureSize(64, 128);
        tail2.mirror = true;
        setRotation(tail2, 0F, 0F, 0F);
        ModelRenderer  tail1 = new ModelRenderer(this, 0, 14);
        tail1.addBox(-1F, 0F, 0F, 2, 2, 3);
        tail1.setRotationPoint(0F, -1F, 0F);
        tail1.setTextureSize(64, 128);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        ModelRenderer  tail3 = new ModelRenderer(this, 0, 14);
        tail3.addBox(0F, 0F, 0F, 1, 1, 1);
        tail3.setRotationPoint(-0.5F, -0.5F, 4.5F);
        tail3.setTextureSize(64, 128);
        tail3.mirror = true;
        setRotation(tail3, -0.0743572F, 0F, 0F);
        
        BODY1.addChild(body1);
        BODY1.addChild(BODY2);
        BODY2.addChild(body2);
        BODY2.addChild(BODY3);
        BODY3.addChild(body3);
        BODY3.addChild(BODY4);
        BODY4.addChild(body4);
        BODY4.addChild(BODY5);
        BODY5.addChild(body5);
        BODY5.addChild(BODY6);
        BODY6.addChild(body6);
        BODY6.addChild(BODY7);
        BODY7.addChild(body7);
        BODY7.addChild(TAIL);
        TAIL.addChild(tail1);
        TAIL.addChild(tail2);
        TAIL.addChild(tail3);
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5);
      HEADBASE.render(f5);
      BODY1.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }

  }
