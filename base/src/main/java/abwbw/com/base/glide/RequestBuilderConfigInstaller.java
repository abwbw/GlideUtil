package abwbw.com.base.glide;

import com.bumptech.glide.DrawableRequestBuilder;

import abwbw.com.base.option.ConfigInstaller;

/**
 * @autor wangbinwei
 * @since 17-2-28 下午3:28
 */

public class RequestBuilderConfigInstaller implements ConfigInstaller<RequestBuilderOptions, DrawableRequestBuilder<String>> {

    @Override
    public boolean install(RequestBuilderOptions config, DrawableRequestBuilder<String> installTarget) {

        return false;
    }
}
