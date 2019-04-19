package spaces.ricardo.domain;

public class SafetyEquipment {

    private String code;
    private String name;
    private String description;
    private Integer stock;

    private Byte[] image;

    public SafetyEquipment() {
    }

    public SafetyEquipment(String code, String name, String description, Integer stock, Byte[] image) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
