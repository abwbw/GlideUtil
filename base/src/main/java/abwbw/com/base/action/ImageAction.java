package abwbw.com.base.action;

import android.content.Context;
import android.widget.ImageView;

import abwbw.com.base.glide.RequestBuilderOptions;

/**
 * @autor wangbinwei
 * @since 17-2-28 上午10:19
 */

public interface ImageAction {
    void loadImage(Context context, String url, ImageView targetView);
    void loadImage(Context context, String url, ImageView targetView, RequestBuilderOptions options);
}
