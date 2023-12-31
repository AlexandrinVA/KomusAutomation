package сonfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
        protected static FileInputStream fileInputStream;
        protected static Properties properties;

        static {
            try {
                //указание пути до файла с настройками
                fileInputStream = new FileInputStream("src/test/resources.properties");
                properties = new Properties();
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
                //обработка возможного исключения (нет файла и т.п.)
            } finally {
                if (fileInputStream != null)
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }

        public static String getProperty(String key) {
            return properties.getProperty(key);
        }

    }

