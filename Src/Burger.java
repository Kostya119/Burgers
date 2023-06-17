public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger() {
        this.bun = "булочка";
        this.meat = "мясо";
        this.cheese = "сыр";
        this.greens = "зелень";
        this.mayo = "майонез";
        System.out.println("Обычный бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

    public Burger(boolean withoutMayo) {
        this.bun = "булочка";
        this.meat = "мясо";
        this.cheese = "сыр";
        this.greens = "зелень";
        System.out.println("Диетический бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(int doubleMeat) {
        this.bun = "булочка";
        this.meat = "мясо (двойной порцией)";
        this.cheese = "сыр";
        this.greens = "зелень";
        this.mayo = "майонез";
        System.out.println("Бургер с двойным мясом: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }
}