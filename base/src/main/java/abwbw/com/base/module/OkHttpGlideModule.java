package abwbw.com.base.module;

import android.content.Context;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

public class OkHttpGlideModule implements GlideModule {
    public OkHttpGlideModule() {
    }

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        Log.i("abwbw11","applyOptios");
        // Do nothing.
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory());
        glide.preFillBitmapPool();
    }
}