package AndroidUtils;

import android.app.Activity;
import android.content.res.Resources;

public class Utils {
	
	
	
	/**
     * 获取底部虚拟按键高度
     * @param activity
     * @return
     */
    public static int getNavigationBarHeight(Activity activity) {
        return getPixelSizeByName(activity, "navigation_bar_height");
    }

    /**
     * 获取顶部状态栏高度
     * @param activity
     * @return
     */
    public static int getStatusBarHeight(Activity activity) {
        return getPixelSizeByName(activity, "status_bar_height");
    }

    private static int getPixelSizeByName(Activity activity, String name) {
        Resources resources = activity.getResources();
        int resourceId = resources.getIdentifier(name, "dimen", "android");
        if (resourceId > 0) {
            return resources.getDimensionPixelSize(resourceId);
        }
        return 0;
    }

}
