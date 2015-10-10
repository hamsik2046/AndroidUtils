package AndroidUtils;

import android.app.Activity;
import android.content.res.Resources;

public class Utils {
	
	
	
	/**
     * ��ȡ�ײ����ⰴ���߶�
     * @param activity
     * @return
     */
    public static int getNavigationBarHeight(Activity activity) {
        return getPixelSizeByName(activity, "navigation_bar_height");
    }

    /**
     * ��ȡ����״̬���߶�
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
