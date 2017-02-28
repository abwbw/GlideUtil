package abwbw.com.base.glide;

import android.graphics.drawable.Drawable;

import abwbw.com.base.model.ResourceConfig;

/**
 * @autor wangbinwei
 * @since 17-2-28 上午10:25
 */

public class PlaceholderConfig {
    private ResourceConfig mFallResource;
    private ResourceConfig mErrorResource;
    private ResourceConfig mLoadResource;

    private PlaceholderConfig(){}

    private void setFallResource(ResourceConfig config){
        mFallResource = config;
    }

    private void setErrorResource(ResourceConfig config){
        mErrorResource = config;
    }

    private void setLoadResource(ResourceConfig config){
        mLoadResource = config;
    }

    public Drawable getFallResourceDrawable(){
        return mFallResource == null?null:mFallResource.getResourceDrawable();
    }

    public int getFallResourceID(){
        return mFallResource == null?0:mFallResource.getResourceID();
    }

    public Drawable getErrorResourceDrawable(){
        return mErrorResource == null?null:mErrorResource.getResourceDrawable();
    }

    public int getErrorResourceID(){
        return mErrorResource == null?0:mErrorResource.getResourceID();
    }

    public Drawable getLoadResourceDrawable(){
        return mLoadResource == null?null:mLoadResource.getResourceDrawable();
    }

    public int getLoadResourceID(){
        return mLoadResource == null?0:mLoadResource.getResourceID();
    }

    public static class Definer {
        private final PlaceholderConfig config;

        public Definer(){
            config = new PlaceholderConfig();
        }

        public Definer setFallResouceDrawable(Drawable drawable){
            config.setFallResource(new ResourceConfig(drawable));
            return this;
        }

        public Definer setFallResouceID(int resouceID){
            config.setFallResource(new ResourceConfig(resouceID));
            return this;
        }

        public Definer setErrorResourceDrawable(Drawable drawable){
            config.setErrorResource(new ResourceConfig(drawable));
            return this;
        }

        public Definer setErrorResourceID(int resourceID){
            config.setErrorResource(new ResourceConfig(resourceID));
            return this;
        }

        public Definer setLoadResourceDrawable(Drawable drawable){
            config.setLoadResource(new ResourceConfig(drawable));
            return this;
        }

        public Definer setLoadResourceID(int resourceID){
            config.setLoadResource(new ResourceConfig(resourceID));
            return this;
        }

        public PlaceholderConfig define(){
            return config;
        }
    }
}
