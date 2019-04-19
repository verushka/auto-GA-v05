package spaces.boris.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl.BORIS";
    private static final String NAME = "name";
    private static final String NAME1 = "name1";
    private static final String MARK = "mark";
    private static final String MODEL = "model";
    private static final String PRICE = "price";
    private static final String DESCRIPTION = "description";

    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor() {
        try (FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException fe) {
            throw new RuntimeException(fe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance() {
        if (PropertyAccessor == null) {
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    public int getImplicitTimeWait() {
        return Integer.parseInt(getDataProperty("implicitTimeWait"));
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getExplicitTimeWait() {
        return Integer.parseInt(getDataProperty("explicitTimeWait"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() {
        return getDataProperty(BASE_URL);
    }

    public String getName() {return getDataProperty(NAME);
    }

    public String getName1() {return getDataProperty(NAME1);
    }

    public String getModel() {
        return getDataProperty(MODEL);
    }

    public String getMark() {
        return getDataProperty(MARK);
    }

    public String getPrice() {
        return getDataProperty(PRICE);
    }

    public String getDescription() {
        return getDataProperty(DESCRIPTION);
    }
}
