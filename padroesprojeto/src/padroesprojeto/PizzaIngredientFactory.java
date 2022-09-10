package padroesprojeto;

public abstract class PizzaIngredientFactory {

	abstract void create_dough();//produz a massa
	abstract void create_clams(); //produz o mexilhão
	abstract void create_sauce(); //produz o queijo
	abstract void create_cheese(); //produz o molho
}
