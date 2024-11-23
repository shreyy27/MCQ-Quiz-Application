package database;

// data model to represent data from category table
public class Category {
    private int categoryId;
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryId
     * @param categoryName
     */
    public Category(int categoryId, String categoryName) {
        this.categoryId=categoryId;
        this.categoryName=categoryName;
}
