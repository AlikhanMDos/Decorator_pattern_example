
// Concrete Coffee implementation
class SimpleCoffee extends Coffee {
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
