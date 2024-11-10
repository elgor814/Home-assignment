public class Bowl {
    private int foodAmount; // еда в миске

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean eat(int food) {
        if (foodAmount >= food) {
            foodAmount -= food;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int foodAdd) {
        foodAmount += foodAdd;
    }

    public int getFoodAmount() {
        System.out.println("Теперь в миске " + foodAmount + " единиц еды");
        return foodAmount;
    }
}
