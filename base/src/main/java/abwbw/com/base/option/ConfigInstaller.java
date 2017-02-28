package abwbw.com.base.option;

/**
 * @autor wangbinwei
 * @since 17-2-28 上午10:20
 */

public interface ConfigInstaller<C, T> {
    boolean install(C config, T installTarget);
}
