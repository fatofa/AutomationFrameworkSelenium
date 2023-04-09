package hoavd.helpers;

import java.io.File;

public class Helpers {


    /**
     * @return lấy đường dẫn đến thư mục nguồn source mình có thêm dấu / ở cuối luôn
     */
    public static String getCurrentDir() {
        String current = System.getProperty("user.dir") + File.separator;
        return current;
    }
}
