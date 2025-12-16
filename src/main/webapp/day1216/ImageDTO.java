package dto;

import java.sql.Date;
import java.util.List;

public class ImageDTO {
    
    private int imageId;         
    private int categoryId;     
    private String title;   
    private String summary;  
    private String extension;   
    private String fileUrl;      
    private String thumbnailUrl; 
    private int fileSize;        
    private int price;           
    private int views;           
    private String onSale;     
    private Date inputDate;  
    private List<String> keywords;

    public ImageDTO() {}

    public ImageDTO(int imageId, int categoryId, String title, String summary, String extension, String fileUrl,
            String thumbnailUrl, int fileSize, int price, int views, String onSale, Date inputDate,
            List<String> keywords) {
        this.imageId = imageId;
        this.categoryId = categoryId;
        this.title = title;
        this.summary = summary;
        this.extension = extension;
        this.fileUrl = fileUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.fileSize = fileSize;
        this.price = price;
        this.views = views;
        this.onSale = onSale;
        this.inputDate = inputDate;
        this.keywords = keywords;
    }

    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getFileUrl() {
        return fileUrl;
    }
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
    public int getFileSize() {
        return fileSize;
    }
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public String getOnSale() {
        return onSale;
    }
    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }
    public Date getInputDate() {
        return inputDate;
    }
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    
    public List<String> getKeywords() {
        return keywords;
    }
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "ImageDTO [imageId=" + imageId + ", title=" + title + ", price=" + price + ", keywords=" + keywords + "]";
    }
}