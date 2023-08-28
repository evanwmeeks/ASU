class Restaurant {
  private String name;
  private int rating;

  public Restaurant() {
    this.name = "no name";
    this.rating = 0;
  }

  public Restaurant(String initName, int initRating) {
    this.name = initName;
    this.rating = initRating;
    
  }

  public static void main(String[] args) {
   Restaurant fastFood = new Restaurant("Taco Bell", 3);
  }
  }
}