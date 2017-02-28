package abwbw.com.base.model;

import android.graphics.drawable.Drawable;

/**
 * @autor wangbinwei
 * @since 17-2-28 上午10:25
 */

public class ResourceConfig {
    private Drawable resDrawable;
    private int resID;

    public ResourceConfig(Drawable resDrawable){
        this.resDrawable = resDrawable;
    }

    public ResourceConfig(int resID){
        this.resID = resID;
    }

    public Drawable getResourceDrawable() {
        return resDrawable;
    }

    public int getResourceID() {
        return resID;
    }

    public boolean isLegal(){
        if(resDrawable != null){
            return true;
        }

        if(resID != 0){
            return true;
        }

        return false;
    }
}
