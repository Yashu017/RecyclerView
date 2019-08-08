package model;

public class ListItem {
    private String name;
    private String description;
    private String review;

    public ListItem(String name, String description,String review) {
        this.name = name;
        this.description = description;
        this.review=review;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
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


}

