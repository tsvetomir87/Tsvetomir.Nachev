package pizza;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        Validator.validateDoughWeight(weight);
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        Validator.validateFlourType(flourType);
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        Validator.validateBakingTechnique(bakingTechnique);
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        double calories = this.weight * 2;

        if (this.flourType.equalsIgnoreCase("White")) {
            calories *= 1.5;
        }else if (this.flourType.equalsIgnoreCase("Wholegrain")){
            calories *= 1.0;
        }

        if (this.bakingTechnique.equalsIgnoreCase("Crispy")) {
            calories *= 0.9;
        } else if (this.bakingTechnique.equalsIgnoreCase("Chewy")) {
            calories *= 1.1;
        }else if (this.bakingTechnique.equalsIgnoreCase("Homemade")){
            calories *= 1.0;
        }

        return calories;
    }

}
