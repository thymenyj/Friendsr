public class Friend implements Serializable {
        private String name, bio;
        private int drawableId;

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public float getRating() {
        return rating;
    }

    private float rating;
    }
}
