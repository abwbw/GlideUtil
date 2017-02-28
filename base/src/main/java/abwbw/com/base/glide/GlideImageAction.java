package abwbw.com.base.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import abwbw.com.base.action.ImageAction;

/**
 * Glide-> RequestManager-> Request ------------------------------------------------------> Target
 *                           |                                                                 ^
 *                           |                                                                 |
 *                           -----------------------> RequestBuilder----------------------------
 *                           |                   ^           ^        |
 *                           |                   |           |        |
 *                           |                   |           |        |
 *                           |                   |           ----------
 *                           |                   |
 *                           |                   |
 *                           --> GifTypeRequest---
 *                                   ^         |
 *                                   |         |
 *                                   |         |
 *                                   -----------
 *
 * @autor wangbinwei
 * @since 17-2-28 上午10:19
 */

public class GlideImageAction implements ImageAction {
    @Override
    public void loadImage(Context context, String url, ImageView targetView) {
        Glide.with(context).load("");
    }

    @Override
    public void loadImage(Context context, String url, ImageView targetView, RequestBuilderOptions options) {

    }
}
