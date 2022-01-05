package mezz.jei.render;

import net.minecraft.client.renderer.Rect2i;

public class IngredientListElementRenderer<T> {
	private static final Rect2i DEFAULT_AREA = new Rect2i(0, 0, 16, 16);

	private final T ingredient;
	private Rect2i area = DEFAULT_AREA;
	private int padding;

	public IngredientListElementRenderer(T ingredient) {
		this.ingredient = ingredient;
	}

	public void setArea(Rect2i area) {
		this.area = area;
	}

	public void setPadding(int padding) {
		this.padding = padding;
	}

	public T getIngredient() {
		return ingredient;
	}

	public Rect2i getArea() {
		return area;
	}

	public int getPadding() {
		return padding;
	}
}
