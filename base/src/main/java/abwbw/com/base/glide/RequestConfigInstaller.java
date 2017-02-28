package abwbw.com.base.glide;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.request.target.SizeReadyCallback;

import abwbw.com.base.option.ConfigInstaller;

/**
 * @autor wangbinwei
 * @since 17-2-28 下午12:08
 */

public class RequestConfigInstaller implements ConfigInstaller<DrawableTypeRequest> {
    @Override
    public boolean install(DrawableTypeRequest installTarget) {
        installTarget.preload(1,1).getSize(new SizeReadyCallback() {
            @Override
            public void onSizeReady(int width, int height) {
                
            }
        });
        return false;
    }
}
